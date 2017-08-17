package homework3;

import java.util.Scanner;

/*
 Да се състави програма, която по въведено 
естествено число N от интервала [10..200] извежда в обратен 
ред всички числа, които са кратни на 7 и са по-малки от N.
 */

public class Task14 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the number: ");
		int n = sc.nextInt();
		sc.close();
		if (n < 10 || n > 200) {
			System.out.println("Wrong input. Please try again!");
		} else {

			for (int i = n - 1; i >= 7; i--) {
				if (i % 7 == 0) {
					if (i == 7) {
						System.out.print(i);
					} else {
						System.out.print(i + ", ");
					}
				}
			}
		}
	}
}