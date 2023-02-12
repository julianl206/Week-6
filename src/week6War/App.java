package week6War;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// call the deck and add two players
		 Deck deck = new Deck();
	        deck.shuffle();
	        Player player1 = new Player("Player 1");
	        Player player2 = new Player("Player 2");

	        for (int i = 0; i < 26; i++) {
	            player1.draw(deck);
	            player2.draw(deck);
	        }

	        for (int i = 0; i < 26; i++) {
	            Card card1 = player1.flip();
	            Card card2 = player2.flip();
	            System.out.println("Player 1 flipped " + card1.getName());
	            System.out.println("Player 2 flipped " + card2.getName());
	            if (card1.getValue() > card2.getValue()) {
	                player1.incrementScore();
	                System.out.println("Player 1 wins this round");
	            } else if (card2.getValue() > card1.getValue()) {
	                player2.incrementScore();
	                System.out.println("Player 2 wins this round");
	            } else {
	                System.out.println("Draw");
	            }
	            System.out.println("Player 1: " + player1.getScore() + " points");
	            System.out.println("Player 2: " + player2.getScore() + " points");
	            System.out.println();
	        }

	        if (player1.getScore() > player2.getScore()) {
	            System.out.println("Player 1 wins the game with " + player1.getScore() + " points");
	        } else if (player2.getScore() > player1.getScore()) {
	            System.out.println("Player 2 wins the game with " + player2.getScore() + " points");
	        } else {
	            System.out.println("Draw");
		
	        }
	}

}
