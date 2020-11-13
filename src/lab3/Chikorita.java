package lab3;
import java.util.Scanner;

/***
 * Chikorita is a pokemon(extends the Pokemon Class) of type Grass.
 * @author Abdel
 */
public class Chikorita extends Pokemon {

	//default 
	public Chikorita() {
			this.name = "Chikorita";
			this.hitPts = 44.0;
			this.powerPts = 48.0;
			this.type = "Grass";
			this.attacks = new attack[] {new attack("Tackle!", 3.0, 10.0) , new attack("Vine Whip!", 5.0, 15.0),new attack("Grass Knot!", 7.0, 17.0)};
	}
	
	//parametrized
	public Chikorita(String n, double hp, double pp) {
		super(n, hp, pp, "Grass");
		this.attacks = new attack[] {new attack("Tackle!", 3.0, 10.0) , new attack("Vine Whip!", 5.0, 15.0),new attack("Grass Knot!", 7.0, 17.0)};
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
	 * This method displays what the Pokemon would say if it speaks!
	 */
	public void speak() {
		System.out.println(name + ".." + name + ":)");
	}
}
