public class Tank extends Protagonist {

    // Default constructor takes on Protagonist
    // instance variable and makes them class specific
    public Tank(String name) {
	super(name);
	hp = 320;
	strength = 60;
	def = 70;
	atr = 0.95;
    }

    // Nerfs defense by 10 points and buff attack rating to 1.5
    public void specialize() {
	def = 60;
	atr = 1.5;
    }

    // Resets defense and attack rating
    public void normalize() {
	def = 70;
	atr = 0.95;
    }
    
    // Description of Tank subclass of Protagonist
    public String about() {
	return "Tanks are Protagonists that have the highest health and defenses of all Protagonists. However, their increased defenses come at the cost of a lower attack rating and strength.";
    }
}
