/*
Joan Chirinos, Aaron Li, Rohan Ahammed - The RPGers
APCS1 pd08
HW31 -- Ye Olde Role Playing Game, Expanded .
2017-11-08
*/

public class Lich extends Monster{
    public Lich(){
	super();
	atr = 2.25;
	hp = 100;
	def = 35;
    }
    public static String about(){
	return "Liches are Monsters that use magic spells to deal the most damage possible and protect themselves with their defensive spells, but they fail at close combat. They do 2.25x the normal damage, but have less HP, but more defense than other monsters!";
    }
}
