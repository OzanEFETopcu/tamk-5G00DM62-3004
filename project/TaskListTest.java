import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class TaskListTest {

    // Test cases for addTask() method
    @Test
    public void testAddTask() {
        TaskList taskList = new TaskList();
        taskList.addTask("Task 1");
        assertEquals(1, taskList.getTaskCount());
    }

    @Test
    public void testAddTaskMultiple() {
        TaskList taskList = new TaskList();
        taskList.addTask("Task 1");
        taskList.addTask("Task 2");
        taskList.addTask("Task 3");
        assertEquals(3, taskList.getTaskCount());
    }

    @Test
    public void testAddTaskDuplicate() {
        TaskList taskList = new TaskList();
        taskList.addTask("Task 1");
        taskList.addTask("Task 1");
        assertEquals(1, taskList.getTaskCount());
    }

    // Test cases for removeTask() method
    @Test
    public void testRemoveTask() {
        TaskList taskList = new TaskList();
        taskList.addTask("Task 1");
        taskList.removeTask("Task 1");
        assertEquals(0, taskList.getTaskCount());
    }

    @Test
    public void testRemoveTaskNotFound() {
        TaskList taskList = new TaskList();
        taskList.addTask("Task 1");
        taskList.removeTask("Task 2");
        assertEquals(1, taskList.getTaskCount());
    }

    @Test
    public void testRemoveTaskMultiple() {
        TaskList taskList = new TaskList();
        taskList.addTask("Task 1");
        taskList.addTask("Task 2");
        taskList.addTask("Task 3");
        taskList.removeTask("Task 2");
        assertEquals(2, taskList.getTaskCount());
    }

    // Test cases for markTaskCompleted() method
    @Test
    public void testMarkTaskCompleted() {
        TaskList taskList = new TaskList();
        taskList.addTask("Task 1");
        taskList.markTaskCompleted("Task 1");
        assertEquals(1, taskList.getTaskCount());
    }

    @Test
    public void testMarkTaskCompletedNotFound() {
        TaskList taskList = new TaskList();
        taskList.addTask("Task 1");
        taskList.markTaskCompleted("Task 2");
        assertEquals(1, taskList.getTaskCount());
    }

    @Test
    public void testMarkTaskCompletedMultiple() {
        TaskList taskList = new TaskList();
        taskList.addTask("Task 1");
        taskList.addTask("Task 2");
        taskList.addTask("Task 3");
        taskList.markTaskCompleted("Task 2");
        assertEquals(3, taskList.getTaskCount());
    }

    // Test cases for getTaskCount() method
    @Test
    public void testGetTaskCount() {
        TaskList taskList = new TaskList();
        assertEquals(0, taskList.getTaskCount());
    }

    @Test
    public void testGetTaskCountAfterAdding() {
        TaskList taskList = new TaskList();
        taskList.addTask("Task 1");
        assertEquals(1, taskList.getTaskCount());
    }

    @Test
    public void testGetTaskCountAfterRemoving() {
        TaskList taskList = new TaskList();
        taskList.addTask("Task 1");
        taskList.removeTask("Task 1");
        assertEquals(0, taskList.getTaskCount());
    }

    // Test cases for isEmpty() method
    @Test
    public void testIsEmptyTrue() {
        TaskList taskList = new TaskList();
        assertTrue(taskList.isEmpty());
    }

    @Test
    public void testIsEmptyFalse() {
        TaskList taskList = new TaskList();
        taskList.addTask("Task 1");
        assertFalse(taskList.isEmpty());
    }

    @Test
    public void testIsEmptyAfterRemovingAllTasks() {
        TaskList taskList = new TaskList();
        taskList.addTask("Task 1");
        taskList.removeTask("Task 1");
        assertTrue(taskList.isEmpty());
    }
}
