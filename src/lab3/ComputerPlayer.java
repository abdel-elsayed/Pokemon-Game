package lab3;

import java.util.Scanner;

/***
 * represents the Computer and extends the Player class
 * @author Abdel
 *
 */
public class ComputerPlayer extends Player {
	
	//default
	public ComputerPlayer() {}
	
	//parametrized
	public ComputerPlayer(Pokemon p, Item i){
		super("machin_x", p,i);
	}

	// implements the abstract method of parent class
	@Override
	public Pokemon getPokemon() {
		return this.poke;
	}
	
	// implements the abstract method of parent class
	@Override
	public Item getItem() {
		return this.item;
	}

	@Override
	public void run() {
		System.out.println("Computer is leaving the battle");
	}
	
	
	/***
	 * displays which player has the turn now, and calls the attack function with an int
	 * that determines which attack to perform 
	 */
	public void turn(Player other) {
		System.out.println("Now is " + this.name + "'s turn...." );
		
		int rand = (int)(Math.random() * (0 + 3));
		
		// computer chooses to use the item
		if (rand == 0 ) {
			this.item.use(this.getPokemon());
			return;
		}
		
		// computer chooses to attack
		System.out.println(this.name +  " Chose to attack! ");
		this.getPokemon().attack(other.getPokemon(), rand );		
	}

}
