/*
  Rohan Ahammed, Joan Chirinos, Aaron Li - The RPGers
  APCS1 pd08
  HW30 -- Yo Olde Playing Game, Improved
  2017-11-10
*/

public class Character {

    // Instance Vars
    private int hp;
    private int strength;
    private int def;
    private double atr;

    public boolean isAlive() {
	return (hp > 0);
    }

    public int getDefense() {
	return def;
    }

    public void lowerHP(int loss) {
	hp -= loss;
    }

    public int attack(Character dude) {
	int damage = (int) ((strength * atr) - dude.getDefense());
	return damage;
    }
    
}
