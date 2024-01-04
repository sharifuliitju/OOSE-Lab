package iit.oop.inheritance;

public class DeriveBike extends MountainBike{
	public DeriveBike() {
		
	}
	public DeriveBike(int gear, int speed, int startHeight) {
		super(gear, speed, startHeight);
		// TODO Auto-generated constructor stub
	}

	public void childDerivedBike() {
		System.out.println("This is Derived class.");
	}

}
