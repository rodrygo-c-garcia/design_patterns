package comportamiento.strategy.antivirus;

import comportamiento.strategy.AnalisisAvanzado;

public class AntivirusAvanzado extends AnalisisAvanzado {
    @Override
    protected void iniciar() {
        System.out.println("Antivirus Avanzado: Iniciando análisis avanzado");
    }

    @Override
    protected void analizarMemoria() {
        try{
            System.out.println("Analizando Memoria RAM...");
            Thread.sleep(3000);
        } catch (InterruptedException e){
            throw new RuntimeException(e);
        }
    }

    @Override
    protected void analizarKeyLoggers() {
        try{
            System.out.println("Analizando KeyLoggers...");
            Thread.sleep(3000);
        } catch (InterruptedException e){
            throw new RuntimeException(e);
        }
    }

    @Override
    protected void analizarRootKits() {
        try{
            System.out.println("Analizando RootKits...");
            Thread.sleep(3000);
        } catch (InterruptedException e){
            throw new RuntimeException(e);
        }
    }

    @Override
    protected void descomprimirZip() {
        try{
            System.out.println("Analizando Archivos ZIP...");
            Thread.sleep(3000);
        } catch (InterruptedException e){
            throw new RuntimeException(e);
        }
    }

    @Override
    protected void detener() {
        System.out.println("Antivirus Avanzado: Análisis avanzado finalizado");
    }
}
