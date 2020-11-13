package lab3;

import java.util.Scanner;

/***
 * Gastly is a pokemon that inherites from the Pokemon Class, of type Poison/Dark
 * @author Abdel 
 *
 */
public class Gastly extends Pokemon {
	
	//default
	public Gastly() {
	this.name = "Gastly";
	this.hitPts = 39.0;
	this.powerPts = 51.0;
	this.type = "Poison";
	this.attacks = new attack[] {new attack("Sucker Punch!", 3.0, 10.0) , new attack("Dark Pulse", 5.0, 15.0),new attack("Destiny Ball!", 7.0, 17.0)};
	}
	
	//parametrized
	public Gastly(String n, double hp, double pp) {
		super(n, hp, pp, "Poison");
		this.attacks = new attack[] {new attack("Sucker Punch!", 3.0, 10.0) , new attack("Dark Pulse", 5.0, 15.0),new attack("Destiny Ball!", 7.0, 17.0)};
	
	}
	
	@Override
	/***
	 * this function displays a menu of the possible attacks to the player to choose from, 
	 * then performs the attack and changes the opponents health accordingly.
	 **/
	public void attack(Pokemon other, int Att) {
		//creating a new attack with the updated damage amount depending the type of pokemon
		attack AA = this.typeEffect(other, attacks[Att]); 
		int inputAttack;
	
		System.out.println(this.name.toUpperCase() + " Perform the attack " + attacks[Att].getName());
		//Checking if the pokemon has enough power points to perform the attack
		if (this.powerPts - AA.getPPrequired() >= 0 )
		{
			this.powerPts -= AA.getPPrequired();
			
		    other.setHitPts(other.getHitPts() - AA.getDamage()); // updating the opponents health
			
		}else
			System.out.println( this.name + " doesn't have enough power point to perform " + AA.getName());
	}
	
	@Override
	/***
	 * This method displays what the pokemon would say if it speaks!
	 */
	public void speak() {
		System.out.println(name.toUpperCase() + "!.." + name.toUpperCase() + "*angrily*  >:(");
	}
}
