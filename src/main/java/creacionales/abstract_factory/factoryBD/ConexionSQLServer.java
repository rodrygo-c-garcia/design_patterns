package creacionales.abstract_factory;

public class ConexionSQLServer implements IConexion {
    private String host;
    private String puerto;
    private String usuario;
    private String contrasena;

    public ConexionSQLServer() {
        this.host = "localhost";
        this.puerto = "3306";
        this.usuario = "root";
        this.contrasena = "123";
    }
    @Override
    public void conectar() {
        System.out.println("Se conectó a SQLServer");
    }

    @Override
    public void desconectar() {
        System.out.println("Se desconectó de SQLServer");
    }
}
