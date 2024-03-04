package comportamiento.strategy;

public abstract class AnalisisAvanzado implements IEstrategia{
    @Override
    public void analizar() {
        iniciar();
        analizarMemoria();
        analizarKeyLoggers();
        analizarRootKits();
        descomprimirZip();
        detener();
    }

    protected abstract void iniciar();

    protected abstract void analizarMemoria();

    protected abstract void analizarKeyLoggers();

    protected abstract void analizarRootKits();

    protected abstract void descomprimirZip();
    protected abstract void detener();
}
