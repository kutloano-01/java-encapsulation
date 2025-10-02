package encapsulation.projects.project1;

public class Task {
    private final String id;
    private final String description;

    public Task(String id, String description) {
        if (id == null) {
            throw new IllegalArgumentException("Task ID cannot be null");
        }
        this.id = id;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public String getId() {
        return id;
    }

    public Task updateDescription(String newDescription) {
        return new Task(id, newDescription);
    }
}
