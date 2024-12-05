
/**
 * @author brody - bjboell
 * CIS175 - Fall 2023
 * Nov 12, 2024
 */
import java.util.Date;

public class Task implements Comparable<Task> {
	private String title;
    private Date deadline;
    private int priority;

    public Task(String title, Date deadline, int priority) {
        this.title = title;
        this.deadline = deadline;
        this.priority = priority;
    }

    public String getTitle() {
        return title;
    }

    public Date getDeadline() {
        return deadline;
    }

    public int getPriority() {
        return priority;
    }

    public int compareTo(Task other) {
        return Integer.compare(this.priority, other.priority); // Lower number = higher priority
    }

    @Override
    public String toString() {
        return title + " (Deadline: " + deadline + ", Priority: " + priority + ")";
    }
}
