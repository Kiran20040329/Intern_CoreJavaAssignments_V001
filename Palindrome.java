package Interns_CoreJavaAssignments_V001;
import java.util.*;
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new  Scanner(System.in);
		System.out.println("Enter a string: ");
		String a=sc.next();
		String rev=new StringBuffer(a).reverse().toString();//StringBuilder
		if(a.equals(rev))
		     System.out.println("\""+a+"\" is a palindrome");
		else
		      System.out.println("\""+a+"\" is a palindrome");

	}

}
