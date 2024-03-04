package comportamiento.memento;

public class Main {
    public static void main(String[] args) {
        String nombre = "Super Mario Bros";

        Juego juego = new Juego();
        juego.setNombre(nombre);
        juego.setCheckpoint(1);

        // Iniciamos caretaker para guardar los estados del juego
        Caretaker caretaker = new Caretaker();
        // Originator es el encargado de crear los mementos
        Originator originator = new Originator();

        juego = new Juego();
        juego.setNombre(nombre);
        juego.setCheckpoint(2);
        originator.setEstado(juego);

        juego = new Juego();
        juego.setNombre(nombre);
        juego.setCheckpoint(3);
        originator.setEstado(juego);

        // Guardamos el estado del juego, primer Checkpoint
        caretaker.addMemento(originator.guardar());

        juego = new Juego();
        juego.setNombre(nombre);
        juego.setCheckpoint(4);
        originator.setEstado(juego);

        // Guardamos el estado del juego, segundo Checkpoint
        caretaker.addMemento(originator.guardar());

        juego = new Juego();
        juego.setNombre(nombre);
        juego.setCheckpoint(5);
        originator.setEstado(juego);

        // Recuperamos el estado del juego, primer Checkpoint
        originator.restaurar(caretaker.getMemento(1));
        juego = originator.getEstado();

        System.out.println(juego);


    }
}
