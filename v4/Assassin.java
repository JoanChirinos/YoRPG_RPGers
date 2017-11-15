public class Assassin extends Protagonist {

    // Public constructor: Assassin is-a Protagonist so it inherits its methods and vars
    public Assassin(String name) {
	super(name);
	hp = 100;
	strength = 65;
	def = 65;
	atr = 2;
    }

    // Buffs strength by 30 points, and nerf defense by 15 points
    public void specialize() {
	strength = 95;
	def = 50;
    }

    // Resets strength and defense values to normal
    public void normalize() {
	strength = 65;
	def = 65;
    }
    
    // About method explains Assassin subclass
    public static String about() {
	return "Assassins are the weakest Protagonist subclass in terms of health values, but it compensates for this by having the highest attack rating of all Protagonists. Assassins also have a higher defense because they are able to dodge attacks better.";
    }
}
