import java.util.ArrayList;
import java.util.Scanner;

public class Main280325 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Alumno n1 = new Alumno();
        System.out.println("Nombre: ");
        n1.nombre = sc.nextLine();
        System.out.println("Matricula: ");
        n1.matricula = sc.nextInt();
        System.out.println("¿Esta presente?: 1=Si  0=No");
        int x = sc.nextInt();
        if(x == 1){
            n1.presente=true;
        }else {
            n1.presente = false;
        }

    }
}

class Alumno extends ListaAsistencia{
    static String nombre;
    static int matricula;

    @Override
    public String toString() {
        return "Alumno{" +
                "Nombre= " + nombre +
                "Matricula= " + matricula +
                "Presente= " + presente +
                '}';
    }
}

class Asistencia{
    boolean presente;
}

class ListaAsistencia extends Asistencia{
    ArrayList<Alumno> lista = new ArrayList();
}