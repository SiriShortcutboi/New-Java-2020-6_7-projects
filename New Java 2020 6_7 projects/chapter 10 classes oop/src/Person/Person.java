package Person;

import holden.anderson.car.*;

public class Person {
	int age;
	String name;
	
	public Person() {
		// TODO Auto-generated constructor stub
	}
	public void startCar(Car car) {
		car.start();
	}
	public void startTruck(Truck truck) {
		truck.start();
	}
}
