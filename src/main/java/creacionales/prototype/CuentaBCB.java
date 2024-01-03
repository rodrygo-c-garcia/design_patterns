package creacionales.prototype;

import lombok.Data;

@Data
public class CuentaBCB implements ICuenta{
    private String tipo;
    private double monto;

    public CuentaBCB() {
        tipo = "Ahorros";
    }
    @Override
    public ICuenta clonar() throws CloneNotSupportedException{
        return (CuentaBCB) super.clone();
    }
}
