public class Manzana {
    private String color;
    private String tamanio;
    private String tipo;


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Manzana{" +
                "Color='" + color + '\'' +
                ", Tamaño='" + tamanio + '\'' +
                ", Tipo='" + tipo + '\'' +
                '}';
    }
}
