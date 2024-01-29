package iit.oop.ploymorphism;

public class PolyMorphismMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(PolyMorphisimHelper.multiply(12, 2)); //static ti first 2ta show kortece
//		System.out.println(PolyMorphisimHelper.multiply(22.3, 34.56));
//	
//		
//		PolyMorphisimHelper helper = new PolyMorphisimHelper(); // static na ti object lagce
//		helper.multiply("Shariful Islam");
//		System.out.println();
		
		PolyMorphismMain a;
		a = new ChildOne();
        a.print();
        a = new ChildTwo();
        a.print();
	}
	
	void print() {
		System.out.println("From parent class");
	}

}
