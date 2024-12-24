package Interns_CoreJavaAssignments_V001;

import java.util.*;
public class LinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create a LinkedList to store the shopping list
        LinkedList shoppingList = new LinkedList();
        Scanner sc = new Scanner(System.in);

        // Add items to the shopping list
        while (true) {
            System.out.print("Enter the item to add to the list (or type 'done' to stop adding): ");
            String item = sc.nextLine();
            if (item.equalsIgnoreCase("done")) {
                break;
            }
            System.out.print("Add at (1) Beginning or (2) End? ");
            int choice = sc.nextInt();
            sc.nextLine(); // Consume the newline
            if (choice == 1) {
                shoppingList.addFirst(item);
            } else if (choice == 2) {
                shoppingList.addLast(item);
            } else {
                System.out.println("Invalid choice. Adding at the end by default.");
                shoppingList.addLast(item);
            }
        }

        // Print the current list
        System.out.println("Current Shopping List: " + shoppingList);

        // Remove an item if the user wants
        System.out.print("Do you want to remove an item? (yes/no): ");
        String removeChoice = sc.nextLine();
        if (removeChoice.equalsIgnoreCase("yes")) {
            System.out.print("Enter the item to remove: ");
            String removeItem = sc.nextLine();
            if (shoppingList.remove(removeItem)) {
                System.out.println("Item '" + removeItem + "' removed.");
            } else {
                System.out.println("Item '" + removeItem + "' not found in the list.");
            }
        }

        // Display the updated list
        System.out.println("Updated Shopping List: " + shoppingList.toString());
    

	}

	private boolean remove(String removeItem) {
		// TODO Auto-generated method stub
		return false;
	}

	private void addLast(String item) {
		// TODO Auto-generated method stub
		
	}

	private void addFirst(String item) {
		// TODO Auto-generated method stub
		
	}

}
