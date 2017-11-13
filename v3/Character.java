/*
  Rohan Ahammed, Joan Chirinos, Aaron Li - The RPGers
  APCS1 pd08
  HW30 -- Yo Olde Playing Game, Improved
  2017-11-10
*/

public class Character {

    // Instance Vars
    public int hp;
    public int strength;
    public int def;
    public double atr;

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
	if (damage < 0) damage = 0;
	dude.hp -= damage;
	return damage;
    }
    
}
