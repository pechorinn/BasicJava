package recursionpractise;

import java.util.Scanner;

/*
 �� �� ������� ����� �� ������(���������) � �� �� 
������ ����� �� ������ ����� ����� 1 � ���������� �����.
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
