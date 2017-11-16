public class Assassin extends Protagonist {

    //Change blockCountdown to 3
    int blockCountdown = 3;
    
    // Public constructor: Assassin is-a Protagonist so it inherits its methods and vars
    public Assassin(String name) {
	super(name);
	hp = 100;
	strength = 65;
	def = 25;
	atr = 2;
	mana = 100;
    }

    // Buffs strength by 10 points, and nerf defense by 15 points
    public void specialize() {
	strength = 75;
	def = 10;
    }

    // Resets strength and defense values to normal
    public void normalize() {
	strength = 65;
	def = 25;
    }

    //Returns Assassin's ability name
    public String getAbilityName() {
	return "Hidden Attack";
    }
    
    //Assassin's Special ability does a stronger attack with better defense;
    public int ability( Monster smaug ) {
	System.out.println("As an assassin, you attack while hidden");
	int oldStrength = strength;
	int oldDef = def;
	strength += 5;
	boolean hideSuccess = (Math.random() < 0.5);
	if (hideSuccess)
	    def += 30;
	else
	    def += 15;
	int damage = attack(smaug);
	strength = oldStrength;
	def = oldDef;
	return damage;
    }

    // Blocking method
    public boolean block() {
	if (blockCountdown <= 0)
	    return false;
	blockCountdown--;
	return true;
    }
    
    // About method explains Assassin subclass
    public String about() {
	return "Assassins are the weakest Protagonist subclass in terms of health values, but it compensates for this by having the highest attack rating of all Protagonists. Assassins also have a higher defense because they are able to dodge attacks better. They do not need mana to do their special ability!";
    }
}
