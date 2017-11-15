/*
  Rohan Ahammed, Joan Chirinos, Aaron Li - The RPGers
  APCS1 pd08
  HW30 -- Yo Olde Playing Game, Improved
  2017-11-10
*/

public class Character {

    // Instance Vars
    protected int hp;
    protected int strength;
    protected int def;
    protected double atr;

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
	damage += (int) (Math.random() * 7 - 3);
	if (damage < 0) damage = 0;
	dude.hp -= damage;
	return damage;
    }
    
}
