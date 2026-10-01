import java.util.Scanner;

/**
 * GroceryManagementSystem manages grocery inventory data using
 * parallel arrays. The program allows the user to view inventory,
 * restock an item, and exit through a menu.
 */
public class GroceryManagementSystem {

    /**
     * Searches for an item and adds the specified amount to its stock.
     * Prints "Item not found." if the target item is not in the inventory.
     *
     * @param names the array containing item names
     * @param stocks the array containing stock quantities
     * @param target the name of the item to restock
     * @param amount the amount to add to the item's stock
     */
    public static void restockItem(String[] names, int[] stocks,
                                   String target, int amount) {

        boolean found = false;

        for (int i = 0; i < names.length; i++) {
            if (names[i] != null && names[i].equals(target)) {
                stocks[i] += amount;
                found = true;
                break;
            }
        }

        if (found == false) {
            System.out.println("Item not found.");
        }
    }

    /**
     * Displays all non-empty inventory slots.
     *
     * @param names array containing item names
     * @param prices array containing item prices
     * @param stocks array containing item stock quantities
     */
    public static void printInventory(String[] names,
                                      double[] prices,
                                      int[] stocks) {

        for (int i = 0; i < names.length; i++) {
            if (names[i] != null) {
                System.out.printf(
                    "%s - $%.2f - Stock: %d%n",
                    names[i], prices[i], stocks[i]
                );
            } else {
                // Empty inventory slot; nothing is printed.
            }
        }
    }

    /**
     * Creates the grocery inventory and displays the user menu.
     * The user can view inventory, restock an item, or exit.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {

        String[] itemNames = new String[10];
        double[] itemPrices = new double[10];
        int[] itemStocks = new int[10];

        // Sample inventory data
        itemNames[0] = "Apples";
        itemPrices[0] = 1.99;
        itemStocks[0] = 12;

        itemNames[1] = "Bread";
        itemPrices[1] = 3.49;
        itemStocks[1] = 8;

        itemNames[2] = "Milk";
        itemPrices[2] = 4.25;
        itemStocks[2] = 5;

        Scanner input = new Scanner(System.in);

        while (true) {

            System.out.println(" **** THE USER MENU **** ");
            System.out.println();
            System.out.println("1. View Inventory");
            System.out.println("2. Restock Item");
            System.out.println("3. Exit");

            int choice = input.nextInt();

            if (choice == 1) {

                printInventory(itemNames, itemPrices, itemStocks);

            } else if (choice == 2) {

                System.out.print("Enter item name you want to restock: ");
                String target = input.next();

                System.out.print("Enter quantity to add: ");
                int amount = input.nextInt();

                restockItem(itemNames, itemStocks, target, amount);

            } else if (choice == 3) {

                System.out.println("Exiting....");
                break;

            } else {

                System.out.println("Invalid Choice! Try Again.");
            }
        }

        input.close();
    }
}
