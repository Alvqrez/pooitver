public class BoletaDeCalificacion {
    String nombre;
    int matricula;
    int CalifCalculo;
    int CalifPOO;
    int CalifAlgebra;
    int CalifProbabilidad;
    int CalifExtra;
    int CalifQuimica;
    int CalifContabilidad;

    String obtener_datos(){
        String cad="";
        cad=cad+"Boleta de Calificaciones: {nombre: " +nombre+ "; ";
        cad=cad+"Matricula: " +matricula+ "; ";
        cad=cad+"Calculo: " +CalifCalculo+ "; ";
        cad=cad+"POO: " +CalifPOO+ "; ";
        cad=cad+"Algebra: " +CalifAlgebra+ "; ";
        cad=cad+"Probabilidad: " +CalifProbabilidad+ "; ";
        cad=cad+"Extracurricular: " +CalifExtra+ "; ";
        cad=cad+"Quimica: " +CalifQuimica+ "; ";
        cad=cad+"Contabilidad: " +CalifContabilidad+ "} ";

        return cad;
    }

}
