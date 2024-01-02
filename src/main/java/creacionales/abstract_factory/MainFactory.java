package creacionales.abstract_factory;

public class MainFactory {
    public static void main(String[] args) {
        ConexionFabrica fabrica = new ConexionFabrica();
        IConexion conexion1 = fabrica.getConexion("ORACLE");
        conexion1.conectar();
        conexion1.desconectar();

        IConexion conexion2 = fabrica.getConexion("MYSQL");
        conexion2.conectar();
        conexion2.desconectar();

        IConexion conexion3 = fabrica.getConexion("POSTGRE");
        conexion3.conectar();
        conexion3.desconectar();
    }
}
