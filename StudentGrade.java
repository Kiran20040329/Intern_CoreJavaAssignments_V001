package Interns_CoreJavaAssignments_V001;
import java.util.*;
public class StudentGrade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new  Scanner(System.in);
		System.out.println("Enter the marks of the student: ");
		int m=sc.nextInt();
		if(m>90)
		     System.out.println("Grade: A");
		else if(m>75)
		     System.out.println("Grade: B");
		else if(m>60)
		     System.out.println("Grade: C");
		else if(m>40)
		     System.out.println("Grade: D");
		else
		     System.out.println("Grade: F");
		}

}
