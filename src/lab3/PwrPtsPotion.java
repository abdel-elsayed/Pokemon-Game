package lab3;
/***
 * represents an item that the user can use during a battle
 * implements the interface Item and increases the hit points of pokemon
 * @author Abdel
 *
 */
public class PwrPtsPotion implements Item{
	
	private String name;
	private double effect; 
	private boolean isUsed = false; 
	
	public PwrPtsPotion() {
		effect = 5.0;
	}

	//accessors and mutators
		public void setEffect(double e) {
			effect = e;
		}
		public double getEffect() {
			return effect;
		}
		// implemetns the method in the interface Item, this potion increases the hit points by 10 pts
		public void use(Pokemon p) {
			if(!isUsed) 
			{
				double tempPwr = p.getPwrPts();
				p.setPwrPts(p.getPwrPts() + effect);
				System.out.println("The Power Points Potion is used, it increased from " + tempPwr + " to " + p.getPwrPts() );
				
				isUsed = false;
			}else 
				System.out.println("No more Items left with you.");	
				
		}
}