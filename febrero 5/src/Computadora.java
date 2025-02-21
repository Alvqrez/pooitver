public class Computadora {
    private String modelprocesador;
    private String modelteclado;
    private String modelplaca;
    private String modelmonitor;
    private boolean InternetAccess;


    public String getModelprocesador() {
        return modelprocesador;
    }

    public void setModelprocesador(String modelprocesador) {
        this.modelprocesador = modelprocesador;
    }

    public String getModelteclado() {
        return modelteclado;
    }

    public void setModelteclado(String modelteclado) {
        this.modelteclado = modelteclado;
    }

    public String getModelplaca() {
        return modelplaca;
    }

    public void setModelplaca(String modelplaca) {
        this.modelplaca = modelplaca;
    }

    public String getModelmonitor() {
        return modelmonitor;
    }

    public void setModelmonitor(String modelmonitor) {
        this.modelmonitor = modelmonitor;
    }

    public boolean isInternetAccess() {
        return InternetAccess;
    }

    public void setInternetAccess(boolean internetAccess) {
        InternetAccess = internetAccess;
    }

    @Override
    public String toString() {
        return "Computadora{ " +
                "ModelProcesador='" + modelprocesador + '\'' +
                ", ModelTeclado='" + modelteclado + '\'' +
                ", ModelPlaca='" + modelplaca + '\'' +
                ", ModelMonitor='" + modelmonitor + '\'' +
                ", InternetAccess=" + InternetAccess +
                '}';
    }
}
