package iit.oop.inheritance;

public class Triangle extends Shape{
	public int base;
	public int width;
	
	public double area(int b, int h) {
		return 0.5*(b*h);
	}
}