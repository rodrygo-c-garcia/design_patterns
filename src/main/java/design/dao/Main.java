package design.dao;

public class Main {
    public static void main(String[] args) {
        CRUD<Medico> dao = new MedicoImplements();
        // casting
        ((MedicoImplements) dao).curar();

        dao.listar().forEach(x -> System.out.println(x.getNombres()));
        dao.leerPorId(1);

    }
}
