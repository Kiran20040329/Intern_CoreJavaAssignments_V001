package Interns_CoreJavaAssignments_V001;

import java.util.*;

abstract class Shape{
	abstract void area();
}
class Rectangle extends Shape{
	private double l,b;
	public Rectangle(double l,double b){
		this.l=l;
		this.b=b;
	}
	public void area(){
		System.out.println("Area of Rectangle is: "+(l*b));
	}
}
class Circle extends Shape{
	private double r;
	private final double pi=3.14;
	public Circle(double r){
		this.r=r;
	}
	public void area(){
		System.out.println("Area of Circle is: "+(pi*r*r));
	}
}

public class ShapeAreaCalculaton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Rectangle Length: ");
		double l=sc.nextDouble();
		System.out.println("Rectangle Width: ");
		double b=sc.nextDouble();
		System.out.println("Radius of circle: ");
		double r=sc.nextDouble();
		Rectangle ob1=new Rectangle(l,b);
		ob1.area();
		Circle ob2=new Circle(r);
		ob2.area();

	}

}
