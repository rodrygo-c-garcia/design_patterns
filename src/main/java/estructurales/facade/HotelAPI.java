package estructurales.facade;

public class HotelAPI {
    public void buscarHoteles(String fechaEntrada, String fechaSalida, String origen, String destino){
        System.out.println("================================");
        System.out.println("Hoteles encontrados para " + destino + " desde " + origen + " para las fechas " + fechaEntrada + " y " + fechaSalida);
        System.out.println("Hotel 1");
        System.out.println("Hotel 2");
        System.out.println("Hotel 3");
        System.out.println("================================");
    }
}
