public class Assassin extends Protagonist {

    // Public constructor: Assassin is-a Protagonist so it inherits its methods and vars
    public Assassin(String name) {
	super(name);
	hp = 100;
	strength = 65;
	def = 40;
	atr = 2;
    }

    // Buffs strength by 20 points, and buffs defense by 30 points
    public void specialize() {
	strength = 85;
	def = 70;
    }

    // Resets strength and defense values to normal
    public void normalize() {
	strength = 65;
	def = 40;
    }
    
    // About method explains Assassin subclass
    public static String about() {
	return "Assassins are the weakest Protagonist subclass in terms of health values, but it compensates for this by having the highest attack rating of all Protagonists. Assassins also have a higher defense because they are able to dodge attacks better.";
    }
}
