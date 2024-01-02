package creacionales.abstract_factory;

public class ConexionVacia implements IConexion {
    @Override
    public void conectar() {
        System.out.println("No se especificó proveedor");
    }

    @Override
    public void desconectar() {
        System.out.println("No se especificó proveedor");
    }
}
