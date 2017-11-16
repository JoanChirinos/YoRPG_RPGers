public class Tank extends Protagonist {

    //Change blockCountdown to 7
    int blockCountdown = 7;

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

    // Returns Tank's ability name
    public String getAbilityName() {
	return "Half Counter";
    }

    // Full Counter ability deflects damage monster does and
    // tank only takes half damage
    public int ability( Monster smaug ) {
	int damage = smaug.attack(this);
	return ( damage / 2 );
    }

    // Blocking method
    public boolean block() {
	if (blockCountdown <= 0)
	    return false;
	blockCountdown--;
	return true;
    }
    
    // Description of Tank subclass of Protagonist
    public String about() {
	return "Tanks are Protagonists that have the highest health and defenses of all Protagonists. However, their increased defenses come at the cost of a lower attack rating and strength.";
    }
}
