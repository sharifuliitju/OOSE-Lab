package iit.oop.driver;

import iit.oop.inheritance.Circle;
import iit.oop.inheritance.Triangle;

public class OOPInheritancePractice {
	public OOPInheritancePractice() {
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c1 = new Circle();
		System.out.println(c1.area(3));
		
		Triangle t1 = new Triangle();
		System.out.println(t1.area(2,3));

	}

}