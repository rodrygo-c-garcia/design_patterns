package estructurales.decorator;

public abstract class CuentaDecorator implements ICuentaBancaria{
    protected ICuentaBancaria cuentaDecorada;

    public CuentaDecorator(ICuentaBancaria cuentaDecorada) {
        this.cuentaDecorada = cuentaDecorada;
    }
    @Override
    public void abrirCuenta(Cuenta c) {
        this.cuentaDecorada.abrirCuenta(c);
    }
}
