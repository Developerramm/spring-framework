package com.app.car;

public class SuvCar implements Car {
	
	private SuvEngine engine;
	
	public SuvCar(SuvEngine engine) {
		this.engine = engine;
	}

	@Override
	public void sartCar() {
		engine.StartEngine();
		System.out.println("Suv car is started");

	}

	@Override
	public void startMusicSystem() {
		System.out.println("Suv car music system is stared");
	}

	@Override
	public void moveCar() {
		System.out.println("Suv car is moving ");

	}

}
