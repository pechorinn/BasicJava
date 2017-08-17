package recursionpractise;

import java.util.Scanner;

/*
�� �� ������� ��������, ����� ������� ������� 10 ���-����� 
�����, ����� �� ����� �� 2, 3 ��� �� 5 � ����� �� ��-������ �� 
�������� ���������� �����.
������� �� ��������, ������ � ������ ������� �����.
������ �����: ����� �� ��������� [1..999]
������: 1
�����: 1:2; 2:3, 3:4, 4:5, 5:6, 6:8, 7:9, 8:10, 9:12, 10:14
 */

public class Task_22 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number within range [1...999]: ");
		int number = sc.nextInt();
		sc.close();
		if (number < 1 || number > 999) {
			System.out.println("Wrong input. Please try again.");
		} else {
			int count = 0;
			printResult(number + 1, count);
		}

	}

	static void printResult(int number, int count) {

		if (number % 2 == 0 || number % 3 == 0 || number % 5 == 0) {
			count += 1;
			if (count == 10) {
				System.out.print(count + " : " + number);
				return;
			} else {
				System.out.print(count + " : " + number + ", ");
			}
		}

		printResult(number + 1, count);

	}

}
