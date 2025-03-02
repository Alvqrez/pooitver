import java.util.Scanner;

public class NumALetra {
    // El "static" me lo recomendo la IDE, descubrí que si no lo pongo, no funciona :(
    public static String[] unidades = {"", "Uno", "Dos", "Tres", "Cuatro", "Cinco", "Seis", "Siete", "Ocho", "Nueve"};
    public static String[] decenas1 = {"Diez", "Once", "Doce", "Trece", "Catorce", "Quince", "Dieciséis", "Diecisiete", "Dieciocho", "Diecinueve"};
    public static String[] decenas2 = {"", "Diez", "Veinte", "Treinta", "Cuarenta", "Cincuenta", "Sesenta", "Setenta", "Ochenta", "Noventa"};
    public static String[] centenas = {"", "Ciento", "Doscientos", "Trescientos", "Cuatrocientos", "Quinientos", "Seiscientos", "Setecientos", "Ochocientos", "Novecientos"};

    public static String separar(int num){
        if(num == 0){
            return "cero";
        }
        return convertirLetras(num).trim(); //Aquí los separa.
    }

    public static String convertirLetras(int num){
        if(num < 10){
            return unidades[num];
        }else if (num < 20){
            return decenas1[num-10];
        }else if (num < 100){
            String res = decenas2[num/10];
            if(num%10 != 0){
                res += " y " + unidades[num%10];
            }
            return res;
        }else if (num < 1000){
            String res1 = centenas[num/100];
            if(num%100 != 0){
                res1 += " " + convertirLetras(num%100);
            }
            return res1;
        }else if(num < 10000){
            String res2;
            if(num/1000 == 1){
                res2 = "Mil";
            }else{
                res2 = convertirLetras(num/1000) + " Mil";
            }
            if(num % 1000 != 0){
                res2 += " " + convertirLetras(num%1000);
            }
            return res2;
        }
        return "Excede los limites.";
    }

    public static void main(String[] args) {
        int num;
        int r = 0;
        Scanner sc = new Scanner(System.in);

        do{
        System.out.println("Ingresa cualquier número menor a diez mil: ");
        num = sc.nextInt();
        System.out.println(num + " en letras es: " + separar(num));
        System.out.println("Deseas colocar otro número? 1=Si / 0=No");
        r = sc.nextInt();
    }while(r==1);
    }
}
