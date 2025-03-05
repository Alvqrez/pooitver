public class MainMouse {
    public static void main(String[] args) {
        Mouse m1 = new Mouse("Logitech");
        Mouse m2 = new Mouse("Dell", 400);
        Mouse m3 = new Mouse(300, "Acer");
        Mouse m4 = new Mouse(150);

        System.out.println(m1);
        System.out.println(m2);
        System.out.println(m3);
        System.out.println(m4);
    }
}
