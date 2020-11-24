
public class Losing_Battle {

	public Losing_Battle() {
		System.out.println("Your lone hero is surrounded by a massive army of trolls.");
		System.out.println("Their decaying green bodies stretch out, melting in to the horizon.");
		System.out.println("Your hero unsheathes his sword for the last fight of his life \n");
		
		int hero_health = 100;
		int dead_trolls = 0;
		int troll_damage = 7;
		int hero_damage = 10;
		int troll_health = 10;
		
		while (hero_health != 0) {
			int hero_attack = hero_damage;
			int troll_attack = troll_damage;
			hero_health -= troll_attack;
			if (hero_attack >= troll_health) {
				dead_trolls += 1;
				System.out.println("your hero swings and defeats an evil troll, ");
				System.out.println("but takes "+troll_attack+ " damage points. \n");
				}
		
			}
			System.out.println("Your hero fought valiantly and defeated " + dead_trolls+ " trolls");
			System.out.println("But alas, your hero is no more.");

		
		
		
			}
	
	
public static void main(String[] args) {
	new Losing_Battle();
}

}