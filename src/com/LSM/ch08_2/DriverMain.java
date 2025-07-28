package com.LSM.ch08_2;

public class DriverMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Driver driver = new Driver();
		
		Bus bus = new Bus();
		Truck truck = new Truck();
		
		driver.carDrive(truck);
		driver.carDrive(bus);
		
	}

}
