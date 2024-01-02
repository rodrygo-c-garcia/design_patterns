package creacionales.abstract_factory.factoryREST;

public class ConexionRESTCompras implements IConexionREST{
    @Override
    public void leerURL(String url) {
        System.out.println("Conectándose a " + url);
    }
}

