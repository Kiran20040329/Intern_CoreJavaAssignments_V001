package Interns_CoreJavaAssignments_V001;
import java.util.*;
public class SwitchMonth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new  Scanner(System.in);
		System.out.println("Enter the month number(1 to 12):  ");
		int n=sc.nextInt();
		switch(n){
			case 1:
			      System.out.println("The month is January");
			      break;
			 case 2:
			      System.out.println("The month is February");
			      break;
			 case 3:
			      System.out.println("The month is March");
			      break;
			 case 4:
			      System.out.println("The month is April");
			      break;
			case 5:
			      System.out.println("The month is May");
			      break;
			case 6:
			      System.out.println("The month is June");
			      break;
			case 7:
			      System.out.println("The month is July");
			      break;
		   case 8:
			      System.out.println("The month is August");
			      break;
		  case 9:
			      System.out.println("The month is Septmber");
			      break;
	       case 10:
			      System.out.println("The month is October");
			      break;
		   case 11:
			      System.out.println("The month is November");
			      break;
		   case 12:
		          System.out.println("The month is December");
		          break;
		   default:
		            System.out.println("Invalid month number. Please enter a number between 1 and 12.");
		            break;
		}
		
	

	}

}
