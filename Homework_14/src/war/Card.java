package war;

public class Card {

	private String rank;
	int strength;
	private String suit;

	Card(String rank, int value, String suit) {
		
		this.rank = rank;
		this.strength = value;
		this.suit = suit;
	}
	
	@Override
	public String toString() {
		 
		return rank + suit;
	}
	
}
