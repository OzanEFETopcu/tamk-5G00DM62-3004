import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class InventoryTest {

    // Test cases for addItem() method
    @Test
    public void testAddItem() {
        Inventory inventory = new Inventory(5);
        inventory.addItem(10);
        assertEquals(Integer.valueOf(10), inventory.selectItem(0));
    }

    @Test
    public void testAddItemMultiple() {
        Inventory inventory = new Inventory(5);
        inventory.addItem(10);
        inventory.addItem(20);
        assertEquals(Integer.valueOf(10), inventory.selectItem(0));
        assertEquals(Integer.valueOf(20), inventory.selectItem(1));
    }

    // Test cases for removeItem() method
    @Test
    public void testRemoveItem() {
        Inventory inventory = new Inventory(5);
        inventory.addItem(10);
        inventory.removeItem(0);
        assertNull(inventory.selectItem(0));
    }

    @Test
    public void testRemoveItemOutOfRange() {
        Inventory inventory = new Inventory(5);
        inventory.addItem(10);
        inventory.removeItem(1); // Attempting to remove an item out of range
        assertEquals(Integer.valueOf(10), inventory.selectItem(0));
    }

    @Test
    public void testRemoveItemEmptySlot() {
        Inventory inventory = new Inventory(5);
        inventory.removeItem(0); // Removing from an empty slot
        assertNull(inventory.selectItem(0));
    }

    // Test cases for selectItem() method
    @Test
    public void testSelectItem() {
        Inventory inventory = new Inventory(5);
        inventory.addItem(10);
        assertEquals(Integer.valueOf(10), inventory.selectItem(0));
    }

    @Test
    public void testSelectItemOutOfRange() {
        Inventory inventory = new Inventory(5);
        assertNull(inventory.selectItem(1)); // Attempting to select an item out of range
    }

    @Test
    public void testSelectItemEmptySlot() {
        Inventory inventory = new Inventory(5);
        assertNull(inventory.selectItem(0)); // Selecting from an empty slot
    }

    // Test cases for removeAndSelectItem() method
    @Test
    public void testRemoveAndSelectItem() {
        Inventory inventory = new Inventory(5);
        inventory.addItem(10);
        assertEquals(Integer.valueOf(10), inventory.removeAndSelectItem(0));
        assertNull(inventory.selectItem(0));
    }

    @Test
    public void testRemoveAndSelectItemOutOfRange() {
        Inventory inventory = new Inventory(5);
        assertNull(inventory.removeAndSelectItem(1)); // Attempting to remove and select an item out of range
    }

    @Test
    public void testRemoveAndSelectItemEmptySlot() {
        Inventory inventory = new Inventory(5);
        assertNull(inventory.removeAndSelectItem(0)); // Removing and selecting from an empty slot
    }

    // Test cases for addAndSelectItem() method
    @Test
    public void testAddAndSelectItem() {
        Inventory inventory = new Inventory(5);
        assertEquals(Integer.valueOf(10), inventory.addAndSelectItem(10));
        assertEquals(Integer.valueOf(10), inventory.selectItem(0));
    }

    @Test
    public void testAddAndSelectItemFullInventory() {
        Inventory inventory = new Inventory(2);
        inventory.addItem(10);
        inventory.addItem(20);
        assertNull(inventory.addAndSelectItem(30)); // Attempting to add and select in a full inventory
    }

    @Test
    public void testAddAndSelectItemEmptySlot() {
        Inventory inventory = new Inventory(5);
        assertEquals(Integer.valueOf(10), inventory.addAndSelectItem(10)); // Adding and selecting from an empty slot
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorWithNegativeSize() {
        new Inventory(-1);
    }

    @Test(expected = IllegalStateException.class)
    public void testAddItemToFullInventory() {
        Inventory inventory = new Inventory(1);
        inventory.addItem(1);
        inventory.addItem(2);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testRemoveItemAtNegativeIndex() {
        Inventory inventory = new Inventory(1);
        inventory.removeItem(-1);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testSelectItemAtOutOfBoundsIndex() {
        Inventory inventory = new Inventory(1);
        inventory.selectItem(1);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testRemoveAndSelectItemAtOutOfBoundsIndex() {
        Inventory inventory = new Inventory(1);
        inventory.removeAndSelectItem(1);
    }
}
