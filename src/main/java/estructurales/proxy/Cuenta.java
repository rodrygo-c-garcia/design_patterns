package estructurales.proxy;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

public class Cuenta {
    private int id;
    private String usuario;
    private double saldoInicial;

    public Cuenta(int id, String usuario, double saldoInicial) {
        this.id = id;
        this.usuario = usuario;
        this.saldoInicial = saldoInicial;
    }
}
