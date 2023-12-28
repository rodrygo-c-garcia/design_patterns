package creacionales.singleton;

public class MainSingleton {
    public static void main(String[] args) {
        // como el metodo es estatico pertenece a la clase
        Conexion conexion = Conexion.getInstancia();
        conexion.conectar();
        conexion.desconectar();

        // verificamos que la instancia sea unica
        boolean rpta = conexion instanceof Conexion;
        System.out.println(rpta);
    }
}
