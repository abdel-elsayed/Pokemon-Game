package lab3;
import java.util.Scanner;


/***
 * A driver class that runs the game, displays the main menu
 * and determines if the game ended and who won.
 * @author Abdel 
 *
 */
public class Game {
	// global variables
	private Player Human;
	private Player Computer;
	
	//default constructor
	public Game() {
		HitPointsPotion HPP =  new HitPointsPotion();
		PwrPtsPotion PPP =  new PwrPtsPotion();
		Pokemon sasa = new Squirtle("Squirtle", 50,48.0);
		Pokemon gaga = new Gastly("Gastly", 44.0,49.0);
		Pokemon chi = new Chikorita("Chikorita", 42.0,30.0);
		
		Computer = new ComputerPlayer(sasa, PPP);
		Human = new HumanPlayer();
		
		System.out.println("*********************************WELCOM TO THE POKEMON GAME***********************************");
		System.out.println("Please choose your pokemon:\n1- Squirtle \n2- Gastly \n3- Chikorita");
		
		// allowing the user to choose which pokemon to play with
		Scanner in = new Scanner(System.in);
		int choice = in.nextInt();
		if (choice == 1) {
			Human = new HumanPlayer("User101", sasa, HPP);
		}else if(choice == 2) {
			Human = new HumanPlayer("User101", gaga, HPP);
		}else if(choice == 3) {
			Human = new HumanPlayer("User101", chi, HPP);
		}
		//in.close();
		
		displayResult(); // display the game board
		
		do {
			
			Computer.turn(Human);
			System.out.println("\n");
			
			if(isWin()) break;
			
			Human.turn(Computer);
			
			System.out.println("\n\n");
			displayResult();
			
		}while(!isWin());
		
		displayResult();
	}
	
	
	/***
	 * this function displays the result for the game board	
	 */
	public void displayResult() {
		String column1Format = "%-30s";
		String column2Format = "%-30s";
		String column3Format = "%-30s";
		String column4Format = "%-30s";
		String column5Format = "%-30s";
		String formatInfo = column1Format + " " + column2Format+ " " + column3Format + " " + column4Format + " " + column5Format;

		 System.out.println("//////////////////////////////////// RESULT BOARD ////////////////////////////////////");
		 System.out.format(formatInfo,"player name", "Pokemon ","Pokemon Type" , "Hit Points", "Power points");
		 System.out.println();
		 System.out.format(formatInfo,Human.getName(), Human.getPokemon().getName() ,Human.getPokemon().getType(), Human.poke.getHitPts(), Human.poke.getPwrPts() );
		 System.out.println();
		 System.out.format(formatInfo,Computer.getName(), Computer.getPokemon().getName() ,Computer.getPokemon().getType(), Computer.poke.getHitPts(), Computer.poke.getPwrPts() );
		 System.out.println();
		 System.out.println();
		 System.out.println();
	}

	/***
	 * this function checks if the game ended by either players winning  
	 * @return a boolean true if the user or the computer win
	 * and return false if no player wins.
	 */
	public boolean isWin() {	
		if(Computer.getPokemon().getHitPts() <= 0)
		{
			System.out.println("Gamee is over ");
			System.out.println("******" + Human.name + " wins!!!  ******");
			return true;
		}
		else if(Human.getPokemon().getHitPts() <= 0) {
			System.out.println("Gamee is over ");
			System.out.println("******" + Computer.name + " wins!!!  ******");
			return true;
		}
		return false;	
	}

}
