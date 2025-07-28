package com.LSM.ch08_2;

public class Car {
		//필드 int a = 10;
		Tire frontLeftTire = new HankookTire(); //업 캐스팅 
		Tire frontRightTire = new HankookTire();
		Tire backLeftTire = new HankookTire();
		Tire backRightTire = new HankookTire();
			
		//메소드
		public void run() {
			frontLeftTire.roll();
			frontRightTire.roll();
			backLeftTire.roll();
			backLeftTire.roll();
		}
		
		
}
