package design.dao;

import java.util.ArrayList;
import java.util.List;

public class MedicoImplements implements MedicoDAO{
    @Override
    public List<Medico> listar() {
        List<Medico> lista = new ArrayList<>();
        Medico medico1 = new Medico();

        medico1.setId(1);
        medico1.setNombres("Lucho");

        lista.add(medico1);
        Medico medico2 = new Medico();
        medico2.setId(1);
        medico2.setNombres("Juanjo");

        lista.add(medico2);
        return lista;

    }

    @Override
    public Medico leerPorId(int id) {
        System.out.println("Medico encontrado con id: " + id);
        return null;
    }

    @Override
    public void registrar(Medico persona) {
        System.out.println("Medico registrado: " + persona.getNombres());
    }

    @Override
    public void actualizar(Medico persona) {
        System.out.println("Medico actualizado: " + persona.getNombres());
    }

    @Override
    public void eliminar(int id) {
        System.out.println("Medico eliminado con id: " + id);
    }


    @Override
    public void curar() {
        System.out.println("El medico esta curando...");
    }
}
