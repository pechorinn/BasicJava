package recursionpractise;

import java.util.Scanner;

/*
Да се състави програма, която извежда първите 10 най-малки 
числа, които се делят на 2, 3 или на 5 и които са по-големи от 
въведено естествено число.
Числата се извеждат, заедно с техния пореден номер.
Входни данни: число от интервала [1..999]
Пример: 1
Изход: 1:2; 2:3, 3:4, 4:5, 5:6, 6:8, 7:9, 8:10, 9:12, 10:14
 */

public class Task_22 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number within range [1...999]: ");
		int number = sc.nextInt();
		sc.close();
		if (number < 1 || number > 999) {
			System.out.println("Wrong input. Please try again.");
		} else {
			int count = 0;
			printResult(number + 1, count);
		}

	}

	static void printResult(int number, int count) {

		if (number % 2 == 0 || number % 3 == 0 || number % 5 == 0) {
			count += 1;
			if (count == 10) {
				System.out.print(count + " : " + number);
				return;
			} else {
				System.out.print(count + " : " + number + ", ");
			}
		}

		printResult(number + 1, count);

	}

}
