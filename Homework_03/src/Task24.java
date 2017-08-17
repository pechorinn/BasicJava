package homework3;

import java.util.Scanner;

/*
 Едно число X е палиндром, aко се чете еднакво отпред назад и
отзад напред.
Да се състави програма, която проверява дали въведено число е
палиндром.
Входни данни: N - естествено число от интервала [10 .. 30000].
Пример: 17571
Изход: числото е палиндром
Използвайте цикъл do-while. */

public class Task24 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the number from 10 to 30000");
		int n = sc.nextInt();
		if (n < 10 || n > 30_000) {
			System.out.println("Wrong input! Please try againg.");
		} else {
			int temp = n;
			int reverse = 0;
			do {
				reverse *= 10;
				reverse += temp % 10;
				temp /= 10;
			} while (temp != 0);
			if (n == reverse) {
				System.out.println("The number is palindrome.");
			} else {
				System.out.println("The number is not a palindrome.");
			}
		}
		sc.close();
	}
}
