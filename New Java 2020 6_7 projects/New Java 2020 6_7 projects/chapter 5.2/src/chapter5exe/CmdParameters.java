package chapter5exe;

public class CmdParameters {

	public static void main(String[] args) {
		int numArgs = args.length;
		
		if(numArgs > 0) {
		System.out.println(args[0]);
		}
		if(numArgs > 1) {
		System.out.println(args[1]);
		}
		if(numArgs > 2) {
		System.out.println(args[2]);
		}
		if(numArgs > 3) {
		System.out.println(args[3]);
		if(args[0].equals ("help") {
		System.out.println("This could be your help menu");
		
		}   
	
	}

}
