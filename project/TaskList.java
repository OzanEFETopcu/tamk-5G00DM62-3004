import java.util.ArrayList;
import java.util.List;

/**
 * A class representing a task list.
 */
public class TaskList {
    private List<String> tasks;

    /**
     * Constructs an empty TaskList.
     */
    public TaskList() {
        tasks = new ArrayList<>();
    }

    /**
     * Adds a task to the list if it's not already present.
     *
     * @param task the task to add
     */
    public void addTask(String task) {
        if (!tasks.contains(task)) {
            tasks.add(task);
        }
    }

    /**
     * Removes a task from the list.
     *
     * @param task the task to remove
     */
    public void removeTask(String task) {
        tasks.remove(task);
    }

    /**
     * Marks a task as completed.
     *
     * @param task the task to mark as completed
     */
    public void markTaskCompleted(String task) {
        if (tasks.contains(task)) {
            System.out.println("Task \"" + task + "\" marked as completed.");
        } else {
            System.out.println("Task \"" + task + "\" not found.");
        }
    }

    /**
     * Gets the number of tasks in the list.
     *
     * @return the number of tasks in the list
     */
    public int getTaskCount() {
        return tasks.size();
    }

    /**
     * Checks if the list is empty.
     *
     * @return true if the list is empty, false otherwise
     */
    public boolean isEmpty() {
        return tasks.isEmpty();
    }
}

// End of file
