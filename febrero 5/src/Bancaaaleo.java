public class Bancaaaleo {
    public static void main(String[] args) {
        Cuenta c1 = new Cuenta();
        c1.depositar(2000);
        c1.retirar(500);

        System.out.println(c1.saldo);

        CuentaCredito miCredito = new CuentaCredito(5000, 0.24);
        miCredito.usarCredito(3500);
        System.out.println(miCredito.saldo);
        miCredito.corte();
        System.out.println(miCredito.aPagar);
    }
}
