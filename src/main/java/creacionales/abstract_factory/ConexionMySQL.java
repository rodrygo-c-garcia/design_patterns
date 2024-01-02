package creacionales.abstract_factory;

import lombok.Data;

@Data
public class ConexionMySQL implements IConexion {
    private String host;
    private String puerto;
    private String usuario;
    private String contrasena;

    public ConexionMySQL(String usuario) {
        this.host = "localhost";
        this.puerto = "3306";
        this.usuario = usuario;
        this.contrasena = "123";
    }
    @Override
    public void conectar() {
        System.out.println("Se conectó a MySQL");
    }

    @Override
    public void desconectar() {
        System.out.println("Se desconectó de MySQL");
    }
}
