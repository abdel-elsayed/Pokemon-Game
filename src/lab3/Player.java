package lab3;

/***
 * Abstract class Player represents a player in the battle 
 * @author Abdel
 *
 */
public abstract class Player{
		protected String name;
		protected Pokemon poke;
		protected Item item;
	
		//consturctors
		public Player() {}
		public Player(String n, Pokemon p, Item i) {
			name = n;
			poke = p;
			item = i; 
		}
		
		//abstract methods
		public abstract Pokemon getPokemon(); 
		public abstract Item getItem();
		public abstract void run(); // player chooses to leave the battle
		public abstract void turn(Player other); // indicates if the player has the turn to play
		
		//accessor and mutator
		public String getName() {
			return name;
		}
			
		public void setName(String n) {
			name = n;
		}


		
}