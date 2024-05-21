package com.lab;

class Vehicle {
	public void startEngine() {

		System.out.println("engine started");
	}

	public void stopEngine() {

		System.out.println("engine stopped");
	}
}

class Car extends Vehicle {
	@Override
	public void startEngine() {
		System.out.println("Car engine started.");
	}

	@Override
	public void stopEngine() {
		System.out.println("Car engine stopped.");
	}
}

class Motorcycle extends Vehicle {
	@Override
	public void startEngine() {
		System.out.println("Motorcycle engine started.");
	}

	@Override
	public void stopEngine() {
		System.out.println("Motorcycle engine stopped.");
	}
}

public class Problem3 {

	public static void main(String[] args) {
	    Vehicle car = new Car();
	    Vehicle motorcycle = new Motorcycle();
	    
	    car.startEngine();
	    car.stopEngine();
	    motorcycle.startEngine();
	    motorcycle.stopEngine();
	    
	}
}
