package design.dao;

import lombok.AllArgsConstructor;

import java.util.ArrayList;
import java.util.List;

public class PersonaDAOImplements implements PersonaDao{
    private IConexion connection;

    @Override
    public void setConexion(IConexion conexion) {
        this.connection = conexion;
    }

    @Override
    public List<Persona> listar() {
        List<Persona> lista = new ArrayList<>();
        Persona persona1 = new Persona();
        persona1.setId(1);
        persona1.setNombres("Juan");

        lista.add(persona1);
        Persona persona2 = new Persona();
        persona2.setId(1);
        persona2.setNombres("Maria");

        lista.add(persona2);
        return lista;
    }

    @Override
    public void leerPorId(int id) {
        System.out.println("Persona encontrada con id: " + id);
    }

    @Override
    public void registrar(Persona persona) {
        System.out.println("Persona registrada: " + persona.getNombres());
    }

    @Override
    public void actualizar(Persona persona) {
        System.out.println("Persona actualizada: " + persona.getNombres());
    }

    @Override
    public void eliminar(int id) {
        System.out.println("Persona eliminada con id: " + id);
    }
}
