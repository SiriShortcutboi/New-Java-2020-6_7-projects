package holden.anderson.chapter6exe;

import java.util.Random;
import java.util.Scanner;

public class GuessMyNumber1_2 {
	
	Scanner input = new Scanner(System.in);
	Random Random = new Random();
	int maxRange = 50;
	int diff = 2;
	int totalguess = 5;
	int the_number;
	int guess;
	boolean win = false;
	
	public GuessMyNumber1_2() {
		System.out.println("Welcome to the Guess my number game");
		System.out.println("I'm thinking of a number between 1 and " +maxRange);
		System.out.println(String.format("You have %s guesses to get the right number. Good luck", totalguess));
		System.out.println();
		
		String guessText = String.format("Pick a number between 1 and %s", maxRange);
		
		
		int guess_count = 0;
		while (guess_count != totalguess && (win == false)) {
			System.out.println(guessText);
			//guess 1
					if (input.hasNextInt()) {
						guess = input.nextInt();
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
					}//has next	
					else {
						input.nextLine();
						System.out.println("not a good value you lose a guess");
					}//else
					input.nextLine();
					guess_count++;
					
		}//while loop
		
		if (win ==true) {
			System.out.println("you win");
		
		}
		else {
			System.out.println("you lose");
		}
		
		
		input.close();
	}



	public static void main(String[] args) {
		
	}


}
