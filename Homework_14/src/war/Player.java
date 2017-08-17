package war;

public class Player {

	public String name;
	Card[] playerCards;
	Card[] collectedCards;

	Player(String name) {
		
		this.name = name;
		playerCards = new Card[26];
		collectedCards = new Card[52];
	}

	Card drawOneCard(int nextCard) {
		
		return playerCards[nextCard];
	}
	
	void printCollectedCards() {
		
		System.out.println(this.name + "'s collected cards: ");
		for (int i = 0;  collectedCards[i] != null ; i++) {	
			System.out.print(collectedCards[i] + " ");
		}
		System.out.println();
	}
}
