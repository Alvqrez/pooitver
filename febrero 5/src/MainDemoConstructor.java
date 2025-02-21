public class MainDemoConstructor {
    public static void main(String[] args) {
        // Aqui estas invocando al constructor
        DemoConstructor_01 bob = new DemoConstructor_01();
        System.out.println(bob.atributo1);
        bob.atributo1 = "Nuevo valor";
        System.out.println(bob.atributo1);

        DemoConstructor_01 chalan = new DemoConstructor_01("Este es mi valor");
        System.out.println(chalan.atributo1);

        DemoConstructor_01 maistro = new DemoConstructor_01(20.5, "Holaaa");


        /*
        Alumno r = new alumno("Rebeca", 18, "E2450292", "Segundo");


       Y ESTO YA NO SERIA NECESARIO:
       r.nombre="Rebeca"
       r.edad="18";
       r.matricula="E2913991";
       etc.
         */
    }

}
