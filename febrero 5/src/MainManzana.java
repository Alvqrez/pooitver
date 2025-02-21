public class MainManzana {
    public static void main(String[] args) {
        Manzana M1 = new Manzana();

        M1.setColor("Amarilla");
        M1.setTamanio("Mediana");
        M1.setTipo("Cox");
        System.out.println(M1);

        Manzana M2 = new Manzana();

        M2.setColor("Verde");
        M2.setTamanio("Grande");
        M2.setTipo("Granny Smith");
        System.out.println(M2);
    }
}
