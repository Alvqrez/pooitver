public class DemoConstructor_01 {
    String atributo1;
    double atributo2;
    String atributo3;

    public DemoConstructor_01(){
        System.out.println("Mi primer constructor");
        atributo1 = "Valor del atributo 1";
    }

    public DemoConstructor_01(String valor){                 //(String)  HUELLAS DE CONSTRUCTOR
        atributo1=valor;
    }

    public DemoConstructor_01(double valor1, String valor2){ // (double, String) LOS RECIBEN EN ORDEN
        atributo2=valor1;
        atributo1=valor2;
    }

    public DemoConstructor_01(double valor1){               // (double) NO PUEDE HABER DOS CONTRUCTORES CON LA
                                                            //MISMA HUELLA.
        atributo2=valor1;
    }

    public DemoConstructor_01(String valor2, double valor1){ // (double, String) LOS RECIBEN EN ORDEN
        atributo2=valor1;
        atributo1=valor2;
    }

    public DemoConstructor_01(String valor, String valor2) {
        atributo3 = valor;
        atributo1 = valor2;
    }
}
