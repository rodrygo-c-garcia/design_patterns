package estructurales.decorator;

public class Main {
    public static void main(String[] args) {
        Cuenta cliente1 = new Cuenta(1, "Juan Perez");
        ICuentaBancaria cuenta = new CuentaAhorro();
        cuenta.abrirCuenta(cliente1);

        Cuenta cliente2 = new Cuenta(2, "Maria Lopez");
        ICuentaBancaria cuenta2 = new CuentaCorriente();
        // a esta cuenta agregamos un blindaje
        ICuentaBancaria cuentaBlindada = new BlindajeDecorator(cuenta2);

        cuentaBlindada.abrirCuenta(cliente2);
    }
}
