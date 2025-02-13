public class MainBoleta {
    public static void main(String[] args) {

        BoletaDeCalificacion B1 = new BoletaDeCalificacion();
        B1.nombre="Leonardo";
        B1.matricula= 24022337;
        B1.CalifCalculo=10;
        B1.CalifPOO= 10;
        B1.CalifAlgebra=10;
        B1.CalifProbabilidad=10;
        B1.CalifExtra=10;
        B1.CalifQuimica=10;
        B1.CalifContabilidad=10;
        System.out.println(B1.obtener_datos());

        BoletaDeCalificacion B2 = new BoletaDeCalificacion();
        B2.nombre="Richard";
        B2.matricula= 24030718;
        B2.CalifCalculo=10;
        B2.CalifPOO= 9;
        B2.CalifAlgebra=10;
        B2.CalifProbabilidad=8;
        B2.CalifExtra=7;
        B2.CalifQuimica=9;
        B2.CalifContabilidad=7;
        System.out.println(B2.obtener_datos());

        BoletaDeCalificacion B3 = new BoletaDeCalificacion();
        B3.nombre="Rebeca";
        B3.matricula= 24078129;
        B3.CalifCalculo=7;
        B3.CalifPOO= 9;
        B3.CalifAlgebra=6;
        B3.CalifProbabilidad=8;
        B3.CalifExtra=9;
        B3.CalifQuimica=10;
        B3.CalifContabilidad=10;
        System.out.println(B3.obtener_datos());
    }
}
