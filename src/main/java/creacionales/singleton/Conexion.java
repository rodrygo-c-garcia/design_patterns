package creacionales.singleton;

public class Conexion {
    // creamos el atributo estatico de la misma clase
    private static Conexion instancia;

    // con private evitamos que se instancie desde otras clases
    private Conexion() {
    }

    // creamos el metodo static para obtener la instancia unica
    public static Conexion getInstancia() {
        if (instancia == null) {
            instancia = new Conexion();
        }
        return instancia;
    }

    // metodos de prueba
    public void conectar() {
        System.out.println("Conectando a la base de datos");
    }

    public void desconectar() {
        System.out.println("Desconectando a la base de datos");
    }
}
