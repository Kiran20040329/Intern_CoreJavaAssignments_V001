package Interns_CoreJavaAssignments_V001;
import java.util.*;
public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new  Scanner(System.in);
		System.out.println("Enter a number: ");
		int n=sc.nextInt();
		int i=1;
		while(i<=10){
			System.out.println(n+" x "+i+" = "+n*i);
			i++;
		}

	}

}
