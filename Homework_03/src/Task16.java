package homework3;

import java.util.Scanner;
/*
 Да се състави програма, чрез която се въвеждат 2 естествени 
числа N, M от интервала [10..5555].
Програмата, чрез цикъл f or, да извежда всички числа от 
интервала, които са кратни на 50 в низходящ ред.
Пример: 25,249 
Изход: 200,150,100, 50.*/

public class Task16 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter first number from 10 to 5555: ");
		int first = sc.nextInt();
		System.out.println("Please enter second number form 10 to 5555: ");
		int second = sc.nextInt();
		int max;
		int min;
		if (first > second) {
			max = first;
			min = second;
		} else {
			max = second;
			min = first;
		}

		if (first < 10 || first > 5555 || second < 10 || second > 5555) {
			System.out.println("Wrong input! Please try again.");
		} else {
			for (int i = max; i >= min; i--) {
				if (i % 50 == 0) {
					System.out.print(i + ", ");
				}
			}
		}
		sc.close();
	}
}
