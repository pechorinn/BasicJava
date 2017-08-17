package homework3;

import java.util.Scanner;
/*
Да се състави програма, която да изчисли сумата на 
всички  числа от 1 до въведено число N.
Пример: 5
Изход: 15
Използвайте цикъл do-while.*/

public class Task15 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the number: ");
		int n = sc.nextInt();
		if (n < 1) {
			System.out.println("Wrong input! Please try again.");
		} else {
			int sum = 0;
			int counter = 0;
			do {
				sum += ++counter;
			} while (n > counter);
			System.out.println(sum);
			sc.close();
		}
	}
}