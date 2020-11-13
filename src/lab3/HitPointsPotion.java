package lab3;

/***
 * represents an item that the user can use during a battle
 * implements the interface Item and increases the hit points of pokemon
 * @author Abdel
 *
 */
public class HitPointsPotion implements Item{

	private String name;
	private double effect; 
	private boolean isUsed = false; 
	
	public HitPointsPotion() {
		effect = 10.0;
	}
	
	//accessors and mutators
	public void setName(String n) {
		name = n;
	}

	public void setEffect(double e) {
		effect = e;
	}
	
	public String getName() {
		return name;
	}
	
	public double getEffect() {
		return effect;
	}

	
	// implemetns the method in the interface Item, this potion increases the hit points by 10 pts
	public void use(Pokemon p) {
		if(!isUsed) 
		{
			double tempHit = p.getHitPts();
			p.setHitPts(p.getHitPts() + effect);
			System.out.println("You just used the Hit Points Potion, it increased from " + tempHit + " to " + p.getHitPts() );
			
			isUsed = false;
		}else 
			System.out.println("No more Items left with you.");	
			
	}

}
