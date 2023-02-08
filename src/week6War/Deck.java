package week6War;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

	private List<Card> cards;
	
	public Deck() {
		cards = new ArrayList<>();
		
		String[] suits = {"Hearts","Clubs","Spades","Diamonds"};
		String[] value = {"1","2","3","4","5","6","7","8","9","10","Queen","King","Ace","Jack"};
		
			for (String suit : suits) {
				for (int i = 0; i < value.length; i++) {
					cards.add(new Card(i + 2, value[i] + " of " + suit));
				}
			}
		
	}
	
	public void shuffle() {
		Collections.shuffle(cards);
	}
	
	public Card draw() {
		return cards.remove(0);
	}
	
	
	
	
	
	
	
	
	
	
	
}
