package encapsulation.projects.project1;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class TaskList {
    private final Map<String, Task> tasks = new LinkedHashMap<>();

    public TaskList() {
    }

    public void addTask(Task task) {
        if (task == null) {
            throw new IllegalArgumentException("Task cannot be null");
        }
        String id = task.getId();
        if (id == null) {
            throw new IllegalArgumentException("Task ID cannot be null");
        }
        tasks.put(id, task);
    }

    public int getTaskCount() {
        return tasks.size();
    }

    public Task getTaskById(String id) {
        if (id == null) {
            throw new IllegalArgumentException("Task ID cannot be null");
        }
        return tasks.get(id);
    }

//    public boolean removeTask(String id) {
//        return tasks.remove(id);
//    }

    public void clearTasks() {
        tasks.clear();
    }
}
