package comportamiento.observer;

public class BolObservador extends Observador{
    private double valorCambio = 6.96;

    public BolObservador(Subject sujeto){
        this.sujeto = sujeto;
        this.sujeto.agregar(this);
    }
    @Override
    public void actualizar() {
        System.out.println("BOB: " + (sujeto.getEstado() * valorCambio));
    }
}
