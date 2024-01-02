package creacionales.abstract_factory;

import creacionales.abstract_factory.factoryBD.ConexionFabricaBD;
import creacionales.abstract_factory.factoryREST.ConexionFabricaREST;

public class FabricaProductor {
    public static IFabricaAbstracta getFactory(String tipoFabrica) {
        if (tipoFabrica.equalsIgnoreCase("BD")) {
            return new ConexionFabricaBD();
        } else if (tipoFabrica.equalsIgnoreCase("REST")) {
            return new ConexionFabricaREST();
        }
        return null;
    }
}
