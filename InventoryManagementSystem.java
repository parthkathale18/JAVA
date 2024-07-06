import java.util.HashMap;
import java.util.Map;

public class InventoryManagementSystem {
    private Map<String, Integer> inventory;

    public InventoryManagementSystem() {
        this.inventory = new HashMap<>();
    }

    // Method to add items to the inventory
    public void addItem(String itemName, int quantity) {
        if (inventory.containsKey(itemName)) {
            int currentQuantity = inventory.get(itemName);
            inventory.put(itemName, currentQuantity + quantity);
        } else {
            inventory.put(itemName, quantity);
        }
        System.out.println(quantity + " " + itemName + "(s) added to inventory.");
    }

    // Method to remove items from the inventory
    public void removeItem(String itemName, int quantity) {
        if (inventory.containsKey(itemName)) {
            int currentQuantity = inventory.get(itemName);
            if (currentQuantity >= quantity) {
                inventory.put(itemName, currentQuantity - quantity);
                System.out.println(quantity + " " + itemName + "(s) removed from inventory.");
            } else {
                System.out.println("Not enough " + itemName + " in inventory.");
            }
        } else {
            System.out.println(itemName + " not found in inventory.");
        }
    }

    // Method to display current inventory
    public void displayInventory() {
        System.out.println("Current Inventory:");
        for (Map.Entry<String, Integer> entry : inventory.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        InventoryManagementSystem ims = new InventoryManagementSystem();
        ims.addItem("Laptop", 10);
        ims.addItem("Mouse", 20);
        ims.displayInventory();
        ims.removeItem("Laptop", 5);
        ims.displayInventory();
    }
}
