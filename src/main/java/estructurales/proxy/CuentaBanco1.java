package estructurales.proxy;

public class CuentaBanco1 implements ICuenta{
    @Override
    public Cuenta retirarDinero(Cuenta cuenta, double monto) {
        cuenta.setSaldoInicial(cuenta.getSaldoInicial() - monto);
        System.out.println("Saldo actual: " + cuenta.getSaldoInicial());
        return cuenta;
    }

    @Override
    public Cuenta depositarDinero(Cuenta cuenta, double monto) {
        cuenta.setSaldoInicial(cuenta.getSaldoInicial() + monto);
        System.out.println("Saldo actual: " + cuenta.getSaldoInicial());
        return cuenta;
    }

    @Override
    public void mostrarSaldo(Cuenta cuenta) {
        System.out.println("Saldo actual: " + cuenta.getSaldoInicial());
    }
}
