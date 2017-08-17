package recursionpractise;

import java.util.Scanner;

/*
�� �� ������� ��������, ����� �� �������� 
���������� ����� N �� ��������� [10..200] ������� � ������� 
��� ������ �����, ����� �� ������ �� 7 � �� ��-����� �� N.
 */
public class Task_14 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter number from 10 to 200: ");
		int number = sc.nextInt();
		sc.close();
		if (number < 10 || number > 200) {
			System.out.println("The number must be within range of 10 to 200. Please try again.");
		} else {

			printResult(number, 1);
		}
	}

	static void printResult(int number, int start) {

		if (start == number) {
			return;
		}
		printResult(number, start + 1);

		if(start % 7 == 0) {
			System.out.print(start + " ");
		}
	}
}
