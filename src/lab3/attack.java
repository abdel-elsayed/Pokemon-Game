package lab3;

/***
 *Class that hold the information about the attack,
 *such as attack name, the power points required to perform the attack, 
 *and the damage caused by the attack
 *@author Abdel
 */
public class attack {
	private String name;
	private double PPrequired;
	private double damage;
	
	//default constructor
	public attack() {} 
	
	//parametrized constructor
	public attack(String n, double PPr, double d) {
		name = n;
		PPrequired = PPr;
		damage = d;
	}
	
	//accessors
	public String getName() {
		return name;
	}	
	public double getPPrequired() {
		return PPrequired;
	}	
	public double getDamage() {
		return damage;
	}	
	//mutators
	public void setName(String n) {
		name = n;
	}
	public void setPPrequired(double pp) {
		PPrequired = pp;
	}
	public void setDamage(double d) {
		damage = d;
	}
}
