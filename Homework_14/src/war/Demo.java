package war;

import java.util.Arrays;

/*
 ���������� �� ��� �� �� ��������� ������ �� ����� �������.
�� ������� �� ����� � ����� �� 52 �����. ������ �� ����� �� ����� ������. ����� ����� 
��� �� 26 ����� �� ������ �����.
������ �� ����� �� ������� �����:
����� �� ������� ������ ������� �����. ����� �������� ����� �� ��������� �� ���� � 
������� � ��-������� ����� ������� ����� �����. ������� �� �������� � ������� �����.
��� ������� �� � ������� ���� (���������� �� �����), ����� ����� ������ �� ������ ��� 
���� ����� � ���� ���. ������� �� ������ ����� �� �������� ��� ��������� ������� ����� 
�� ������ �����. ����������� ������� ������ �����, ����� �� �������� (� ������ ���� 
8 �����). ��� ������� ����� ������ �� ����� �� ����, �������� ����� �� ���� ����� � 
��������� ���, ������ �� �� ������ ������� � ������. ����������� ������� �������� 
�����, ����� �� ��������.
���� ���� �������� �������� �������� 26 �����, �� �������� ���������� ������ ���� ���
����� � �������� ���-����� �����.
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
