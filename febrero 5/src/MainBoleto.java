public class MainBoleto {
    public static void main(String[] args) {
        Boleto Bol1 = new Boleto();

        Bol1.setCosto(40);
        Bol1.setNoDelBoleto(1);
        Bol1.setNombredelcomprador("Leonardo Alvarez");
        Bol1.setTeldelcomprador("2295278219");
        System.out.println(Bol1);

        Boleto Bol2 = new Boleto();

        Bol2.setCosto(40);
        Bol2.setNoDelBoleto(2);
        Bol2.setNombredelcomprador("Richard");
        Bol2.setTeldelcomprador("2271279113");
        System.out.println(Bol2);
    }
}
