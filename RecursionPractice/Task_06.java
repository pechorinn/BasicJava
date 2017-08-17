package recursionpractise;

import java.util.Scanner;

/*
 Да се прочете число от екрана(конзолата) и да се 
изведе сбора на всички числа между 1 и въведеното число.
 */
public class Task_06 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the number: ");
		int number = sc.nextInt();
		System.out.print(sum(number));
		sc.close();
	}

	static int sum(int number) {
		if (number == 1) {
			return number;
		}
		return number + sum(number - 1);
	}
}
