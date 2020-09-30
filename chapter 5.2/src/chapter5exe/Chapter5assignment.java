package chapter5exe;

public class Chapter5assignment {

	public Chapter5assignment() {
		//Declare a string named storedUsername
		String storedUsername;
		//Declare a string named storedPassword
		String storedPassword;
		
		//set storedUsername and storedPassword equal to "captainbob" and "ahoy"
		storedUsername = "captainbob";
		storedPassword= "ahoy";
		
		//Declare a String named inputUsername, set equal to "CaptainBob"
		//Declare a String named inputUsername, set equal to "Ahoy"
		String inputUsername = "CAPTAINBOB";
		String inputPassword = "Ahoy";
				
		boolean username = false;		
		boolean password = false;
	
		if (storedUsername.equalsIgnoreCase(inputUsername)) {
			username = true;
		}
		if (storedPassword.equalsIgnoreCase(inputPassword)) {
			password = true;
		}
		if (username) {
			if(password) {
				System.out.println("you got int. Haha get it?");
			}
			else {
				System.out.println("you did not git init. Haha look at that one");
			}

		}
		else {
			System.out.println("wrong username");
		}
	}

	public static void main(String[] args) {
		new Chapter5assignment();

	}

}
