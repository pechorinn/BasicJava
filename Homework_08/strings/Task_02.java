package lesson_08;

import java.util.Scanner;

/*
 Да се състави програма, чрез която от клавиатурата се въвеждат 
последователно две думи с дължина 10-20 знака.
Програмата да размени първите им 5 знака и да изведе дължината на 
по-дългата, както и новото им съдържание.
Пример: uchilishe uchenik
Изход: 9 uchenishe uchilik
 */
public class Task_02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str1 = "";
		do {
			System.err.println("Please enter first word, it should contain from 10 up to 20 characters: ");
			str1 = sc.next();
		} while (str1.length() > 20 || str1.length() < 10);
		String str2 = "";
		do {
			System.err.println("Please enter second word, it should contain from 10 up to 20 characters: ");
			str2 = sc.next();
		} while (str2.length() > 20 || str2.length() < 10);

		printResult(str1, str2);
		sc.close();
	}

	static void printResult(String str1, String str2) {
		int max = 0;
		if (str1.length() > str2.length()) {
			max = str1.length();
		} else {
			max = str2.length();
		}

		StringBuilder newStr1 = new StringBuilder(str1);
		StringBuilder newStr2 = new StringBuilder(str2);
		newStr1.replace(0, 5, str2.substring(0, 5));
		newStr2.replace(0, 5, str1.substring(0, 5));
		System.out.printf("%d %s %s", max, newStr1, newStr2);

	}
}
