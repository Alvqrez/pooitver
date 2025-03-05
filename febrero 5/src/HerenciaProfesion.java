public class HerenciaProfesion extends Persona {
    String profesion;

    @Override
    public String toString() {
        return "HerenciaProfesion{" +
                "profesion='" + profesion + '\'' +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", estatura=" + estatura +
                ", peso=" + peso +
                ", genero='" + genero + '\'' +
                '}';
    }

    public static void main(String[] args) {
        HerenciaProfesion p1 = new HerenciaProfesion();
        p1.edad = 22;
        p1.profesion = "Sistemas";
        p1.nombre = "Leonardo";

        System.out.println(p1);

    }
}