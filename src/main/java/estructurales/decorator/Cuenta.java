package estructurales.decorator;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Cuenta {
    private int id;
    private String cliente;

    public Cuenta(int id, String cliente) {
        this.id = id;
        this.cliente = cliente;
    }
}
