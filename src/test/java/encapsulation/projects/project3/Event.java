package encapsulation.projects.project3;

public class Event {
    private String event;
    private String time;

    public Event(String event, String time) {
        this.event = event;
        this.time = time;
    }

    public Event reschedule(String time) {
        return new Event(event, time);
    }


    public String getTime() {
        return time;
    }
}
