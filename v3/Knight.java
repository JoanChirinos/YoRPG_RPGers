public class Knight extends Protagonist {

    // Public constructor makes Knight subclass instances of class Protagonist.
    // Each knight subclass inherits Protagonist variables and methods
    public Knight() {
	super();
	hp = 150;
	strength = 90;
	def = 25;
	atr = 0.45;
    }

    // About method returns Knight subclass description
    public static String about() {
	return "The Knight subclass of class Protagonist is the most balanced class of all Protagonist subclasses. It has slightly above average health and defense values, but a lower strength value that is compensated by a higher attack rating.";
    }
}

