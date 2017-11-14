/*
Joan Chirinos, Aaron Li, Rohan Ahammed - The RPGers
APCS1 pd08
HW26 -- Ye Olde Role Playing Game
2017-11-08
*/

public class Protagonist extends Character {

    //Instance variables
    //-To store player values
    protected String name;

    //Takes String nam --> stores to name
    //Sets default values for other instance vars
    public Protagonist(String nam) {
	name = nam;
	hp = 125;
	strength = 100;
	def = 20;
	atr = 0.4; 
    }

    //Returns player name
    public String getName() {
	return name;
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
