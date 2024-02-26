package estructurales.facade;

public class AvionAPI implements IService{
    @Override
    public void buscar(String fechaIda, String fechaVuelta, String origen, String destino){
        System.out.println("================================");
        System.out.println("Vuelos encontrados para " + destino + " desde " + origen + " para las fechas " + fechaIda + " y " + fechaVuelta);
        System.out.println("Vuelo de Ida: AM 666");
        System.out.println("Vuelo de Vuelta: AM 999");
        System.out.println("================================");
    }
}
