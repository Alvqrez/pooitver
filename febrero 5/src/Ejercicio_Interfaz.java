public class Ejercicio_Interfaz {
    public static void main(String[] args) {
        Nodo n1 = new Nodo();

        n1.nombre = "X";
        n1.valor = 1;

        Nodo n2 = new Nodo();
        n2.nombre = "Y";
        n2.valor = 2;

        n1.conectarDerecha(n2);
        System.out.println();
    }
}

interface conectable{
    public void conectarDerecha(Nodo valor);
    public void conectarIzquierda(Nodo valor);
}

class Nodo implements conectable{
    String nombre;
    int valor;
    Nodo derecha;
    Nodo izquierda;

    @Override
    public void conectarDerecha(Nodo n) {
        this.derecha = n;
        n.izquierda = this;
    }

    @Override
    public void conectarIzquierda(Nodo n) {
        this.izquierda = n;
        n.derecha = this;
    }
}

