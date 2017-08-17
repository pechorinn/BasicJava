package homework3;

import java.util.Scanner;
/*Да се прочете число от екрана(конзолата) и да се 
изведе сбора на всички числа между 1 и въведеното число*/
public class Task6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the number: ");
		int n = sc.nextInt();
		int sum = 0;
		if (n <= 0) {
			System.out.println("If the number is negative or equal to zero - there is nothing to calculate.");
		} else {
			for (int i = 1; i <= n; i++) {
				sum += i;
			}
			System.out.println("The result is: " + sum);
			sc.close();
		}
	}
}