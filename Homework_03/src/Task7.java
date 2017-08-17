package homework3;

import java.util.Scanner;
/*Започвайки от 3, да се изведат на екрана първите n 
числа които се делят на 3. Числата да са разделени със запетая*/
public class Task7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the number: ");
		int n = sc.nextInt();
		sc.close();
		if (n <= 0) {
			System.out.println(
					"Wrong input! The number should not be negative or equal to zero. Please check input and try again.");
		} else {

			for (int i = 1; i <= n; i++) {
				System.out.print(3 * i + " ");
			}
		}
	}
}
