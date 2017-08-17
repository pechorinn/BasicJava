package lesson_08;

import java.util.Scanner;

/*
 Да се състави програма, чрез която се въвеждат последователно две 
редици от символи без интервали. 
Програмата да извежда съобщение за резултата от сравнението им по 
позиции.
Пример: хипопотам, хипопотук
Изход:
Двата низа са с равна дължина.
Разлика по позиции:
8 а-у
9 м-к
 */
public class Task_03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter first sequence of characters without spaces: ");
		String str1 = sc.next();
		System.out.println("Please enter second sequence of characters without spaces: ");
		String str2 = sc.next();
		printResult(str1, str2);

		sc.close();
	}

	static void printResult(String str1, String str2) {
		int min = 0;
		if (str1.length() == str2.length()) {
			System.out.println("Both strings have equal lengths.");
			min = str1.length();
		} else if (str1.length() > str2.length()) {
			System.out.println("The first strin is longer.");
			min = str2.length();
		} else {
			System.out.println("The second string is longer.");
			min = str1.length();
		}
		System.out.println("The differences according to positions: ");
		for (int i = 0; i < min; i++) {
			if (str1.charAt(i) != str2.charAt(i)) {
				System.out.printf("%d %s - %s%n", (i + 1), str1.charAt(i), str2.charAt(i));
			}
		}
	}
}
