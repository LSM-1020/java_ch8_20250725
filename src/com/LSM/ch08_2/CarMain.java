package com.LSM.ch08_2;

public class CarMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car car = new Car();
		car.run();
		
		car.frontLeftTire = new KumhoTire();
		car.frontRightTire = new KumhoTire();
		car.run();
	
	}

}


