package design.dao;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ConexionMySQL implements IConexion{
    private String usuario;
    private String clave;
    private String host;

    @Override
    public void conectar() {
        System.out.println("Conectado a MySQL");
    }
}
