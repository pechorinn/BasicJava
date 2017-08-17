package lesson_08;

import java.util.Scanner;

/*
�� �� ������� ��������, ����� ���� ����� �� ���� ��������� � ��������.
���� �������� �� �� �������� ���� �� ���������� ����, ����� � ���� 
����� � ���-������� ����.
������: asd fg hjkl
�����: 3 ����, ���-������� � � 4 �������.
 */
public class Task_07 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please a sequence of words separated by space: ");
		String[] strArray = sc.nextLine().split(" ");
		sc.close();
		printResult(strArray);
	}

	static void printResult(String[] strArray) {
		int maxLength = strArray[0].length();
		for (int i = 1; i < strArray.length; i++) {
			if (maxLength < strArray[i].length()) {
				maxLength = strArray[i].length();
			}
		}
		System.out.println("The string contains " + strArray.length + " words.");
		System.out.println("The longest word has " + maxLength + " characters.");
	}
}
