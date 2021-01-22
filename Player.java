import java.util.ArrayList;
import java.util.List;

public class Player {
	
//Fields
		public List<Card> hand; //list of card in hand
		public int score; //set to 0 in the constructor
		public String name; // player name
	
//Constructor
		public Player (int score, String name) {
			this.score = 0;
			this.name = name;
			hand = new ArrayList<Card>();
		}
		
//Methods
//1. describePlayer (prints out information about the player AND calls the describe method for each card in the Hand List)
		public void describePlayer() {
			System.out.println( name + ", after drawing, has the following cards in their hand: ");
			for ( Card card : hand ) {
				card.describe(); 
			}
		}
//2. flip (removes and returns the top card of the Hand)
		public Card flip() {
			return hand.remove(hand.size() - 1);
		}
//3. draw (takes a Deck as an argument and calls the draw method on the deck, adding the returned Card to the hand field)
		//The function of this method occurs when the players draw their cards from the deck in the main method, and add 
		//them to their hands.
		
//4. incrementScore (adds 1 to the Player’s score field)	
		public void incrementScore() {
			score = score + 1;
		}
}//end class
