import java.util.ArrayList;

class Vehiculo {
    String marca;
    String modelo;
    String año;
    String motor;
    String no_ruedas;
    String tipo_combustible;
    String matricula;
}

class Motocicleta extends Vehiculo{
    int cc;
}

class Coche extends Vehiculo{
    int no_puerta;
}
public class Algo {
    public static void main(String[] args) {
        ArrayList<Vehiculo> motos = new ArrayList<>();
        Motocicleta motito = new Motocicleta();
        Coche cochecito = new Coche();
        motos.add(motito);
        motos.add(cochecito);
    }
}


