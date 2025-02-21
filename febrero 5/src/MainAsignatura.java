public class MainAsignatura {
    public static void main(String[] args) {
        Asignatura POO = new Asignatura();

        POO.setNombre("Programación Orientada a Objetos");
        POO.setClave("AED-1286");
        POO.setCreditos(5);
        POO.setTeoricas(2);
        POO.setPracticas(3);

        System.out.println(POO);

    }
}
