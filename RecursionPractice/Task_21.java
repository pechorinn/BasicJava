package recursionpractise;

import java.util.Scanner;

/*
Дадено е наредено тесте карти. 
Наредбата по тежест на карта е: 2,3,4,5,6,7,8,9,10, Вале, Дама, 
Поп, Асо.
Наредбата по цвят на картите е: спатия, каро, купа, пика.
Да се създаде програма, чрез която се въвежда N - число от 
интервала [1..52] и се извеждат въведения номер карта и 
останалите по-големи карти от тестето. 
Пример: 47. 
Изход: Поп купа, Поп пика, Асо спатия, Асо каро, Асо купа, Асо 
пика
 */
public class Task_21 {

	public static void main(String[] args) {

		String[] rank = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Вале", "Дама", "Поп", "Асо" };
		String[] suit = { "Спатия", "Каро", "Купа", "Пика" };

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
