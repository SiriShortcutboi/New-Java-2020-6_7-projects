package holden.anderson.chapter6exe;

import java.util.Random;
import java.util.Scanner;

public class GuessMyNumber1_4 {

	public GuessMyNumber1_4() {
		Scanner input = new Scanner(System.in);
		Random random = new Random();
		int maxRange = 50;
		int diff = 2;
		int totalguess = 5;
		int the_number;
		int guess;
		boolean win = false;
		System.out.println("Choose your Difficulty Easy Medium Hard");
		String result = input.nextLine();
		switch(result) {
		case "Easy":
			diff = 1;
			maxRange = 10;
			totalguess = 3;
			break;
		case "Medium":
			diff = 2;
			maxRange = 50;
			totalguess = 5;
			break;
		case "easy":
			diff = 1;
			maxRange = 10;
			totalguess = 3;
			break;
		case "medium":
			diff = 2;
			maxRange = 50;
			totalguess = 5;
			break;
		case "Hard":
			diff = 3;
			maxRange = 100;
			totalguess = 10;
			break;
		case "hard": 
			diff = 3;
			maxRange = 100;
			totalguess = 10;
			break;
		default:
			diff = 4;
			maxRange = 1000;
			totalguess = 1;
			win=true;
			break;
		}
		
		System.out.println("Welcome to the Guess my number game");
		System.out.println("I'm thinking of a number between 1 and " +maxRange);
		System.out.println(String.format("You have %s guesses to get the right number. Good luck", totalguess));
		System.out.println();
		
		String guessText = String.format("Pick a number between 1 and %s", maxRange);
		the_number = random.nextInt(maxRange)-1;
		
		int guess_count = 0;
		//for(int guess_count = 0; guess_count != totalguess);
		do {
			System.out.println(guessText);
			//guess 1
			
			if (input.hasNextInt()) {
				guess = input.nextInt();
				if (guess != totalguess-1) {
					if (guess == the_number) {
						System.out.println("you got it great job");
						win =true;
							
						}
						else if (guess < the_number) {
							System.out.println("Guess Higher");
						}
						
						else {
							System.out.println("Guess Lower");
						}//else
				}
			}
				
			else {
				input.nextLine();
				System.out.println("not a good value you lose a guess");
			}//else
				input.nextLine();
				guess_count++;
			} while (guess_count != totalguess && (win == false));
				
	
		
			if (win ==true) {
				System.out.println("you win");
			
			}
			else {
				System.out.println("you lose");
			}
		
		input.close();
	}

	public static void main(String[] args) {
		new GuessMyNumber1_4();
		/*
		for (int dayOfWeek = 0;dayOfWeek < 7; dayOfWeek++) {
			System.out.println("Day " + dayOfWeek + ": ");
			for (int hour = 0; hour < 24; hour++) {
				System.out.println("H " + hour + ": ");
				for (int min = 0; min < 60; min++) {
					System.out.println("M " + min);
					for (int sec = 0; sec < 60; sec++) {
						System.out.print("S " + sec);
					}
				}
			}
		} */
	}
}
