package org.studyeasy.vehicles;

import org.studyeasy.parent.Vehicle;

public class Bike extends Vehicle {
	private String handle;

	public Bike() {
		super();
		this.handle="short";
	}

	public Bike(String handle,String engine, int wheels, int seats, int fuleTank, String lights) {
		super(engine,wheels,seats,fuleTank,lights);
		this.handle = handle;
	}

	public String getHandle() {
		return handle;
	}

	@Override
	public String toString() {
		return "Bike [getHandle()=" + getHandle() + ", getEngine()=" + getEngine() + ", getWheels()=" + getWheels()
				+ ", getSeats()=" + getSeats() + ", getFuleTank()=" + getFuleTank() + ", getLights()=" + getLights()
				+ "]";
	}
	//اینجا تبدیل به رشته کردیم تا وقتی در کلاس دمو میخوانیمش مقدایر انتصابی که در کلاس دمو به ان منتسب شد برابر با پارامتر تابع گت هندل و... جلوش قرار بگیره
	

}
