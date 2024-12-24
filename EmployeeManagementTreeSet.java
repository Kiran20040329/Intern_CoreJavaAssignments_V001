package Interns_CoreJavaAssignments_V001;

import java.util.*;
public class EmployeeManagementTreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create a TreeSet to store employee IDs
        TreeSet<Integer> employeeIDs = new TreeSet<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of employee IDs to insert: ");
        int n = sc.nextInt();

        System.out.println("Enter employee IDs: ");
        for (int i = 0; i < n; i++) {
            employeeIDs.add(sc.nextInt());
        }

        // Display the employee IDs in ascending order
        System.out.println("Employee IDs (sorted): " + employeeIDs);
    
	}

}
