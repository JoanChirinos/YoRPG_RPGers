/*
Joan Chirinos, Aaron Li, Rohan Ahammed - The RPGers
APCS1 pd08
HW26 -- Ye Olde Role Playing Game
2017-11-08
*/

public abstract class Protagonist extends Character {

    //Instance variables
    //-To store player values
    protected String name;
    protected int blockCountdown;
    protected int mana;

    
    //Takes String nam --> stores to name
    //Sets default values for other instance vars
    public Protagonist(String nam) {
	name = nam;
	hp = 125;
	strength = 100;
	def = 40;
	atr = 0.4;
    }

    //Returns player name
    public String getName() {
	return name;
    }
    // Returns player mana
    public int getMana(){
	if (mana < 0) mana = 0;
	return mana;
    }

    // Replenishes mana
    public void replenishMana(int x) {
	mana += x;
    }
    
    // Healing method
    public void heal(int add) {
	hp += add;
    }

    // Method to increase attack
    public void increaseAttack(int add) {
	strength += add;
    }
    // Abstract method for blocking
    public abstract boolean block();

    // Abstract method for returning each class's ability name
    public abstract String getAbilityName();
    
    // Abstract method for each class's special ability
    public abstract int ability( Monster smaug );
    
    // Abstract method for specialized attacks
    public abstract void specialize();

    // Abstract method for reseting buffed and nerfed values
    public abstract void normalize();

    // Abstract method for about method
    public abstract String about();
    
}//end class
