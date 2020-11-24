package holden.anderson.car;

import java.awt.Color;
import java.util.Scanner;

import holden.anderson.carcomponents.Engine;

public class Car {
	String color;
	int numDoors;
	String doorType;
	int numWheels;
	String brand;
	Long hardware;
	double price;
	Engine engine = new Engine();
	
	public Car() {

		Scanner input = new Scanner(System.in);
		System.out.println("What color should your car be?");
		color = input.nextLine();
		System.out.println("What doors should your car have?");
		numDoors = input.nextInt();
		input.nextLine();
		System.out.println("What kind of doors should your car have?");
		doorType = input.nextLine();	
		System.out.println("How many wheels should your car have?");
		input.nextLine();
		numWheels = input.nextInt();
		input.nextLine();
		System.out.println("What brand should your car be?");
		brand = input.nextLine();
		System.out.println("What hardware should your car have?");
		hardware = input.nextLong();
		System.out.println("What hardware should your car have?");
		System.out.println("What price should your car have?");
		input.nextLine();
		input.close();
		
		
		
	
	
	}

	public void drive() {
		if (engine.cylinders == 8) {
			System.out.println("I'm driving really fast");
		}
		else { 
			System.out.println("I'm driving");
		}
	}
	
}

