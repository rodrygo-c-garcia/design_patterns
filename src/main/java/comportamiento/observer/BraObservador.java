package comportamiento.observer;

public class BraObservador extends Observador{
    private double valorCambio = 5.35;

    public BraObservador(Subject sujeto){
        this.sujeto = sujeto;
        this.sujeto.agregar(this);
    }
    @Override
    public void actualizar() {
        System.out.println("BRL: " + (sujeto.getEstado() * 5.35));
    }
}
