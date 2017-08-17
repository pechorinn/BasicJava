package homework3;

import java.util.Scanner;
/*
Въведете число от клавиатурата и определете дали е
просто. Просто число е това което се дели САМО на 1 и на себе 
си.
*/
public class Task10 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter number for checking: ");
		int n = sc.nextInt();
		sc.close();
		boolean isPrime = true;

		if (n <= 1) {
			System.out.println("Please enter number bigger than 1.");
		} else {

			for (int i = 2; i * i <= n; i++) {
				if (n % i == 0) {
					isPrime = false;
					break;
				}
			}
			System.out.println("The number is prime: " + isPrime);
		}
	}
}