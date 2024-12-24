package Interns_CoreJavaAssignments_V001;

import java.util.*;
public class DivisionByZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		try{
			int c=a/b;
			System.out.println("a/b: "+c);
		}
		catch(ArithmeticException e){
			System.out.println("Error: Invalid input. Please enter a valid integer.");
			
		}

	}

}
