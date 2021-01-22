import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	
	public List<Card> deck; //list of cards, initialized in the constructor below
	
	public Deck() {  //deck constructor
		deck = new ArrayList<>();
		unpack();
	}
	
	public void shuffle() { //randomizes the order of the cards in the deck
			Collections.shuffle(deck);
	}
	
	public Card draw() { // removes and returns the top card of the cards field
		return deck.remove(deck.size() - 1);
	}
	
	private void unpack() {
		for ( int suit = 0; suit < 4; suit++ ) { // builds the suits
			for (int value = 2; value < 15; value ++ ) { //builds the values within the suits
				deck.add( new Card ( value , suit ) ); //creates the cards inside the deck
			}
		}		
	}

}

	

