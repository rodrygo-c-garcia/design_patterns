package estructurales.facade;

public class CheckFacade {
    private AvionAPI avionAPI;
    private HotelAPI hotelAPI;

    public CheckFacade() {
        IService avionAPI = new AvionAPI();
        IService hotelAPI = new HotelAPI();
    }

    public void buscar(String fechaIda, String fechaVuelta, String origen, String destino){
        avionAPI.buscar(fechaIda, fechaVuelta, origen, destino);
        hotelAPI.buscar(fechaIda, fechaVuelta, origen, destino);
    }
}
