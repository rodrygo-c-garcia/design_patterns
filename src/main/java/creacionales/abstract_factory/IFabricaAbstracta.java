package creacionales.abstract_factory;

import creacionales.abstract_factory.factoryBD.IConexionBD;
import creacionales.abstract_factory.factoryREST.IConexionREST;

public interface IFabricaAbstracta {
    IConexionBD getBD(String motor);
    IConexionREST getREST(String area);
}
