package iit.oop.driverclass;

import iit.oop.inheritance.DeriveBike;

public class OOPDriverClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		MountainBike bike = new MountainBike(3, 200, 10);
//		System.out.println(bike.toString());
		
		DeriveBike bike = new DeriveBike();
		bike.parentClass();
		bike.mountainBikeInter();
		bike.mountainBikeInter();
	}

}
