package Interns_CoreJavaAssignments_V001;

import java.util.*;
public class MultipleCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		try{
			System.out.println("Enter a number: ");
			int n=sc.nextInt();
			System.out.println("Entered: "+n);
		}
		catch(InputMismatchException e){
			System.out.println("Error: Invalid input. Please enter a valid integer.");
		}
		catch(ArithmeticException e){
			System.out.println(e);
		}


	}

}
