package design.dao;

import java.util.List;

public interface CRUD<T> {
    List<T> listar();
    T leerPorId(int id);
    void  registrar(T persona);
    void actualizar(T persona);
    void eliminar(int id);
}
