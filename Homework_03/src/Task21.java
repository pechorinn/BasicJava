package homework3;

import java.util.Scanner;

/*Дадено е наредено тесте карти.
Наредбата по тежест на карта е: 2,3,4,5,6,7,8,9,10, Вале, Дама, Поп, Асо.
Наредбата по цвят на картите е: спатия, каро, купа, пика.
Да се създаде програма, чрез която се въвежда N - число от
интервала [1..51] и се извеждат въведения номер карта и
останалите по-големи карти от тестето.
Пример: 47.
Изход: Поп купа, Поп пика, Асо спатия, Асо каро, Асо купа, Асо пика */
public class Task21 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the card number from 1 to 52: ");
		int card = sc.nextInt();
		sc.close();
		if (card < 1 || card > 52) {
			System.out.println("Wrong input! Please try again.");
		} else {

			for (int i = card; i <= 52; i++) {

				int cardNumber = (i - 1) / 4 + 1;
				int cardSuit = i % 4;

				switch (cardNumber) {
				case 1:
					System.out.print("Двойка ");
					break;
				case 2:
					System.out.print("Тройка ");
					break;
				case 3:
					System.out.print("Четворка ");
					break;
				case 4:
					System.out.print("Петица ");
					break;
				case 5:
					System.out.print("Шестица ");
					break;
				case 6:
					System.out.print("Седмица ");
					break;
				case 7:
					System.out.print("Осмица ");
					break;
				case 8:
					System.out.print("Девятка ");
					break;
				case 9:
					System.out.print("Десятка ");
					break;
				case 10:
					System.out.print("Вале ");
					break;
				case 11:
					System.out.print("Дама ");
					break;
				case 12:
					System.out.print("Поп ");
					break;
				case 13:
					System.out.print("Асо ");
					break;
				}

				switch (cardSuit) {
				case 1:
					System.out.print("спатия");
					break;
				case 2:
					System.out.print("каро");
					break;
				case 3:
					System.out.print("купа");
					break;
				case 0:
					System.out.print("пика");
					break;
				}

				if (i == 52) {
					System.out.print(".");
				} else {
					System.out.print(", ");
				}
			}
		}
	}
}
