package creacionales.abstract_factory.factoryBD;

public class MainFactory {
    public static void main(String[] args) {
        ConexionFabricaBD fabrica = new ConexionFabricaBD();
        IConexionBD conexion1 = fabrica.getConexion("ORACLE");
        conexion1.conectar();
        conexion1.desconectar();

        IConexionBD conexion2 = fabrica.getConexion("MYSQL");
        conexion2.conectar();
        conexion2.desconectar();

        IConexionBD conexion3 = fabrica.getConexion("POSTGRE");
        conexion3.conectar();
        conexion3.desconectar();
    }
}
