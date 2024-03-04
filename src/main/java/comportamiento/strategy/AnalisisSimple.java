package comportamiento.strategy;

public abstract class AnalisisSimple implements IEstrategia{
    @Override
    public void analizar() {
        iniciar();
        saltarZip();
        detener();
    }

    protected abstract void iniciar();
    protected abstract void saltarZip();
    protected abstract void detener();
}
