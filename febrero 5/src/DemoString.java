public class DemoString {
    public static void main(String[] args) {

        /*
        String nombre = new String("Shakira");
        System.out.println(nombre.charAt(0));
        System.out.println(nombre.length());
        System.out.println(nombre.toUpperCase());
        System.out.println(nombre.toLowerCase());
        nombre = nombre.toUpperCase();
        System.out.println(nombre);

        System.out.println(nombre.equals("Nicki Nicole"));
        System.out.println(nombre.equals("SHAKIRA"));*/

        String frase = "El- aMoR -se-  siente-  en el- aire.     ";
        String[] separacion = frase.split(" ");
        for (String s: separacion){
            System.out.println(s.trim());
        }

        for (int i = 0; i < separacion.length; i++) {
            if(separacion[i].equals("aMoR")){
                System.out.println("Si esta la palabra aMoR.");
            }

        }
    }
}
