public class Balon {
    private String color;
    private char tamanio;
    private String material;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getTamanio() {
        return tamanio;
    }

    public void setTamanio(char tamanio) {
        this.tamanio = tamanio;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "Balon{ " +
                "Color='" + color + '\'' +
                ", Tamaño=" + tamanio +
                ", Material='" + material + '\'' +
                '}';
    }
}
