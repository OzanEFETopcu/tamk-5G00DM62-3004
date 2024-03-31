package project;

public class Inventory {
    Integer[] inventory; // Array to hold the inventory items

    public Inventory(int size) {
        inventory = new Integer[size]; // Initialize the inventory array with the specified size
    }

    // Method to add an item to the inventory
    public void addItem(int item) {
        // Find an empty slot in the inventory to add the item
        for (int i = 0; i < inventory.length; i++) {
            if (inventory[i] == null) {
                inventory[i] = item;
                break; // Item added, exit loop
            }
        }
    }

    // Method to remove an item from the inventory
    public void removeItem(int index) {
        if (index >= 0 && index < inventory.length) {
            inventory[index] = null; // Remove the item at the specified index
        }
    }

    // Method to select an item from the inventory
    public Integer selectItem(int index) {
        if (index >= 0 && index < inventory.length) {
            return inventory[index]; // Return the item at the specified index
        } else {
            return null; // Index out of bounds, return null
        }
    }

    // Method to remove and select an item from the inventory
    public Integer removeAndSelectItem(int index) {
        Integer item = selectItem(index); // Select the item first
        removeItem(index); // Then remove it
        return item; // Return the removed item
    }

    // Method to add and select an item from the inventory (demonstrating different return type)
    public Integer addAndSelectItem(int item) {
        addItem(item); // Add the item to the inventory
        return selectItem(inventory.length - 1); // Return the last added item
    }
}
