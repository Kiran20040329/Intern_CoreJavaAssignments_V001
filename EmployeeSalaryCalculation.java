package Interns_CoreJavaAssignments_V001;

import java.util.*;
public class EmployeeSalaryCalculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter years of experiance: ");
				int exp=sc.nextInt();
				if(exp>10)
				     System.out.println("Salary: 100000");
				else if(exp>=5 && exp<=10)
				      System.out.println("Salary: 75000");
				else if(exp<5)
				       System.out.println("Salary: 50000");
				else
				      System.out.println("Experience must be positive.");
			
	}

}
