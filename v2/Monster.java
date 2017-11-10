/*
Joan Chirinos, Aaron Li, Rohan Ahammed - The RPGers
APCS1 pd08
HW28 -- Ye Olde Role Playing Game
2017-11-08
*/

public class Monster extends Character {

    //Instance vars
    private String name;

    //Default constructor sets default values for Monster objects
    public Monster() {
	hp = 150;
	strength = (int) ((Math.random() * 45) + 25);
	def = 20;
	atr = 1.;
    }
    
}
