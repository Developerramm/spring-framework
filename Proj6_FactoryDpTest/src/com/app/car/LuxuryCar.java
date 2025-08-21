package com.app.car;

public class LuxuryCar implements Car {
	
	private LuxuryEngine engine;
	
	public LuxuryCar(LuxuryEngine engine) {
		this.engine = engine;
	}

	@Override
	public void sartCar() {
		engine.StartEngine();
		System.out.println("luxury car is started");
	}

	@Override
	public void startMusicSystem() {
		System.out.println("luxury car music system is stared");

	}

	@Override
	public void moveCar() {
		System.out.println("Luxury car is moving ");
	}

}
