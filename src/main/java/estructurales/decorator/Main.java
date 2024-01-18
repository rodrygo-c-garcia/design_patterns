package estructurales.decorator;

public class Main {
    public static void main(String[] args) {
        Cuenta cliente1 = new Cuenta(1, "Juan Perez");
        ICuentaBancaria cuenta = new CuentaAhorro();
        ICuentaBancaria cuentaBlindada = new BlindajeDecorator(cuenta);

        cuentaBlindada.abrirCuenta(cliente1);
    }
}
