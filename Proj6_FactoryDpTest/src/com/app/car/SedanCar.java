package com.app.car;

public class SedanCar implements Car {
	
	private SedanEngine engine;
	
	public SedanCar(SedanEngine engine) {
		this.engine = engine;
	}
	
	@Override
	public void sartCar() {
		engine.StartEngine();
		System.out.println("Sedan car is started");

	}

	@Override
	public void startMusicSystem() {
		System.out.println("Sedan car music system is stared");
	}

	@Override
	public void moveCar() {
		System.out.println("Sedan car is moving ");

	}

}
