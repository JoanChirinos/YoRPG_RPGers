public class Tank extends Protagonist {

    // Default constructor takes on Protagonist
    // instance variable and makes them class specific
    public Tank(String name) {
	super(name);
	hp = 350;
	strength = 60;
	def = 110;
	atr = 0.45;
    }

    // Nerfs defense by 30 points and buff attack rating to 1
    public void specialize() {
	def = 80;
	atr = 1;
    }

    // Resets defense and attack rating
    public void normalize() {
	def = 110;
	atr = 0.45;
    }
    
    // Description of Tank subclass of Protagonist
    public static String about() {
	return "Tanks are Protagonists that have the highest health and defenses of all Protagonists. However, their increased defenses come at the cost of a lower attack rating and strength.";
    }
}
