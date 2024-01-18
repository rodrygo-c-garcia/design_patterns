package estructurales.facade;

public class Main {
    public static void main(String[] args) {
        CheckFacade cliente1 = new CheckFacade();
        cliente1.buscar("01/01/2020", "10/01/2020", "Buenos Aires", "Madrid");

        CheckFacade cliente2 = new CheckFacade();
        cliente2.buscar("01/01/2020", "10/01/2020", "Lima", "Quito");
    }
}
