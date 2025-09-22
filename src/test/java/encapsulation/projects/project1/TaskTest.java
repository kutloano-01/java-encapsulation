package encapsulation.projects.project1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TaskTest {
    @Test
    public void testTaskUpdateDescription() {
        Task task = new Task("T1", "Write code");
        Task updated = task.updateDescription("Test code");
        assertEquals("Test code", updated.getDescription());
        assertEquals("Write code", task.getDescription());
    }

    @Test
    public void testTaskListAddAndGet() {
        TaskList list = new TaskList();
        Task task = new Task("T1", "Write code");
        list.addTask(task);
        assertEquals(1, list.getTaskCount());
        assertEquals(task, list.getTaskById("T1"));
    }

    @Test
    public void testTaskNullIdThrows() {
        assertThrows(IllegalArgumentException.class, () -> new Task(null, "Write code"));
    }
}
