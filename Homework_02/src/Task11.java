package homework;

import java.util.Scanner;

/*Съставете програма, която по дадено трицифренo число проверява
дали числото се дели на всяка своя цифра. Във въведеното число да
няма цифра 0.
*/

public class Task11 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a;
		boolean isDividable;
		do {
			System.out.println("Please enter a number containing three digits none of them should be zero: ");
			a = sc.nextInt();
		} while (a < 100 || a >= 1000);
		sc.close();
		int hundreds = (a / 100);
		int smallNumbers = a % 10;
		int tens = (a / 10) % 10;

		if (hundreds == 0 || smallNumbers == 0 || tens == 0) {
			System.out.println("The number must not contain a zero digit. Please try again.");
		} else {

			isDividable = ((a % hundreds == 0) && (a % smallNumbers == 0) && (a % tens == 0));
			System.out.println("The number " + a + " is dividable by its' every digit? " + isDividable);
		}
	}

}
