public class Knight extends Protagonist {

    // Public constructor makes Knight subclass instances of class Protagonist.
    // Each knight subclass inherits Protagonist variables and methods
    public Knight(String name) {
	super(name);
	hp = 150;
	strength = 80;
	def = 75;
	atr = 0.75;
    }

    // Buffs strength by 30 points, and nerfs defense by 15 points
    public void specialize() {
	strength = 110;
	def = 60;
    }

    // Resets strength and defense values to normal
    public void normalize() {
	strength = 80;
	def = 75;
    }
    
    // About method returns Knight subclass description
    public String about() {
	return "The Knight subclass of class Protagonist is the most balanced class of all Protagonist subclasses. It has slightly above average health and defense values, but a lower strength value that is compensated by a higher attack rating.";
    }
}

