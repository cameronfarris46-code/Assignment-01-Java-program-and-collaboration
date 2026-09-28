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
    
    public static void restockItem(String[] names, int[] stocks, String target, int amount) {
        boolean found = false;

        for(int i = 0; i< names.length; i++)
        {
            if(names[i] != null && names[i].equals(target))
            {
                stocks[i] += amount;
                found = true;
                break;
            }
        }
        if(found == false)
        {
            System.out.println("Item not found.");
        }
    }
}