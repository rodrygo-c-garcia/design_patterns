package comportamiento.strategy;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Contexto {
    private IEstrategia estrategia;

    public Contexto(IEstrategia estrategia) {
        this.estrategia = estrategia;
    }

    public void ejecutar() {
        estrategia.analizar();
    }
}
