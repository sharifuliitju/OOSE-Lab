package iit.oop.constructor.practice;

public class CopyConstrunctorDriverClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PracticeCopyConstructor constructor = new PracticeCopyConstructor();
		constructor.setA("Sharif");
		
		PracticeCopyConstructor constructor2 = new PracticeCopyConstructor(constructor);
		System.out.println(constructor2.getA());
		//constructor2.toString();
	}

}
