package iit.oop.ploymorphism;

public class PolyMorphisimHelper {
	static int multiply(int a, int b) {
		return a*b;
	}
	static double multiply(double a, double b) {
		return a*b;
	}
	
	String multiply(String a) {
		return a;
	}
	void print() {
		System.out.println("From parent class");
	}
}

