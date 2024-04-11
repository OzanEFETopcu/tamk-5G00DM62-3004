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
     * @throws IllegalArgumentException if the task is null
     */
    public void addTask(String task) {
        if (task == null) {
            throw new IllegalArgumentException("Task cannot be null");
        }
        if (!tasks.contains(task)) {
            tasks.add(task);
        }
    }

    /**
     * Removes a task from the list.
     *
     * @param task the task to remove
     * @throws IllegalArgumentException if the task is null
     */
    public void removeTask(String task) {
        if (task == null) {
            throw new IllegalArgumentException("Task cannot be null");
        }
        tasks.remove(task);
    }

    /**
     * Marks a task as completed.
     *
     * @param task the task to mark as completed
     * @throws IllegalArgumentException if the task is null
     */
    public void markTaskCompleted(String task) {
        if (task == null) {
            throw new IllegalArgumentException("Task cannot be null");
        }
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

    /**
     * Retrieves the task at the specified index.
     *
     * @param index the index of the task to retrieve
     * @return the task at the specified index
     * @throws IndexOutOfBoundsException if the index is out of range
     */
    public String getTask(int index) {
        if (index < 0 || index >= tasks.size()) {
            throw new IndexOutOfBoundsException("Index is out of range");
        }
        return tasks.get(index);
    }

    /**
     * Clears all tasks from the list.
     */
    public void clearTasks() {
        tasks.clear();
    }
}

// End of file
