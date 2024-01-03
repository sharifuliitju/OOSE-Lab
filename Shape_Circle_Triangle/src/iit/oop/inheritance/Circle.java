package iit.oop.inheritance;

public class Circle  extends Shape{
	public int radian;
	public double area(int r) {
		return Math.PI * r*r;
	}

}