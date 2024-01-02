package creacionales.abstract_factory.factoryBD;

import creacionales.abstract_factory.IFabricaAbstracta;
import creacionales.abstract_factory.factoryREST.IConexionREST;

public class ConexionFabricaBD implements IFabricaAbstracta {
    @Override
    public IConexionBD getBD(String motor){
        if(motor == null){
            return new ConexionVacia();
        }
        if(motor.equalsIgnoreCase("MYSQL")){
            return new ConexionMySQL("mysql");
        } else if(motor.equalsIgnoreCase("ORACLE")){
            return new ConexionOracle();
        } else if(motor.equalsIgnoreCase("POSTGRE")){
            return new ConexionPostgreSQL();
        }
        return new ConexionVacia();
    }

    @Override
    public IConexionREST getREST(String area) {
        return null;
    }
}
