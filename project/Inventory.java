package project;

/**
 * A class representing an inventory system.
 */
public class Inventory {
    Integer[] inventory; // Array to hold the inventory items

    /**
     * Constructs an Inventory object with the specified size.
     *
     * @param size the size of the inventory
     */
    public Inventory(int size) {
        inventory = new Integer[size]; // Initialize the inventory array with the specified size
    }

    /**
     * Adds an item to the inventory.
     *
     * @param item the item to be added
     */
    public void addItem(int item) {
        // Find an empty slot in the inventory to add the item
        for (int i = 0; i < inventory.length; i++) {
            if (inventory[i] == null) {
                inventory[i] = item;
                break; // Item added, exit loop
            }
        }
    }

    /**
     * Removes an item from the inventory at the specified index.
     *
     * @param index the index of the item to be removed
     */
    public void removeItem(int index) {
        if (index >= 0 && index < inventory.length) {
            inventory[index] = null; // Remove the item at the specified index
        }
    }

    /**
     * Selects an item from the inventory at the specified index.
     *
     * @param index the index of the item to be selected
     * @return the selected item, or null if the index is out of bounds
     */
    public Integer selectItem(int index) {
        if (index >= 0 && index < inventory.length) {
            return inventory[index]; // Return the item at the specified index
        } else {
            return null; // Index out of bounds, return null
        }
    }

    /**
     * Removes and selects an item from the inventory at the specified index.
     *
     * @param index the index of the item to be removed and selected
     * @return the removed item, or null if the index is out of bounds
     */
    public Integer removeAndSelectItem(int index) {
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
