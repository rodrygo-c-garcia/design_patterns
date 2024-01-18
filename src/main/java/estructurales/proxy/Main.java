package estructurales.proxy;

public class Main {
    public static void main(String[] args) {
        Cuenta cuenta = new Cuenta(1, "Juan Perez", 100);
        ICuenta cuentaProxy = new CuentaProxy(new CuentaBanco1());

        cuentaProxy.mostrarSaldo(cuenta);

        cuenta = cuentaProxy.depositarDinero(cuenta, 50);
        cuenta = cuentaProxy.retirarDinero(cuenta, 30);
        cuentaProxy.mostrarSaldo(cuenta);
    }
}
