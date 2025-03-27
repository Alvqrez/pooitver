public class Cuenta {
    double saldo;

    public void depositar(double cantidad) {
        this.saldo = this.saldo + cantidad;
    }

    public boolean retirar(double cantidad) {
        if (saldo >= cantidad) {
            this.saldo = this.saldo - cantidad;
            return true;
        } else {
            return false;
        }
    }
}

    class CuentaCredito extends Cuenta{

        double montoCredito;
        double interes;
        double aPagar;

        public CuentaCredito(double credito, double interes){
            this.montoCredito = credito;
            this.saldo = credito;
            this.interes = interes;
        }

        public void corte(){
            double deuda = montoCredito - this.saldo + aPagar;
            double intereses =interes/12*deuda;
            aPagar=deuda+intereses;
        }

        public void pagarDeuda(double cantidad){
            depositar(cantidad);
            if(saldo>=montoCredito)
                saldo = montoCredito;
            aPagar=aPagar-cantidad;

        }

        public void usarCredito(double cantidad){
            retirar(cantidad);
        }
    }

