package week6War;

public class Card {
	// to create the card class we start with two fields for the value of the card and name of the card
	private int value;
	private String name;
	
	// now that we have declared that information we can assign these traits to a card
public Card(int value, String name) {
	this.value = value;
	this.name = name;
}
	// getters and setters allow us to use the information in this class in another class later on 
public int getValue() {
	return  value;
}
public void setValue(int value) {
	this.value = value;

}

public String getName() {
	return name;
}
	public void setName(String name) {
		this.name = name;
	}
	
	public void describe() {
		System.out.println("Card: " + name + ", Value: " + value);
	}
	
	
	
	
	
	
	
	
	
}
