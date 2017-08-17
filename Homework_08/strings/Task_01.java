package lesson_08;
/*
 * Задача 1:
Да се състави програма, чрез която се въвеждат два низа съдържащи 
до 40 главни и малки букви.
Като резултат на екрана да се извеждат низовете само с главни и само
с малки букви.
Пример: Abcd Efgh
Изход: ABCD abcd EFGH efgh
 */
import java.util.Scanner;

public class Task_01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String str1 = "";
		do {
			System.err.println("Please enter first word, it should contain up to 40 characters: ");
			str1 = sc.next();
		} while (str1.length() > 40);

		String str2 = "";

		do {
			System.err.println("Please enter second word, it should contain up to 40 characters: ");
			str2 = sc.next();
		} while (str2.length() > 40);
		
		System.out.printf("%s %s%n", str1.toUpperCase(), str1.toLowerCase());
		System.out.printf("%s %s%n", str2.toUpperCase(), str2.toLowerCase());
		
		sc.close();
	}
}
