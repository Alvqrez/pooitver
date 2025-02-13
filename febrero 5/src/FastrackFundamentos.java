import java.util.Scanner;

public class FastrackFundamentos {
    public static void main(String[] args) {
        /*
        //Variables en Java

        int a;
        double b;
        float c;
        String d;
        boolean e;

        a=3;
        b=20.50;
        d="Esto es una cadena";
        e=true;
        String nombre = "Leonardo Alvarez";

        //Constantes

        final double PI=3.141516;

        Scanner intro = new Scanner(System.in);
        System.out.println(b);
        b = intro.nextDouble();
        System.out.println(b);


        //Condicionales, <, >, <=, >=, !=, ==
        // Operadores logicos, &&:AND, ||:OR, !:NOT
        int valor = 20;
        int calif = 82;
        if (!(valor >= 20 || calif > 85)) {
            if (valor == 20) {
                System.out.println("Es exactamente 20");
            } else {
                System.out.println("Es superior a 20");
            }
            System.out.println("aaaaaaa");
        }
        System.out.println("aaafin");


        //Condicional multiple: Switch

        int op;
        op = 4;

        switch(op){
            case 1:
                System.out.println("Vale 1");
                break;
            case 2:
                System.out.println("Vale 2");
                break;
            case 3:
                System.out.println("Vale 3");
                break;
            default:
                System.out.println("Valor no permitido");
                break;


        //Ciclos:

        Scanner input = new Scanner(System.in);
        int opcion = -1;

        for(;;){
            System.out.println("Hola");
            opcion = input.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("Tecleaste 1");
                    break;
                case 2:
                    System.out.println("Tecleaste 2");
                    break;
                case 3:
                    System.out.println("Tecleaste 3");
                    break;
                default:
                    break;
            }
            if(opcion==0)
                break;

            if(i==9){
                continue;
            }
            if(i==7){
                break;
            } // Termina el for

        int op = 20;
        while(op>10){
            System.out.println(op);
            op--;
        }


        int cent= 0;

        while(cent!=0){
            System.out.println(cent);
        }

        cent = 0;
        do{
            System.out.println("centinela en do while");
        }while(cent!=0);

        System.out.println(Sumar(3,5));
        Multiplica(6,10);
*/
        //Arreglos
        //int[] edades=           //{18,20,21,25,19,22};
        //String nombres[]={"Leo","Abraham","Rebeca"};

       /* int edades[]=new int[10];
        edades[6]= 16;
        edades[1]=20;

        System.out.println(edades[1]);

        String paises[]=new String[5];
        paises[0]="México";
        System.out.println(paises[0]);
        */

        /*for(int i=0; i<nombres.length; i++){
            System.out.println(nombres[i]);
        }
*/

        //Matrices
        /*int[][] calificaciones={{1,2,3},
                                {4,5,6},
                                {7,8,9}};

        double califPOO[][]=new double[27][6];
        califPOO[6][0]=99;

        System.out.println(califPOO[6][0]);
         */

       // System.out.println(calificaciones[0][2]);

        //Para imprimir toda la matriz o recorrerla. i = Filas (izq, der.
        // j = Columnas (arriba a abajo)
        /*for (int i = 0; i < calificaciones.length; i++) {
            for (int j = 0; j < calificaciones[0].length; j++) {
                System.out.println(calificaciones[i][j]);
            }
        }*/

        } //Main


    public static int Sumar(int a, int b) {return a+b;}

    public static void Multiplica(int x, int y){
        int res;
        res=x*y;
        System.out.println(res);
    }


    }
