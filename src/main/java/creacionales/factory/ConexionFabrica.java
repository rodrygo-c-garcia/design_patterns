package creacionales.factory;

public class ConexionFabrica {
    public IConexion getConexion(String motor){
        if(motor == null){
            return new ConexionVacia();
        }
        if(motor.equalsIgnoreCase("MYSQL")){
            return new ConexionMySQL();
        } else if(motor.equalsIgnoreCase("ORACLE")){
            return new ConexionOracle();
        } else if(motor.equalsIgnoreCase("POSTGRE")){
            return new ConexionPostgreSQL();
        }
        return new ConexionVacia();
    }
}
