package creacionales.factory;

public class ConexionPostgreSQL implements IConexion{
    private String host;
    private String puerto;
    private String usuario;
    private String contrasena;

    public ConexionPostgreSQL() {
        this.host = "localhost";
        this.puerto = "3306";
        this.usuario = "root";
        this.contrasena = "123";
    }
    @Override
    public void conectar() {
        System.out.println("Se conectó a PostgreSQL");
    }

    @Override
    public void desconectar() {
        System.out.println("Se desconectó de PostgreSQL");
    }
}
