public class MainBalon {
    public static void main(String[] args) {
        Balon B1 = new Balon();

        B1.setColor("Blanco");
        B1.setTamanio('S');
        B1.setMaterial("Cuero");
        System.out.println(B1);

        Balon B2 = new Balon();

        B2.setColor("Azul");
        B2.setTamanio('G');
        B2.setMaterial("Plastico");
        System.out.println(B2);
    }
}
