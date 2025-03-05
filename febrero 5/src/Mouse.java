public class Mouse {
    private String marca;
    private int precio;
    private int dpi;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getDpi() {
        return dpi;
    }

    public void setDpi(int dpi) {
        this.dpi = dpi;
    }

    //Constructores
    public Mouse(String marca) {
        this.marca = marca;
    }

    public Mouse(String marca, int dpi) {
        this.marca = marca;
        this.dpi = dpi;
    }

    public Mouse(int precio, String marca) {
        this.precio = precio;
        this.marca = marca;
    }

    public Mouse(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Mouse{ " +
                "Marca='" + marca + '\'' +
                ", Precio=" + precio +
                ", Dpi=" + dpi +
                '}';
    }
}
