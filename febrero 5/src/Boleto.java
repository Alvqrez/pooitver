public class Boleto {
    private int costo;
    private int noDelBoleto;
    private String nombredelcomprador;
    private String teldelcomprador;

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public int getNoDelBoleto() {
        return noDelBoleto;
    }

    public void setNoDelBoleto(int noDelBoleto) {
        this.noDelBoleto = noDelBoleto;
    }

    public String getNombredelcomprador() {
        return nombredelcomprador;
    }

    public void setNombredelcomprador(String nombredelcomprador) {
        this.nombredelcomprador = nombredelcomprador;
    }

    public String getTeldelcomprador() {
        return teldelcomprador;
    }

    public void setTeldelcomprador(String teldelcomprador) {
        this.teldelcomprador = teldelcomprador;
    }

    @Override
    public String toString() {
        return "Boleto{ " +
                "Costo=" + costo +
                ", Número del Boleto=" + noDelBoleto +
                ", NombreDelComprador='" + nombredelcomprador + '\'' +
                ", TelDelComprador=" + teldelcomprador +
                '}';
    }
}
