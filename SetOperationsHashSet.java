package Interns_CoreJavaAssignments_V001;
import java.util.*;
public class SetOperationsHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create a HashSet to store unique elements
        HashSet<String> fruitSet = new HashSet<>();

        // Adding initial items to the set
        fruitSet.add("apple");
        fruitSet.add("banana");
        fruitSet.add("orange");

        // Display the initial set
        System.out.println("Initial Set: " + fruitSet);

        // Removing an item from the set
        fruitSet.remove("banana");
        System.out.println("Set after removal: " + fruitSet);

        // Checking if an item exists in the set
        String checkItem = "orange";
        boolean exists = fruitSet.contains(checkItem);
        System.out.println("'" + checkItem + "' exists in the set: " + exists);

        // Adding a new item to demonstrate the uniqueness property
        fruitSet.add("apple"); // Attempt to add duplicate
        System.out.println("Set after attempting to add duplicate 'apple': " + fruitSet);

	}

}
