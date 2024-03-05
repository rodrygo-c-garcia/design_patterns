package design.dao;

import java.util.List;

public interface CRUD<T> {
    void setConexion(IConexion conexion);
    List<T> listar();
    void leerPorId(int id);
    void  registrar(T persona);
    void actualizar(T persona);
    void eliminar(int id);
}
