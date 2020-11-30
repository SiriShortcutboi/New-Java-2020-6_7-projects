package Holden.Anderson;

public class Dog {
	private int numTimesFed = 0;
	private boolean sleeping = false;
	private String name = "Bobert";
	
	//public String getName() {
		//return this.name;
	//}
	public void wakeUp() {
		System.out.println("WAKING UP");
		this.sleeping = false;
		this.numTimesFed = 0;
	}
	public int getNumTimesFed() {
		return numTimesFed;
	}
	public void setNumTimesFed(int numTimesFed) {
		this.numTimesFed = numTimesFed;
	}
	public boolean isSleeping() {
		return sleeping;
	}
	public void setSleeping(boolean sleeping) {
		this.sleeping = sleeping;
	}
	public String getName() {
		return name;
	}
	public void sleep() {
		
	}
	public void hear(String sound) {
		if (sound.contentEquals("Doorbell")){
		System.out.println("Bark");
		}
	
	else {
		return;
		}
	}
	public void feed() {
		if (this.sleeping ) {
			return;
		}
		else {
			this.numTimesFed ++;
			if (this.numTimesFed > 2) {
				System.out.println("YAWN");
			}
			else {
				System.out.println("YUMMY");
			}
			
		
		}
	}
}
