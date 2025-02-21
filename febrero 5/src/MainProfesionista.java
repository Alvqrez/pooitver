public class MainProfesionista {
    public static void main(String[] args) {
        Profesionista PF1 = new Profesionista();

        PF1.setNombre("Leonardo");
        PF1.setEdad(18);
        PF1.setAntiguedadDeChamba(4);
        PF1.setProfesion("Ingenieria en Sistemas");
        System.out.println(PF1);

        Profesionista PF2 = new Profesionista();

        PF2.setNombre("Rebeca");
        PF2.setEdad(19);
        PF2.setAntiguedadDeChamba(1);
        PF2.setProfesion("Ingenieria en Sistemas");
        System.out.println(PF2);
    }
}
