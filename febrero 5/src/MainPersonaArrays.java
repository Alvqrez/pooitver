import java.util.ArrayList;
import java.util.Scanner;

public class MainPersonaArrays {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList();
        Scanner input = new Scanner(System.in);

        String frase="";

        System.out.println("Escribe quit para salir");
        while (true){
            System.out.println("Dame una frase:");
            frase = input.nextLine();

            if (frase.equals("quit"))
                break;
            else{
                lista.add(frase);
            }
        }

        for (String s: lista){
            System.out.println(s);
        }

/*
        String frase = "Feliz San Valentine";
        lista.add(frase);
//La variable cambia, pero vas guardandolas en "lista"
        frase="Que reciban muchos apapachos";
        lista.add(frase);
        frase="Hoy sera un dia maravilloso.. ";

        System.out.println(frase);
        System.out.println(lista.get(0));
        System.out.println(lista.get(1));

        if (lista.contains(frase))
            System.out.println("Tristemente asi será");
        else
            System.out.println("Eres afortunado");

        System.out.println(lista.size());*/

    }



}
