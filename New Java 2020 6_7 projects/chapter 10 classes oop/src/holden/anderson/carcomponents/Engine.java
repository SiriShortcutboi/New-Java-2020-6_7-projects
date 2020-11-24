package holden.anderson.carcomponents;

public class Engine {
	public int cylinders;
	String type;
			
			public Engine() {
				cylinders = 8;
				type = "v";
				
	}
	public void engine_desc() {
		System.out.println(type +" " + cylinders);
	}
	
	
}
