public class MainComputadora {
    public static void main(String[] args) {
        Computadora CP1 = new Computadora();

        CP1.setModelmonitor("Acer");
        CP1.setModelplaca("AKSJK1");
        CP1.setInternetAccess(true);
        CP1.setModelprocesador("AMD Ryzen 5");
        CP1.setModelteclado("Acer 100%");
        System.out.println(CP1);

        Computadora CP2 = new Computadora();

        CP2.setModelmonitor("Toshiba");
        CP2.setModelplaca("IMSS304K");
        CP2.setInternetAccess(false);
        CP2.setModelprocesador("Intel i3 5400k");
        CP2.setModelteclado("Acer 100%");
        System.out.println(CP2);
    }
}
