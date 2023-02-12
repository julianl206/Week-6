package week6War;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	// to make the deck we make an array of card called cards and assign a suit and value
	private List<Card> cards;
	
	public Deck() {
		cards = new ArrayList<>();
		
		String[] suits = {"Hearts","Clubs","Spades","Diamonds"};
		String[] value = {"1","2","3","4","5","6","7","8","9","10","Queen","King","Ace","Jack"};
		// this loop will help populate the 52 cards
			for (String suit : suits) {
				for (int i = 0; i < value.length; i++) {
					cards.add(new Card(i + 2, value[i] + " of " + suit));
				}
			}
		
	}
	// here i used collections.shuffle to make the shuffle method this will randomize the order of the card in my cards array
	public void shuffle() {
		Collections.shuffle(cards);
	}
	// this method returns the top card 
	public Card draw() {
		return cards.remove(0);
	}
	
	
	
	
	
	
	
	
	
	
	
}
