package Interns_CoreJavaAssignments_V001;

import java.util.*;
public class FibbanociSequenceWhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n: ");
		int n=sc.nextInt();
		int n1=0;
		int n2=1;
		int n3;
		System.out.print(n1+" ");
		System.out.print(n2+" ");
		int i=0;
		while(i<n-2){
			n3=n1+n2;
			System.out.print(n3+" ");
			n1=n2;
			n2=n3;
			i++;
		}

	}

}
