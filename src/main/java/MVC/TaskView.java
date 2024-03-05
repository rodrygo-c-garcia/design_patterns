package MVC;

import java.util.List;

public class TaskView {
    public void displayTasks(List<String> tasks) {
        System.out.println("Tareas:");
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println((i + 1) + ". " + tasks.get(i));
        }
    }
}
