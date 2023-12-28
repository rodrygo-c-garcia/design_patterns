package creacionales.singleton;

public class Conexion {
    private static Conexion instancia;

    private Conexion() {
    }

    // creamos el metodo static para obtener la instancia unica
    public static Conexion getInstancia() {
        if (instancia == null) {
            instancia = new Conexion();
        }
        return instancia;
    }

    public void conectar() {
        System.out.println("Conectando a la base de datos");
    }

    public void desconectar() {
        System.out.println("Desconectando a la base de datos");
    }
}
