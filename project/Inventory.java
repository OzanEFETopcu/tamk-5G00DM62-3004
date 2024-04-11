/**
 * A class representing an inventory system.
 */
public class Inventory {
    Integer[] inventory; // Array to hold the inventory items

    /**
     * Constructs an Inventory object with the specified size.
     *
     * @param size the size of the inventory
     * @throws IllegalArgumentException if the size is less than or equal to zero
     */
    public Inventory(int size) {
        if (size <= 0) {
            throw new IllegalArgumentException("Inventory size must be greater than zero");
        }
        inventory = new Integer[size]; // Initialize the inventory array with the specified size
    }

    /**
     * Adds an item to the inventory.
     *
     * @param item the item to be added
     * @throws IllegalStateException if the inventory is full
     */
    public void addItem(int item) {
        boolean added = false;
        for (int i = 0; i < inventory.length; i++) {
            if (inventory[i] == null) {
                inventory[i] = item;
                added = true;
                break; // Item added, exit loop
            }
        }
        if (!added) {
            throw new IllegalStateException("Inventory is full");
        }
    }

    /**
     * Removes an item from the inventory at the specified index.
     *
     * @param index the index of the item to be removed
     * @throws IndexOutOfBoundsException if the index is out of bounds
     */
    public void removeItem(int index) {
        if (index < 0 || index >= inventory.length) {
            throw new IndexOutOfBoundsException("Index is out of bounds");
        }
        inventory[index] = null; // Remove the item at the specified index
    }

    /**
     * Selects an item from the inventory at the specified index.
     *
     * @param index the index of the item to be selected
     * @return the selected item, or null if the index is out of bounds
     * @throws IndexOutOfBoundsException if the index is out of bounds
     */
    public Integer selectItem(int index) {
        if (index < 0 || index >= inventory.length) {
            throw new IndexOutOfBoundsException("Index is out of bounds");
        }
        return inventory[index]; // Return the item at the specified index
    }

    /**
     * Removes and selects an item from the inventory at the specified index.
     *
     * @param index the index of the item to be removed and selected
     * @return the removed item, or null if the index is out of bounds
     * @throws IndexOutOfBoundsException if the index is out of bounds
     */
    public Integer removeAndSelectItem(int index) {
        if (index < 0 || index >= inventory.length) {
            throw new IndexOutOfBoundsException("Index is out of bounds");
        }
        Integer item = selectItem(index); // Select the item first
        removeItem(index); // Then remove it
        return item; // Return the removed item
    }

    /**
     * Adds an item to the inventory and selects it.
     *
     * @param item the item to be added
     * @return the added item, or null if the inventory is full
     */
    public Integer addAndSelectItem(int item) {
        for (int i = 0; i < inventory.length; i++) {
            if (inventory[i] == null) {
                inventory[i] = item;
                return inventory[i];
            }
        }
        // If inventory is full, return null or handle the case appropriately
        return null;
    }
}

// End of file
