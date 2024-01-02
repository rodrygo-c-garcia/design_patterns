package creacionales.abstract_factory;

import creacionales.abstract_factory.factoryBD.ConexionFabricaBD;
import creacionales.abstract_factory.factoryBD.IConexionBD;
import creacionales.abstract_factory.factoryREST.ConexionFabricaREST;
import creacionales.abstract_factory.factoryREST.IConexionREST;

public class MainFactory {
    public static void main(String[] args) {
        IFabricaAbstracta fabricaBD = FabricaProductor.getFactory("BD");
        IConexionBD conexionBD1 = fabricaBD.getBD("MYSQL");
        conexionBD1.conectar();
        conexionBD1.desconectar();

        IFabricaAbstracta fabricaREST = FabricaProductor.getFactory("REST");
        IConexionREST conexionREST1 = fabricaREST.getREST("COMPRAS");
        conexionREST1.leerURL("https://www.youtube.com/watch?v=9jI-z9QN6g8");
    }
}
