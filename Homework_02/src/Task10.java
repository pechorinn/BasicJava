package homework;

import java.util.Scanner;

/*Трябва да се напълни цистерна с вода. Имате 2 кофи с вместимост 2 и
3 литра и ги ползвате едновременно.
Да се състави програма, която по даден обем извежда как ще прелеете
течността с тези кофи, т.е. по-колко пъти ще се пълни всяка от
кофите. Кофите не могат да се ползват с частично количество вода.
Входни данни: естествено число от интервала [10..9999].
*/

public class Task10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int volume;
		do {
			System.out.println(
					"Please enter a natural number representing the volume of a tank within range of 10 to 9999: ");
			volume = sc.nextInt();
		} while (volume < 10 || volume >= 10000);
		sc.close();
		if (volume % 5 == 0) {
			int count = volume / 5;
			System.out.println(count + " times by 2 liters.");
			System.out.println(count + " times by 3 liters.");
		} else if (volume % 5 == 1) {
			int count = volume / 5 - 5;
			System.out.println(count + " times with 2 liters.");
			System.out.println(count + " times by 3 liters.");
			System.out.println("Additionally 2 with by 3 liters.");
		} else if (volume % 5 == 2) {
			int count = volume / 5;
			System.out.println(count + " times with 2 liters.");
			System.out.println(count + " times with 3 liters.");
			System.out.println("Additionally 1 time with 2 liters.");
		} else if (volume % 5 == 3) {
			int count = volume / 5;
			System.out.println(count + " times with 2 liters.");
			System.out.println(count + " times with 3 liters.");
			System.out.println("Additionally 1 time with 3 liters.");
		}else if (volume % 5 == 4) {
			int count = volume / 5;
			System.out.println(count + " times with 2 liters.");
			System.out.println(count + " times with 3 liters.");
			System.out.println("Additionally 2 tim4 with 2 liters.");
		}
	}
}