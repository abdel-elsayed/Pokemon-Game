package lab3;

/***
 * abstract class of the pokemon used in the battle
 * @author Abdel
 *
 */
public abstract class Pokemon {
	protected String name;
	protected double hitPts;
	protected double powerPts;
	protected String type;
	protected attack [] attacks;
	
	// default constructor
	public Pokemon() {
		name = " ";
		hitPts = 0.0;
		powerPts = 0.0;
		type = " ";
	}
	
	// parametrized constructor
	public Pokemon(String n, double hp, double pp, String t) {
		name = n;
		hitPts = hp;
		powerPts = pp;
		type = t;
	}
	
	// abstract methods
	public abstract void attack(Pokemon other, int Att);
	public abstract void speak();
	
	
	// mutators and accessors
	public String getName() {
		return name;
	} 
	public double getHitPts() {
		return hitPts;
	}
	public double getPwrPts() {
		return powerPts;
	}
	public String getType() {
		return type;
	} 
	
	
	public void setName(String n) {
		name =n;
	}
	public void setHitPts(double htpt) {
		hitPts = htpt;
	}
	public void setPwrPts(double pwrpts) {
		powerPts = pwrpts;
	}
	public void setType(String t) {
		type = t;
	}
	
	
/***
 * this method determines what damage is caused by the attack depending on the type of the pokemon
 * 
 * @param enemy the pokemon that is being attacked
 * @param myAttack the attack that is performed by the pokemon attacking
 * @return a new attack with the updated damage values
 */
public attack typeEffect(Pokemon enemy, attack myAttack) {
		
		attack tempAttack = new attack(myAttack.getName(), myAttack.getPPrequired(), myAttack.getDamage());
		System.out.println( this.name.toUpperCase() +"! " + "ATTACK WITH " + myAttack.getName());
		
		if(this.getType() == "Poison" &&  (enemy.getType() == "Grass" || enemy.getType() == "Water")){
			tempAttack.setDamage(myAttack.getDamage()+ myAttack.getDamage() * 0.5);
			System.out.println("This attack had %150 effect because " + this.getName() + "{" +this.getType()+"} " +
			"attacked "+ enemy.getName() + "{" + enemy.getType()+"} " );
		}
		if(this.getType() == "Water" &&  (enemy.getType() == "Grass" || enemy.getType() == "Poison")){
			tempAttack.setDamage(myAttack.getDamage()+ myAttack.getDamage() * 0.3);
			System.out.println("This attack had %130 effect because " + this.getName() + "{" +this.getType()+"} " +
			"attacked "+ enemy.getName() + "{" + enemy.getType()+"} " );
		}
		if(this.getType() == "Grass" &&  enemy.getType() == "Water"){
			tempAttack.setDamage(myAttack.getDamage()+ myAttack.getDamage() * 0.7);
			System.out.println("This attack had %170 effect because " + this.getName() + "{" +this.getType()+"} " +
			"attacked "+ enemy.getName() + "{" + enemy.getType()+"} " );
		}
			
		return tempAttack;
	}
}
