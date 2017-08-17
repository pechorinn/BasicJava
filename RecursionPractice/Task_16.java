package recursionpractise;

import java.util.Scanner;

/*
Да се състави програма, чрез която се въвеждат 2 естествени 
числа N, M от интервала [10..5555].
Програмата, чрез цикъл f or, да извежда всички числа от 
интервала, които са кратни на 50 в низходящ ред.
Пример: 25,249 
Изход: 200,150,100, 50.
 */
public class Task_16 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter first number: ");
		int first = sc.nextInt();
		System.out.println("Please enter second number: ");
		int second = sc.nextInt();
		sc.close();
		if (first < 10 || first > 5555 || second < 10 || first > 5555) {
			System.out.println("Wrong input. The numbers must be in range [10 ...5555]. Please try again.");
		} else {

			int min = first > second ? second : first;
			int max = first > second ? first : second;
			printResult(min, max);

		}
	}

	static void printResult(int min, int max) {
		if (max == min) {
			if (max % 50 == 0) {
				System.out.print(min + " ");
			}
			return;
		}

		printResult(min + 1, max);
		if (min % 50 == 0) {
			System.out.print(min + " ");
		}
	}
}