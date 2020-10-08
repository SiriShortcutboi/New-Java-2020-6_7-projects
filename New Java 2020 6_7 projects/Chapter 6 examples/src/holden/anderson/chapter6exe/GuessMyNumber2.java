package holden.anderson.chapter6exe;
//imports
import java.util.*;
public class GuessMyNumber2 {

	public GuessMyNumber2() {
		Scanner input = new Scanner(System.in);
		Random Random = new Random();
		int guess;
		//picking the random number
		int the_number = Random.nextInt(10)+1;
		
		System.out.println("Welcome to the Guess my number game");
		System.out.println("I'm thinking of a number between 1 and 10");
		System.out.println("You have 3 guesses to get the right number. Good luck");
		System.out.println();
		
		System.out.println("Pick a number between 1 and 10 and press Enter");
		if (input.hasNextInt()) {
			guess = input.nextInt();
			if (guess == the_number) {
				System.out.println("you got it great job");
			}
				else if (guess < the_number) {
					System.out.println("Guess Higher");
				}
			}
		else if (guess > the_number) {
				System.out.println("Guess Lower");
				
			}
		}	
	System.out.println("Pick a number between 1 and 10 and press Enter");
	if (input.hasNextInt()) {
		guess = input.nextInt();
		if (guess == the_number) {
			System.out.println("you got it great job");
		}
			else if (guess < the_number) {
				System.out.println("Guess Higher");
			}
		}
	else if (guess > the_number) {
			System.out.println("Guess Lower");
			
		}
	}	
		System.out.println("Pick a number between 1 and 10 and press Enter");
	f (input.hasNextInt()) {
		guess = input.nextInt();
		if (guess == the_number) {
		System.out.println("you got it great job");
	}
		else if (guess < the_number) {
			System.out.println("Guess Higher");
		}
	}
else if (guess > the_number) {
		System.out.println("Guess Lower");
		
	}
}	
					
				
		input.close();
	}

	public static void main(String[] args) {
		new GuessMyNumber();

	}

}
