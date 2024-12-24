package Interns_CoreJavaAssignments_V001;
import java.util.*;
public class VowelsAndConsonants {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Scanner sc=new  Scanner(System.in);
			System.out.println("Enter a string: ");
			String a=sc.nextLine();
			a=a.toLowerCase();
			int vowels=0;
			int consonants=0;
			
			for(int i=0;i<a.length();i++)
			{
				char ch=a.charAt(i);
				if(Character.isLetter(ch)){
					if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
						vowels++;
					}
					else
					      consonants++;
				}
			}
			System.out.println("Vowels: "+vowels);
			System.out.println("Consonants: "+consonants);

	}

}
