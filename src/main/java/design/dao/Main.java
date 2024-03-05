package design.dao;

public class Main {
    public static void main(String[] args) {
        IConexion connection1 = new ConexionMySQL("Rodrigo", "123", "localhost");
        IConexion connection2 = new ConexionOracle();


        CRUD<Medico> dao = new MedicoImplements();
        dao.setConexion(connection2);
        // casting
        ((MedicoImplements) dao).curar();

        dao.listar().forEach(x -> System.out.println(x.getNombres()));
        dao.leerPorId(1);

    }
}
