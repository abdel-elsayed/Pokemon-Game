package lab3;

import java.util.Scanner;
/***
 * HumanPlayer represents the user and inherites from Player abstract class
 * @author Abdel
 *
 */
public class HumanPlayer extends Player {
	//constructors
	public HumanPlayer() {}
	
	public HumanPlayer(String n, Pokemon p, HitPointsPotion hpp) {
		super(n,p,hpp);
	}
	
	
	//implments of the super class abstract methods
	@Override
	public Pokemon getPokemon() {
		return this.poke;
	}
	@Override
	public Item getItem() {
		return this.item;
	}
	@Override
	public void run() {
		System.out.println(name + " is leaving the battle");
		this.getPokemon().setHitPts(0.0);
	}
	
	
	/***
	 * this method allows the user to choose what to do with his turn,
	 * and calls the attack function with an int that indicated the attack chosen by player
	 */
	@Override
	public void turn(Player other) {
			
			System.out.println("Now is " + this.name + "'s turn...." );
			System.out.println("Enter 1 to attack, 2 to use your item, or 9 to Run from the battle: " );
			Scanner input = new Scanner(System.in);
			int inputChoice = input.nextInt();
			
			// user uses the item
			if(inputChoice == 2)
			{	
				this.getItem().use(this.getPokemon());
				 return;
			}
			
			// user runs from battle
			if(inputChoice == 9) 
			{	
				this.run();
				 return;
			}
			
			//this.getPokemon().attack(other.getPokemon(), 'u');
			
			System.out.println("Choose your Attack");
			//prompting the user to choose the attack
			for(int i = 0; i < this.poke.attacks.length; i++) 
				System.out.println(i + "- " + this.poke.attacks[i].getName() + ".. damage-> " + this.poke.attacks[i].getDamage() );
			
			int inputAttack = input.nextInt();
			
			this.getPokemon().attack(other.getPokemon(), inputAttack);
			
			
	}
}
		

