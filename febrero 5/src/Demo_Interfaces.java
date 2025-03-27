 // Heredar NumeroConcreto de Numero, así, quitando la abstracción
    // Al ser NumeroConcreto no abstracto, necesitas obligatoriamente implementar los metodos
    // es decir, escribir el codigo de todos los metodos: sumar, restar:
    //public void funcion: sumar (Clase: Numero Variable creada: otroNumero)
public class Demo_Interfaces {
        public static void main(String[] args) {
            NumeroConcreto n1 = new NumeroConcreto();
            n1.valor=199;

            NumeroConcreto n2 = new NumeroConcreto();
            n2.valor=200;

            n1.sumar(n2);
            System.out.println(n1.valor);
        }
}

interface operaciones{
    public void sumar(Numero otroNumero);
    public void restar(Numero otroNumero);
    public void multiplicar(Numero otroNumero);
    public void divEntera(Numero otroNumero);
}

abstract class Numero implements operaciones{
    int valor;
}

class NumeroConcreto extends Numero{

    @Override
    public void sumar(Numero otroNumero) {
        this.valor =this.valor+otroNumero.valor;
    }

    @Override
    public void restar(Numero otroNumero) {
        this.valor= this.valor-otroNumero.valor;
    }

    @Override
    public void multiplicar(Numero otroNumero) {
        this.valor= this.valor*otroNumero.valor;
    }

    @Override
    public void divEntera(Numero otroNumero) {
        this.valor= (int)(this.valor/otroNumero.valor);
    }
}