package week6War;

import java.util.ArrayList;
import java.util.List;

public class Player {
	// setting the fields for the player class
private List<Card> hand;
private int score;
private String name;

	public Player(String name) {
		hand = new ArrayList<>();
		score = 0;
		this.name = name;
		
	}
	// a list of card called getHand that will return a card 
	public List<Card> getHand() {
		return hand;
	}
	// getters and setters for name and score 
	public int getScore() {
		return score;
	}
	
	public void setScore (int score) {
		this.score = score;
	}
	public String getName() {
		return name;
	}
	public void setName (String name) {
		this.name = name;
	}
	// describe method to keep track of game 
	public void describe() {
		System.out.println("Player: " + name);
		System.out.println("Score: " + score);
		System.out.println("Current Hand");
			for (Card card : hand) {
				card.describe();
			}
			// removes and returns top card
	}
	public Card flip() {
		if (hand.isEmpty()) {
			return null;
		}
	return hand.remove(0);
	
	
	// draw method take card from deck to hand
}

	public void draw(Deck deck) {
		Card card = deck.draw();
		if ( card != null) {
			hand.add(card);
		}
	}
	
	// adds +1 to score
	public void incrementScore() {
		score++;
	}
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	