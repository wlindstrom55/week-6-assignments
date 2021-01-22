
public class Card {

	
	private int value; //contains a value from 2-14 (representing 2 to ace high)
	private int suit; //0-3: hearts, spades, diamonds, clubs
	
	public Card (int value, int suit) { //constructor
		this.value = value;
		this.suit = suit;
	}

	public void describe() { //method that prints out information about a card.
		System.out.println(value + " of " + suit);
	}

//Getters & Setters
	public int getValue() {
		return value;
	}


	public void setValue(int value) {
		this.value = value;
	}


	public int getSuit() {
		return suit;
	}
	
	public void setSuit(int suit) {
		this.suit = suit;
	}
}//end class
