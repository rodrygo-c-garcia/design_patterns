package MVC;

import java.util.Scanner;

public class TaskController {
    private TaskModel model;
    private TaskView view;
    private Scanner scanner;

    public TaskController(TaskModel model, TaskView view) {
        this.model = model;
        this.view = view;
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        String choice;
        do {
            view.displayTasks(model.getTasks());
            System.out.println("1. Agregar tarea");
            System.out.println("2. Eliminar tarea");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    System.out.print("Ingrese la nueva tarea: ");
                    String newTask = scanner.nextLine();
                    model.addTask(newTask);
                    break;
                case "2":
                    System.out.print("Ingrese el número de la tarea a eliminar: ");
                    int taskIndex = scanner.nextInt();
                    model.removeTask(taskIndex - 1);
                    scanner.nextLine(); // Limpiar el buffer del scanner
                    break;
                case "0":
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtelo de nuevo.");
                    break;
            }
        } while (!choice.equals("0"));
    }
}
