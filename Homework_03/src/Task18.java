package homework3;

import java.util.Scanner;

public class Task18 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter first number from 1 to 9: ");
		int first = sc.nextInt();
		System.out.println("Please enter second number from 1 to 9: ");
		int second = sc.nextInt();
		if (first < 1 || first > 9 | second < 1 || second > 9) {
			System.out.println("Wrong input. Please try again!");
		} else {

			for (int i = 1; i <= first; i++) {
				for (int j = 1; j <= second; j++) {
					System.out.println(i + "*" + j + "=" + (i * j));
				}
			}
			sc.close();
		}
	}
}