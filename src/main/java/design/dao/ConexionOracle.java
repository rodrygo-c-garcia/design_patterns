package design.dao;

public class ConexionOracle implements IConexion{
    @Override
    public void conectar() {
        System.out.println("Conectado a Oracle");
    }
}
