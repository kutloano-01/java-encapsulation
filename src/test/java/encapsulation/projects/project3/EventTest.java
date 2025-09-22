package encapsulation.projects.project3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EventTest {
    @Test
    public void testEventReschedule() {
        Event event = new Event("E1", "10:00");
        Event rescheduled = event.reschedule("12:00");
        assertEquals("12:00", rescheduled.getTime());
        assertEquals("10:00", event.getTime());
    }

    @Test
    public void testSchedulerAddAndFind() {
        Scheduler scheduler = new Scheduler();
        Event event = new Event("E1", "10:00");
        scheduler.scheduleEvent(event);
        assertEquals(1, scheduler.getEventCount());
        assertEquals(event, scheduler.findEvent("E1"));
    }

    @Test
    public void testEventNullTimeThrows() {
        assertThrows(IllegalArgumentException.class, () -> new Event("E1", null));
    }
}
