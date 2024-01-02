package creacionales.abstract_factory.factoryREST;

import creacionales.abstract_factory.IFabricaAbstracta;
import creacionales.abstract_factory.factoryBD.IConexionBD;

public class ConexionFabricaREST implements IFabricaAbstracta {
    @Override
    public IConexionBD getBD(String motor) {
        return null;
    }

    @Override
    public IConexionREST getREST(String area) {
        if(area == null){
            return new ConexionRESTNoArea();
        } else if(area.equalsIgnoreCase("COMPRAS")){
            return new ConexionRESTCompras();
        } else if (area.equalsIgnoreCase("VENTAS")){
            return new ConexionRESTVentas();
        }
        return new ConexionRESTNoArea();
    }
}
