/**********************************************
 * class YoRPG -- Driver file for Ye Olde Role Playing Game.
 * Simulates monster encounters of a wandering adventurer.
 * Required classes: Protagonist, Monster
 **********************************************/


import java.io.*;
import java.util.*;

public class YoRPG
{
    // ~~~~~~~~~~~ INSTANCE VARIABLES ~~~~~~~~~~~

    //change this constant to set number of encounters in a game
    public final static int MAX_ENCOUNTERS = 5;

    //each round, a Protagonist and a Monster will be instantiated...
    private Protagonist pat;   //Is it man or woman? --> Yes
    private Monster smaug; //Friendly generic monster name?

    private int moveCount;
    private boolean gameOver;
    private int difficulty;

    private InputStreamReader isr;
    private BufferedReader in;
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


    // ~~~~~~~~~~ DEFAULT CONSTRUCTOR ~~~~~~~~~~~
    public YoRPG()
    {
	moveCount = 0;
	gameOver = false;
	isr = new InputStreamReader( System.in );
	in = new BufferedReader( isr );
	newGame();
    }
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


    // ~~~~~~~~~~~~~~ METHODS ~~~~~~~~~~~~~~~~~~~

    /*=============================================
      void newGame() -- gathers info to begin a new game
      pre:  
      post: according to user input, modifies instance var for difficulty 
      and instantiates a Protagonist
      =============================================*/
    public void newGame()
    {
	String s;
	String name = "";
	s = "~~~ Welcome to Bestest RPG! ~~~\n";

	s += "\nChoose your difficulty: \n";
	s += "\t1: Easy\n";
	s += "\t2: Not so easy\n";
	s += "\t3: Beowulf hath nothing on me. Bring it on.\n";
	s += "Selection: ";
	System.out.print( s );

	try {
	    difficulty = Integer.parseInt( in.readLine() );
	}
	catch ( IOException e ) { }

	s = "Intrepid protagonist, what doth thy call thyself? (State your name): ";
	System.out.print( s );

	try {
	    name = in.readLine();
	}
	catch ( IOException e ) { }

	String cS;
	int proClass;


	/*=========================================
	  Start Protagonist class selector
	  =========================================*/

	//The while loop allows the player to keep rejecting their selection
	//so that they could get info on each class
	while (true) {
	
	    cS = "\nChoose your class: \n";
	    cS += "\t1: Assassin\n";
	    cS += "\t2: Knight\n";
	    cS += "\t3: Tank\n";
	    cS += "Selection: ";
	    System.out.print(cS);

	    try {
		proClass = Integer.parseInt( in.readLine() );
	    
		int yesNo;
	    
		if (proClass == 1) {
		    pat = new Assassin(name);
		    System.out.println("\nYou've selected Assassin\n\n"
				       + pat.about());
		    System.out.print("\nIs this your final choice?"
				     + "\n1: Yes"
				     + "\n2: No"
				     + "\nSelection: ");
		    try {
			yesNo = Integer.parseInt( in.readLine() );
			if (yesNo == 1) {
			    pat = new Assassin( name );
			    break;
			}
		    }
		    catch (NumberFormatException e) { }
		}

		if (proClass == 2) {
		    pat = new Knight(name);
		    System.out.println("\nYou've selected Knight\n\n"
				       + pat.about());
		    System.out.print("\nIs this your final choice?"
				     + "\n1: Yes"
				     + "\n2: No"
				     + "\nSelection: ");
		    try {
			yesNo = Integer.parseInt( in.readLine() );
			if (yesNo == 1) {
			    pat = new Knight( name );
			    break;
			}
		    }
		    catch (NumberFormatException e) { }
		}

		if (proClass == 3) {
		    pat = new Tank(name);
		    System.out.println("\nYou've selected Tank\n\n"
				       + pat.about());
		    System.out.print("\nIs this your final choice?"
				     + "\n1: Yes"
				     + "\n2: No"
				     + "\nSelection: ");
		    try {
			yesNo = Integer.parseInt( in.readLine() );
			if (yesNo == 1) {
			    pat = new Tank( name );
			    break;
			}
		    }
		    catch (NumberFormatException e) { }
		}
		
	    }//end try

	    catch(IOException e) { }
	    catch(NumberFormatException e) { }

	} //end while loop


	/*=========================================
	  End Protagonist class selector
	  =========================================*/


    }//end newGame()


    /*=============================================
      boolean playTurn -- simulates a round of combat
      pre:  Protagonist pat has been initialized
      post: Returns true if player wins (monster dies).
      Returns false if monster wins (player dies).
      =============================================*/
    public boolean playTurn()
    {
	int i = 1;
	int d1, d2;

	if ( Math.random() >= ( difficulty / 3.0 ) )
	    System.out.println( "\nNothing to see here. Move along!" );
	else {
	    System.out.println( "\nLo, yonder monster approacheth!" );

	    double monsterType = (Math.random() * 10);
	    if (monsterType < 5.5) {
		smaug = new Lich();
		System.out.println("It appears to be a Lich!");
	    }
	    else if (monsterType < 9.5) {
		smaug = new Ninja();
		System.out.println("It appears to be a Ninja!");
	    }
	    else {
		smaug = new Dragon();
		System.out.println("It appears to be a Dragon!");
	    }

	    while( smaug.isAlive() && pat.isAlive() ) {

		// Give user the option of using a special attack:
		// If you land a hit, you incur greater damage,
		// ...but if you get hit, you take more damage.
		try {
		    System.out.println( "\nDo you feel lucky?" );
		    System.out.println( "\t1: Nay.\n\t2: Aye!" );
		    i = Integer.parseInt( in.readLine() );
		}
		catch ( IOException e ) { }

		if ( i == 2 )
		    pat.specialize();
		else
		    pat.normalize();

		d1 = pat.attack( smaug );
		d2 = smaug.attack( pat );

		System.out.println( "\n" + pat.getName() + " dealt " + d1 +
				    " points of damage.");

		/*
		  I THINK THE PLAYER HEALTH AND THE MONSTER HEALTH SHOULD BE DISPLAYED
		*/

		System.out.println( "\n" + "Ye Olde Monster smacked " + pat.getName() +
				    " for " + d2 + " points of damage.");
	    }//end while

	    //option 1: you & the monster perish
	    if ( !smaug.isAlive() && !pat.isAlive() ) {
		System.out.println( "'Twas an epic battle, to be sure... " + 
				    "You cut ye olde monster down, but " +
				    "with its dying breath ye olde monster. " +
				    "laid a fatal blow upon thy skull." );
		return false;
	    }
	    //option 2: you slay the beast
	    else if ( !smaug.isAlive() ) {
		System.out.println( "HuzzaaH! Ye olde monster hath been slain!" );
		return true;
	    }
	    //option 3: the beast slays you
	    else if ( !pat.isAlive() ) {
		System.out.println( "Ye olde self hath expired. You got dead." );
		return false;
	    }
	}//end else

	return true;
    }//end playTurn()
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


    public static void main( String[] args )
    {
	//As usual, move the begin-comment bar down as you progressively 
	//test each new bit of functionality...


	//loading...
	YoRPG game = new YoRPG();

	int encounters = 0;

	while( encounters < MAX_ENCOUNTERS ) {
	    if ( !game.playTurn() )
		break;
	    encounters++;
	    System.out.println();
	}

	System.out.println( "Thy game doth be over." );

    }//end main

}//end class YoRPG


