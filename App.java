public class App {

	public static void main(String[] args) {
		
//3. Instantiate a Deck and two Players, call the shuffle method on the deck.
		Deck gameDeck = new Deck();
		
		Player p1 = new Player (0, "Player 1");
		Player p2 = new Player(0, "Player 2");
		
		gameDeck.shuffle();
		
//4. Using a traditional for loop, iterate 52 times calling the Draw method on the other player each iteration using the Deck you instantiated.
		for (int i = 0; i < 52; i++) {
			if (i % 2 == 0) {
				p1.hand.add( gameDeck.draw() );
			} else {
				p2.hand.add( gameDeck.draw() );
			}
		 }
		p1.describePlayer();
		p2.describePlayer();
//5. Using a traditional for loop, iterate 26 times and call the flip method for each player.
//	        a. Compare the value of each card returned by the two player’s flip methods. 
// 			b. Call the incrementScore method on the player whose card has the higher value.
		System.out.println("\nFlip:");
		for (int p = 0; p < 26; p++) {
			Card c1 = p1.flip();
			Card c2 = p2.flip();
			if (c1.getValue() > c2.getValue()) {
				p1.incrementScore();
				System.out.println("Player 1 wins the flip with " + c1.getValue() + " against " + c2.getValue() + " and has a score of " + p1.score);
			} if (c2.getValue() > c1.getValue()){
				p2.incrementScore();
				System.out.println("Player 2 wins the flip with " + c2.getValue() + " against " + c1.getValue() + " and has a score of " + p2.score);
			} if (c1.getValue() == c2.getValue()) {
				System.out.println("Players 1 & 2 both flipped a " + c1.getValue() + " and neither score."); //c1.getValue is only there to show the tie value
			}
		}
		
//6. After the loop, compare the final score from each player. 
		//7. Print the final score of each player and either “Player 1”, “Player 2”, or “Draw” depending on which score is higher or if they are both the same.
		System.out.println("\nPlayer 1 ends with a score of " + p1.score);
		System.out.println("Player 2 ends with a score of " + p2.score);
		
		if (p1.score > p2.score) {
				System.out.println("Player 1 is the winner!");
			} if (p2.score > p1.score) {
				System.out.println("Player 2 is the winner!");
			} if (p2.score == p1.score) {
				System.out.println("Player 1 and Player 2 have tied in a draw!");
			}
			
	} //end main method
	
} //end App