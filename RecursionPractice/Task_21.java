package recursionpractise;

import java.util.Scanner;

/*
������ � �������� ����� �����. 
��������� �� ������ �� ����� �: 2,3,4,5,6,7,8,9,10, ����, ����, 
���, ���.
��������� �� ���� �� ������� �: ������, ����, ����, ����.
�� �� ������� ��������, ���� ����� �� ������� N - ����� �� 
��������� [1..52] � �� �������� ��������� ����� ����� � 
���������� ��-������ ����� �� �������. 
������: 47. 
�����: ��� ����, ��� ����, ��� ������, ��� ����, ��� ����, ��� 
����
 */
public class Task_21 {

	public static void main(String[] args) {

		String[] rank = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "����", "����", "���", "���" };
		String[] suit = { "������", "����", "����", "����" };

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter number from 1 to 52: ");
		int card = sc.nextInt();
		sc.close();
		if (card < 1 || card > 52) {
			System.out.println("Please enter input within range 1-52.");
		} else {

			int startCardPosition = ((card - 1) / 4);
			int startSuitPosition = (card - 1) % 4;

			printCards(startCardPosition, startSuitPosition, 3, 12, rank, suit);
		}
	}

	static void printCards(int startCardPosition, int startSuitPosition, int cardSuit, int cardStack, String[] rank,
			String[] suit) {

		if (cardStack == startCardPosition && cardSuit == startSuitPosition - 1) {
			return;
		}

		if (cardSuit == -1 && cardStack > startCardPosition) {
			cardSuit = 3;
			cardStack -= 1;
		}

		printCards(startCardPosition, startSuitPosition, cardSuit - 1, cardStack, rank, suit);
		System.out.print(rank[cardStack] + " " + suit[cardSuit] + " ");

	}
}
