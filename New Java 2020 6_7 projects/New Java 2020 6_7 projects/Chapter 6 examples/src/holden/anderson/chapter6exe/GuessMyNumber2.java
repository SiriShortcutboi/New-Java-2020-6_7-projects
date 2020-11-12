package holden.anderson.chapter6exe;
//imports
import java.util.*;
public class GuessMyNumber2 {

	public GuessMyNumber2() {
		Scanner input = new Scanner(System.in);
		Random Random = new Random();
		int maxRange = 50;
		int diff = 2;
		int totalguess = 5;
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
		
		
		//picking the random number
		int the_number = Random.nextInt(maxRange)+1;
		System.out.println(the_number);
		int guess;
		
		System.out.println("Welcome to the Guess my number game");
		System.out.println("I'm thinking of a number between 1 and " +maxRange);
		System.out.println(String.format("You have %s guesses to get the right number. Good luck", totalguess));
		System.out.println();
		
		System.out.println(String.format("Pick a number between 1 and %s and press Enter", maxRange));
		//guess 1
		if(!win) {//!win
			if (input.hasNextInt()) {
				guess = input.nextInt();
				if (guess == the_number) {
					System.out.println("you got it great job");
				}
				else if (guess < the_number) {
					System.out.println("Guess Higher");
				}
				
				else {
					System.out.println("Guess Lower");
				}
			}	
			else {
				input.nextLine();
				System.out.println("wrong inout");
			}
		
		}// !win
	
		//guess 2 
		if (!win) {
			if (input.hasNextInt()) {
				guess = input.nextInt();
				if (guess == the_number) {
					System.out.println("you got it great job");
				}
				else if (guess < the_number) {
					System.out.println("Guess Higher");
				}
				
				else {
					System.out.println("Guess Lower");
				}
			}	
			else {
				input.nextLine();
				System.out.println("wrong inout");
			}
		
		}
		
		//Guess 4
		if (!win) {
			if (diff > 1) {
				if (input.hasNextInt()) {
					guess = input.nextInt();
					if (guess == the_number) {
						System.out.println("you got it great job");
					}
					else if (guess < the_number) {
						System.out.println("Guess Higher");
					}
					
					else {
						System.out.println("Guess Lower");
					}
				}	
				else {
					input.nextLine();
					System.out.println("wrong inout");
				}
				
			}
		
		}
		//Guess 5
		if (!win) {
			if (diff > 1) {
				if (input.hasNextInt()) {
					guess = input.nextInt();
					if (guess == the_number) {
						System.out.println("you got it great job");
					}
					else if (guess < the_number) {
						System.out.println("Guess Higher");
					}
					
					else {
						System.out.println("Guess Lower");
					}
				}	
				else {
					input.nextLine();
					System.out.println("wrong inout");
				}
				
			}
		
		}
		//Guess 6
				if (!win) {
					if (diff > 2) {
						if (input.hasNextInt()) {
							guess = input.nextInt();
							if (guess == the_number) {
								System.out.println("you got it great job");
							}
							else if (guess < the_number) {
								System.out.println("Guess Higher");
							}
							
							else {
								System.out.println("Guess Lower");
							}
						}	
						else {
							input.nextLine();
							System.out.println("wrong inout");
						}
						
					}
				
				}
				//Guess 7
				if (!win) {
					if (diff > 2) {
						if (input.hasNextInt()) {
							guess = input.nextInt();
							if (guess == the_number) {
								System.out.println("you got it great job");
							}
							else if (guess < the_number) {
								System.out.println("Guess Higher");
							}
							
							else {
								System.out.println("Guess Lower");
							}
						}	
						else {
							input.nextLine();
							System.out.println("wrong inout");
						}
						
					}
				
				}
				//Guess 8
				if (!win) {
					if (diff > 2) {
						if (input.hasNextInt()) {
							guess = input.nextInt();
							if (guess == the_number) {
								System.out.println("you got it great job");
							}
							else if (guess < the_number) {
								System.out.println("Guess Higher");
							}
							
							else {
								System.out.println("Guess Lower");
							}
						}	
						else {
							input.nextLine();
							System.out.println("wrong inout");
						}
						
					}
				
				}
				//Guess 9
				if (!win) {
					if (diff > 2) {
						if (input.hasNextInt()) {
							guess = input.nextInt();
							if (guess == the_number) {
								System.out.println("you got it great job");
							}
							else if (guess < the_number) {
								System.out.println("Guess Higher");
							}
							
							else {
								System.out.println("Guess Lower");
							}
						}	
						else {
							input.nextLine();
							System.out.println("wrong inout");
						}
						
					}
				
				}
				//Guess 10
				if (!win) {
					if (diff > 2) {
						if (input.hasNextInt()) {
							guess = input.nextInt();
							if (guess == the_number) {
								System.out.println("you got it great job");
							}
							else if (guess < the_number) {
								System.out.println("Guess Higher");
							}
							
							else {
								System.out.println("Guess Lower");
							}
						}	
						else {
							input.nextLine();
							System.out.println("wrong inout");
						}
						
					}
				
				}
		
		// last guess 
		
		if (!win|| diff == 4) {
			if (input.hasNextInt()) {
				guess = input.nextInt();
				if (guess == the_number) {
					System.out.println("you got it great job");
				}
				
				else {
					System.out.println("You lose");
				}
			}	
			else {
				input.nextLine();
				System.out.println("wrong inout");
			}
		
		}
		
		
		
		
		input.close();
	}

	public static void main(String[] args) {
		new GuessMyNumber2();

	}

}
