package Interns_CoreJavaAssignments_V001;

import java.util.*;
public class ReverseNumberForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		String n=sc.next();
		String rev="";
		for(int i=n.length()-1;i>=0;i--){
			rev+=n.charAt(i);
		}
		System.out.println("Reversed Number: "+rev);
		

	}

}
