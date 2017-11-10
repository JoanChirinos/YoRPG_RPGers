/*
Joan Chirinos, Aaron Li, Rohan Ahammed - The RPGers
APCS1 pd08
HW28 -- Ye Olde Role Playing Game
2017-11-08
*/

public class Monster extends Character {

    //Instance vars
    private String name;
    private int hp;
    private int strength;
    private int def;
    private double atr;

    //Default constructor sets default values for Monster objects
    public Monster() {
	hp = 150;
	strength = (int) ((Math.random() * 45) + 25);
	def = 20;
	atr = 1.;
    }

    //Returns boolean --> true if Monster object's health > 0
    public boolean isAlive() {
	return (hp > 0);
    }

    //Returns the int defense of the Monster object
    public int getDefense() {
	return def;
    }

    //Lowers the hp of the Monster object by int loss
    public void lowerHP(int loss) {
	hp -= loss;
    }

    //Damages a Protagonist object - dude
    //--> Damage is Monster object's strength * atr - dude's defense
    //--> Uses Protagonist.lowerHP to decrease dude's health
    //--> Returns the int damage done
    public int attack(Protagonist dude) {
	int damage = (int) ((strength * atr) - dude.getDefense());
	if (damage < 0) damage = 0;
	dude.lowerHP(damage);
	return damage;
    }
    
}
