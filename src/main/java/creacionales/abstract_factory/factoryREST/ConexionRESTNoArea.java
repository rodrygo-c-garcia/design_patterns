package creacionales.abstract_factory.factoryREST;

public class ConexionRESTNoArea implements IConexionREST{
    @Override
    public void leerURL(String url) {
        System.out.println("No se Escpecificó área");
    }
}
