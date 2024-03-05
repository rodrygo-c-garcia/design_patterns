package MVC;
import java.util.ArrayList;
import java.util.List;

public class TaskModel {
    private List<String> tasks;

    public TaskModel() {
        tasks = new ArrayList<>();
    }

    public void addTask(String task) {
        tasks.add(task);
    }

    public void removeTask(int index) {
        if (index >= 0 && index < tasks.size()) {
            tasks.remove(index);
        }
    }

    public List<String> getTasks() {
        return tasks;
    }
}
