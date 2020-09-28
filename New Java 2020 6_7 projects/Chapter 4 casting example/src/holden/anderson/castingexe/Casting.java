package holden.anderson.castingexe;

import java.lang.*;
/*
 * @author holden.anderson
 * 9/28
 * Casting
 * 
 */ 
public class Casting {

	public Casting() {
		
	/*	byte	java.lang.Byte
		short	java.lang.Short
		int	    java.lang.Integer
		long	java.lang.Long
		float	java.lang.Float
		double	java.lang.Double
		char	java.lang.Character
		boolean	java.lang.Boolean
		*/
		
		
		double value1 = 7.2;
		int value2 = (int)value1;
	
		int number55 = 55;
		char five = (char) number55;
	
		int value3 = 100;
		double value4= value3;

		
		byte num1 = 127;
		byte num2 = 127;
		System.out.println(num1);
		System.out.println(num2);
		
		short num3 = 3;
		short num4 = 3;
		Integer num5 = 5;	
		float maxFloat = Float.MAX_VALUE;		
		
		int maxintvalue = Integer.MIN_VALUE;
		System.out.println(maxintvalue);
		System.out.println(maxFloat);		
	}
	
	/*
	 * @param args
	 */
	public static void main(String[] args) {
			new Casting();
	}

}
