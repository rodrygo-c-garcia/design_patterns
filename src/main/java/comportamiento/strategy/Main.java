package comportamiento.strategy;

import comportamiento.strategy.antivirus.AntivirusAvanzado;
import comportamiento.strategy.antivirus.AntivirusSimple;

public class Main {
    public static void main(String[] args) {
        Contexto contexto = new Contexto(new AntivirusAvanzado());
        contexto.ejecutar();
    }
}
