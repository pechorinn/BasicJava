package war;

import java.util.Arrays;
import java.util.Collections;

public class War {
	static int nextCard = 25;
    static Card[] deck = new Card[52];
	private String[] rankList = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A" };
	private String[] suitList = { "d", "h", "c", "s" };

	War(Player one, Player two) {
		this.fillDeckWithCards();
		this.shuffle();
		this.dealCardsToPlayers(one, two);
	}

	private void fillDeckWithCards() {

		for (int i = 0; i < deck.length; i++) {
			deck[i] = new Card(rankList[i % 13], i % 13, suitList[i % 4]);
		}
	}

	private void shuffle() {
		Collections.shuffle(Arrays.asList(deck));
	}

	private void dealCardsToPlayers(Player one, Player two) {

		for (int i = 0; i < deck.length / 2; i++) {
			one.playerCards[i] = deck[i];
		}

		for (int i = deck.length / 2; i < deck.length; i++) {
			two.playerCards[i - deck.length / 2] = deck[i];
		}
	}

	 void collectCardsForTheWinner(Card winner, Card loser, Player player) {
		for (int i = 0; i < player.collectedCards.length - 1; i++) {
			if (player.collectedCards[i] == null) {
				player.collectedCards[i] = winner;
				player.collectedCards[i + 1] = loser;
				break;
			}
		}
	}

	 void collectCardsForTheWinnerWhenCardsEqual(Card firstPlayerCard, Card secondPlayerCard, Player first,
			Player second) {

		int temp = War.nextCard;
		if (War.nextCard >= 3) {
			War.nextCard -= 3;
		} else {
			System.out.println("Cards left are less than 3. Drawing the next card to decide the hand.");
			if(War.nextCard > 0) {
				War.nextCard--;
			} 
		}
		
		firstPlayerCard = first.drawOneCard(War.nextCard);
		secondPlayerCard = second.drawOneCard(War.nextCard);

		if (firstPlayerCard.strength > secondPlayerCard.strength) {
			
			for (int i = 0; i <= temp - War.nextCard; i++) {
				
				firstPlayerCard = first.drawOneCard(War.nextCard + i);
				System.out.print(firstPlayerCard + " ");
				secondPlayerCard = second.drawOneCard(War.nextCard + i);
				System.out.print(secondPlayerCard);
				if(i==0)System.out.print(" - This is the pair that decides the hand. "+ first.name +  " collects the hand.");
				System.out.println();
				this.collectCardsForTheWinner(firstPlayerCard, secondPlayerCard, first);
			}		
			return;
			
		} else if (firstPlayerCard.strength < secondPlayerCard.strength) {
			
			for (int i = 0; i <= temp - War.nextCard; i++) {
				
				firstPlayerCard = first.drawOneCard(War.nextCard + i);
				System.out.print(firstPlayerCard+ " ");
				secondPlayerCard = second.drawOneCard(War.nextCard + i);
				System.out.print(secondPlayerCard);
				if(i==0)System.out.print(" - This is the pair that decides the hand. "+ second.name +  " collects the hand.");
				System.out.println();
				this.collectCardsForTheWinner(secondPlayerCard, firstPlayerCard, second);
			}
			return;
		}

		if (firstPlayerCard.strength == secondPlayerCard.strength) {
			
			while (firstPlayerCard.strength == secondPlayerCard.strength) {
				War.nextCard--;
				if (War.nextCard < 0) {
					break;
				}
								
				firstPlayerCard = first.drawOneCard(War.nextCard);
			//	System.out.println(firstPlayerCard);
				secondPlayerCard = second.drawOneCard(War.nextCard);
			//	System.out.println(secondPlayerCard);

				if (firstPlayerCard.strength > secondPlayerCard.strength) {
					
					for (int i = 0; i <= temp - War.nextCard; i++) {
						
						firstPlayerCard = first.drawOneCard(War.nextCard + i);
						System.out.print(firstPlayerCard + " ");
						secondPlayerCard = second.drawOneCard(War.nextCard + i);
						System.out.print(secondPlayerCard);
						if(i==0)System.out.print(" - This is the pair that decides the hand. "+ first.name +  " collects the hand.");
						System.out.println();

						this.collectCardsForTheWinner(firstPlayerCard, secondPlayerCard, first);
					}
					return;

				} else if (firstPlayerCard.strength < secondPlayerCard.strength) {
					
					for (int i = 0; i <= temp - War.nextCard; i++) {
						
						firstPlayerCard = first.drawOneCard(War.nextCard + i);
						System.out.print(firstPlayerCard+ " ");
						secondPlayerCard = second.drawOneCard(War.nextCard + i);
						System.out.print(secondPlayerCard);
						if(i==0)System.out.print(" - This is the pair that decides the hand. "+ second.name +  " collects the hand.");
						System.out.println();

						this.collectCardsForTheWinner(secondPlayerCard, firstPlayerCard, second);
					}
					return;
				}
			}
		}
	}
}
