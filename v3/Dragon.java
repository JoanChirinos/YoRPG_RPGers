/*
Joan Chirinos, Aaron Li, Rohan Ahammed - The RPGers
APCS1 pd08
HW31 -- Ye Olde Role Playing Game, Expanded .
2017-11-08
*/

public class Dragon extends Monster{
    public Dragon(){
	super();
	hp = 500;
    }
    public static String about(){
	return "Dragons are Monsters that have 500 HP! It takes longer to take these large creatures down.";
    }
}
