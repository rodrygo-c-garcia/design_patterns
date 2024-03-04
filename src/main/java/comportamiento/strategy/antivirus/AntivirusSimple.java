package comportamiento.strategy.antivirus;

import comportamiento.strategy.AnalisisSimple;

public class AntivirusSimple extends AnalisisSimple {

    @Override
    protected void iniciar() {
        System.out.println("Antivirus Simple: Iniciando análisis simple");
    }

    @Override
    protected void saltarZip() {
        try {
            System.out.println("Analizando...");
            Thread.sleep(3000);
            System.out.println("No se pudo analizar los archivos comprimidos.");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    protected void detener() {
        System.out.println("Antivirus Simple: Análisis simple finalizado");
    }
}
