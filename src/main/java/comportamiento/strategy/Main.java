package comportamiento.strategy;

import comportamiento.strategy.antivirus.AntivirusAvanzado;
import comportamiento.strategy.antivirus.AntivirusSimple;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Contexto contexto = new Contexto(new AntivirusAvanzado());
        contexto.ejecutar();

        // cambiamos la estrategia en tiempo real
        System.out.println("....Cambiando la estrategia....");
        Thread.sleep(2000);
        contexto.setEstrategia(new AntivirusSimple());
        contexto.ejecutar();
    }
}
