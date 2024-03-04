package comportamiento.observer;

public class Main {
    public static void main(String[] args) {
        Subject subject = new Subject();

        new BraObservador(subject);
        new SolObservador(subject);
        new BolObservador(subject);

        System.out.println("Si desea cambiar 10 dolares obtendria: ");
        subject.setEstado(1);
        System.out.println("Si desea cambiar 100 dolares obtendria: ");
        subject.setEstado(100);
    }
}
