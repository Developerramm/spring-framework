package com.app.test;

import com.app.car.Car;
import com.app.factory.CarFactory;

public class DPTtest {
	public static void main(String[] args) {
		System.out.println("ram kumar");
		
		// suv car object
		Car car = null;
		car = CarFactory.getCarInstance("suv");
		car.sartCar();
		
		System.out.println("---------------------------");
		
		car = CarFactory.getCarInstance("sedan");
		car.sartCar();
		
		System.out.println("-------------------------------");
		
		car = CarFactory.getCarInstance("Luxury");
		car.sartCar();
	}

}
