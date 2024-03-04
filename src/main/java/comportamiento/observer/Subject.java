package comportamiento.observer;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class Subject {
    private List<Observador> observadores = new ArrayList<>();
    private int estado;

    public void setEstado(int estado){
        this.estado = estado;
        notificarTodosObservadores();
    }

    public void agregar(Observador observador){
        observadores.add(observador);
    }

    private void notificarTodosObservadores() {
        // alerta a los observadores que el estado ha cambiado
        observadores.forEach(Observador::actualizar);
    }
}
