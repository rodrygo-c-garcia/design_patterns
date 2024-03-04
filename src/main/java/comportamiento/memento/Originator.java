package comportamiento.memento;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Originator {
    private Juego estado;

    public Memento guardar() {
        return new Memento(estado);
    }

    public void restaurar(Memento memento) {
        this.estado = memento.getEstado();
    }
}
