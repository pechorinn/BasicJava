package war;

import java.util.Arrays;

/*
 упражнение по ООП Да се реализира играта на карти „Война“.
На „Война“ се играе с тесте от 52 карти. Играта се играе от двама играча. Всеки играч 
има по 26 карти от цялото тесте.
Играта се играе по следния начин:
Всеки от двамата играчи показва карта. Двете показани карти се сравняват по сила и 
играчът с по-силната карта прибира двете карти. Картите се прибират в отделен масив.
Ако картите са с еднаква сила (независимо от боята), всеки играч трябва да заложи три 
нови карти в този ред. Третата от новите карти се сравнява със съответно третата карта 
на другия играч. Победителят прибира всички карти, които са показани (в случая общо 
8 карти). Ако третите карти отново са равни по сила, играчите вадят по една карта и 
сравняват нея, докато не се получи разлика в силите. Победителят прибира всичките 
карти, които са показани.
След като играчите извъртят всичките 26 карти, се определя победителя според това кой
играч е спечелил най-много карти.
 */
public class Demo {

	public static void main(String[] args) {

		Player ivan = new Player("Ivan");
		Player petar = new Player("Petar");
		War newGame = new War(ivan, petar);
		System.out.println("Cards given to Ivan: " + Arrays.toString(ivan.playerCards));
		System.out.println("Cards given to Petar: " + Arrays.toString(petar.playerCards));
		Card firstPlayerCard;
		Card secondPlayerCard;

		while (War.nextCard >= 0) {

			firstPlayerCard = ivan.drawOneCard(War.nextCard);
			secondPlayerCard = petar.drawOneCard(War.nextCard);
			if (firstPlayerCard.strength > secondPlayerCard.strength) {
				System.out.print("Cards on table: " + firstPlayerCard + " vs " + secondPlayerCard);
				System.out.println(" - Ivan collects the cards.");
				newGame.collectCardsForTheWinner(firstPlayerCard, secondPlayerCard, ivan);
				War.nextCard--;
			} else if (firstPlayerCard.strength == secondPlayerCard.strength) {
				System.out.println("It was a tie: ");
				newGame.collectCardsForTheWinnerWhenCardsEqual(firstPlayerCard, secondPlayerCard, ivan, petar);
				War.nextCard--;
			} else {
				System.out.print("Cards on table: " + firstPlayerCard + " vs " + secondPlayerCard);
				System.out.println(" - Petar collects the cards.");
				newGame.collectCardsForTheWinner(secondPlayerCard, firstPlayerCard, petar);
				War.nextCard--;
			}
		}

		int countOfCardsIvan = 0;

		for (int i = 0; ivan.collectedCards[i] != null; i++) {
			countOfCardsIvan++;
		}
		System.out.println("_____________________________________");
		System.out.println();
		if (countOfCardsIvan > 26) {
			System.out.println("Ivan won, he collected " + countOfCardsIvan + " cards.");
		} else if (countOfCardsIvan == 26) {
			System.out.println("It's a draw. Both players collected 26 cards.");
		} else {
			System.out.println("Petar won, he collected " + (52 - countOfCardsIvan) + " cards.");
		}

		ivan.printCollectedCards();
		petar.printCollectedCards();

	}
}
