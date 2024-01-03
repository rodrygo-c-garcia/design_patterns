package creacionales.prototype;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        CuentaBCB cuentaAhorro = new CuentaBCB();
        cuentaAhorro.setMonto(200);
        CuentaBCB cuentaAhorroClonada = (CuentaBCB) cuentaAhorro.clonar(); // aquí se hace el clonado de la cuenta
        System.out.println(cuentaAhorro);
        System.out.println(cuentaAhorroClonada.getMonto());

    }
}
