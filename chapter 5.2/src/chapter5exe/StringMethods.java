package chapter5exe;

public class StringMethods {

	public StringMethods() {
		String let ="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	
		String myString2 = "moon";
		String myString3 = "Moon";
		
		String test1 = myString2.toUpperCase();
		String test2 = myString3.toUpperCase();
		System.out.println(test1);
		System.out.println(test2);
		String newtest = myString2.replace("o", "z");
		System.out.println(newtest);
		
		String newsub = let.substring(7,11);
		System.out.println(newsub);
		
		int lastO = myString3.lastIndexOf("O");
		//Systemm.out.println(lastO);
		System.out.print(let.length());
		
		int first = let.indexOf("B");
		int second = let.indexOf("O");
		int third = let.indexOf("B");
		int fourth = let.indexOf("Y");
		
		char one = let.charAt(7);
		char two = let.charAt(14);
		char three = let.charAt(11);
		char four = let.charAt(3);
		char five = let.charAt(4);
		char six = let.charAt(13);
		
		System.out.print(one);
		System.out.print(two);
		System.out.print(three);
		System.out.print(four);
		System.out.print(five);
		System.out.print(six);
	}

	public static void main(String[] args) {
		new StringMethods();

	}

}
