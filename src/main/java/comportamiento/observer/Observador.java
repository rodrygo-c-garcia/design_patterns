package comportamiento.observer;

public abstract class Observador {
    protected Subject sujeto;
    public abstract void actualizar();
}
