public class Profesionista {
    private String nombre;
    private int edad;
    private String profesion;
    private int antiguedadDeChamba;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public int getAntiguedadDeChamba() {
        return antiguedadDeChamba;
    }

    public void setAntiguedadDeChamba(int antiguedadDeChamba) {
        this.antiguedadDeChamba = antiguedadDeChamba;
    }

    @Override
    public String toString() {
        return "Profesionista{ " +
                "Nombre='" + nombre + '\'' +
                ", Edad=" + edad +
                ", Profesion='" + profesion + '\'' +
                ", AntiguedadDeChamba=" + antiguedadDeChamba +
                '}';
    }
}
