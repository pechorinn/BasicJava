package lesson_08;

import java.util.Scanner;

/*
Да се състави програма, която чете набор от думи разделени с интервал.
Като резултат да се извеждат броя на въведените думи, както и броя 
знаци в най-дългата дума.
Пример: asd fg hjkl
Изход: 3 думи, най-дългата е с 4 символа.
 */
public class Task_07 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please a sequence of words separated by space: ");
		String[] strArray = sc.nextLine().split(" ");
		sc.close();
		printResult(strArray);
	}

	static void printResult(String[] strArray) {
		int maxLength = strArray[0].length();
		for (int i = 1; i < strArray.length; i++) {
			if (maxLength < strArray[i].length()) {
				maxLength = strArray[i].length();
			}
		}
		System.out.println("The string contains " + strArray.length + " words.");
		System.out.println("The longest word has " + maxLength + " characters.");
	}
}
