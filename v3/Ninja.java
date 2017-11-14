/*
Joan Chirinos, Aaron Li, Rohan Ahammed - The RPGers
APCS1 pd08
HW31 -- Ye Olde Role Playing Game, Expanded .
2017-11-08
*/

public class Ninja extends Monster{
    public Ninja(){
	super();
	atr = 1.2;
	def = 50;
    }
    public static String about(){
	return "Ninjas are Monsters that will attack you when you least expect it and do 1.2x the normal damage and because of their elusive nature, will be harder to take down due to their amazing defensive skills.";
    }
}
