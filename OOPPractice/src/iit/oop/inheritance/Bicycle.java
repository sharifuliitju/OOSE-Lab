package iit.oop.inheritance;

public class Bicycle {
	public int gear;
	public int speed;
	
	public Bicycle() {
		
	}
	
	public Bicycle(int gear, int speed) {
		super();
		this.gear = gear;
		this.speed = speed;
	}
	public void applyBrake(int decrement) {
		speed -= decrement;
	}
	
	public void speedup(int increment) {
		speed += increment;
	}
	
	public void parentClass() {
		System.out.println("This is a Parent class Bicycle");
	}
	
	@Override
	public String toString() {
		return "Bicycle [gear=" + gear + ", speed=" + speed + "]";
	}
	
}
