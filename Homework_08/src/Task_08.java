package lesson_08;

import java.util.Scanner;

/*
 �� �� ������� ��������, ���� ����� �� ������� ��� �� ������� 
(������, ���).
���������� �� ������ �� ������ ���� ��������� ������ � ���������, 
�.�. ���� ����� ������-������� � �������-������ � ���� � ���.
����: ����� 
�����: ��.
����: �������� 
�����: ��.
 */
public class Task_08 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the word you want to check: ");
		String str = sc.next();
		sc.close();
		printResult(str);
	}

	static void printResult(String str) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			sb.append(str.charAt(str.length() - 1 - i));
		}
		System.out.println("Is the word polindrom? " + str.equals(sb.toString()));
	}
}
