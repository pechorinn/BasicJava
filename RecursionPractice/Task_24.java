package recursionpractise;

import java.util.Scanner;

/*
���� ����� X � ���������, a�� �� ���� ������� ������ ����� � 
����� ������.�� �� ������� ��������, ����� ��������� ���� �������� ����� � 
���������.
������ �����: 
N - ���������� ����� �� ��������� [10 .. 30000].
������: 17571
�����: ������� � ���������
 */
public class Task_24 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter number from [10...30,000]: ");
		int number = sc.nextInt();
		sc.close();
		if (number < 10 || number > 30000) {
			System.out.println("Wrong input. Please try again.");
		} else {
			String str = "" + number;
			String temp = "" + number;
			System.out.println(checkIfPalindrom(str, temp, (str.length() - 1) / 2));
		}
	}

	static boolean checkIfPalindrom(String number, String temp, int i) {

		if (i == -1) {
			return true;
		}
		if (number.charAt(i) != number.charAt(number.length() - 1 - i)) {
			return false;
		}

		return checkIfPalindrom(number, temp, i - 1);

	}

}
