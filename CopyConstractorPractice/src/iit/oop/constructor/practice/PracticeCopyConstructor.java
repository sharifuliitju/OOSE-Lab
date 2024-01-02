package iit.oop.constructor.practice;

public class PracticeCopyConstructor {
	private String a;
	
	PracticeCopyConstructor(){
		
	}
		
	//copy constructor
	PracticeCopyConstructor(PracticeCopyConstructor b){ //b is PCC
		this.a = b.a;
	}

	public String getA() {
		return a;
	}

	public void setA(String a) {
		this.a = a;
	}

	@Override
	public String toString() {
		return "PracticeCopyConstructor [a=" + a + "]";
	}
	
	
	
}
