public class Knight extends Protagonist {

    // Public constructor makes Knight subclass instances of class Protagonist.
    // Each knight subclass inherits Protagonist variables and methods
    public Knight(String name) {
	super(name);
	hp = 150;
	strength = 90;
	def = 95;
	atr = 0.55;
    }

    // Buffs strength by 30 points, and nerfs defense by 15 points
    public void specialize() {
	strength = 120;
	def = 80;
    }

    // Resets strength and defense values to normal
    public void normalize() {
	strength = 90;
	def = 95;
    }
    
    // About method returns Knight subclass description
    public static String about() {
	return "The Knight subclass of class Protagonist is the most balanced class of all Protagonist subclasses. It has slightly above average health and defense values, but a lower strength value that is compensated by a higher attack rating.";
    }
}

