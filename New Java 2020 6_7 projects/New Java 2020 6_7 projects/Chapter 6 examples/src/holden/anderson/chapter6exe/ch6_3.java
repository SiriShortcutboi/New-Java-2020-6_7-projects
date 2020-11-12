package holden.anderson.chapter6exe;
// imports
import java.util.*;
public class ch6_3 {

	public ch6_3() {
		Scanner input = new Scanner(System.in);
		double gpa; 
		/*
		System.out.print("Enter in your GPA and press enter");
		
		if(input.hasNextDouble()) { 
		double gpa = input.nextDouble();
			input.nextLine();
		}
		else {
			System.out.println("YOur GPA sucketh " + gpa);
			gpa = 0.1;
		}	
		
		System.out.println("Your gpa is " + gpa);
		*/
		
		
		System.out.print("option2");
		
		
		System.out.print("Enter in your gpa and press enter");
		gpa = 0.0;
		boolean good = input.hasNextDouble();
		if (good) {
			gpa = input.hasNextDouble(); 
		}
		else {
			while(good == false) {
			input.nextLine();
			System.out.println("not a good value. Your value sucketh");
			System.out.println("Enter in your gpa and press enter");
			good = input.hasNextDouble();
			if (good == true)
			
			
			
			
			
			
			
			
			
			
			
			

			input.close();
		}

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
