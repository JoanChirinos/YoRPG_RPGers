/*
Joan Chirinos, Aaron Li, Rohan Ahammed - The RPGers
APCS1 pd08
HW26 -- Ye Olde Role Playing Game
2017-11-08
*/

public class Protagonist {

    //Instance variables
    //-To store player values
    private String name;
    private int hp;
    private int strength;
    private int def;
    private double atr;

    //Takes String nam --> stores to name
    //Sets default values for other instance vars
    public Protagonist(String nam) {
	name = nam;
	hp = 125;
	strength = 100;
	def = 20;
	atr = 0.4; 
    }

    //Returns bool true if player hp > 0
    public boolean isAlive() {
	return (hp > 0);
    }

    //Returns player defense
    public int getDefense() {
	return def;
    }

    //Returns player name
    public String getName() {
	return name;
    }

    //Sets hp to current hp - int loss
    public void lowerHP(int loss) {
	hp -= loss;
    }

    //Attacks a Monster object.
    //--> Damage dealt is strength * atr - the monster's defense
    //--> Then uses Monster.lowerHP to "do damage" and returns int damage
    public int attack(Monster dude) {
	int damage = (int) ((strength * atr) - dude.getDefense());
	if (damage < 0) damage = 0;
	dude.lowerHP(damage);
	return damage;
    }

    //Adds 50 to strength, and decreases defense by 10
    public void specialize() {
	strength = 150;
	def = 30;
    }

    //Sets strength and defense to default values
    public void normalize() {
	strength = 100;
	def = 40;
    }
    
}
