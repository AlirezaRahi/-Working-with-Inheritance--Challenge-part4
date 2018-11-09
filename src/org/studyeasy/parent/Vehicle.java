package org.studyeasy.parent;

public class Vehicle {
	private String engine;
	private int wheels;
	private int seats;
	private int fuleTank;
	private String lights;

	public Vehicle() {
		this.engine = "petrol";
		this.wheels = 4;
		this.seats = 4;
		this.fuleTank = 35;
		this.lights = "LED";

	}

	public Vehicle(String engine, int wheels, int seats, int fuleTank, String lights) {

		this.engine = engine;
		this.wheels = wheels;
		this.seats = seats;
		this.fuleTank = fuleTank;
		this.lights = lights;
	}

	public String getEngine() {
		return engine;
	}

	public int getWheels() {
		return wheels;
	}

	public int getSeats() {
		return seats;
	}

	public int getFuleTank() {
		return fuleTank;
	}

	public String getLights() {
		return lights;
	}

}
