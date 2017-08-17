package lesson_08;

import java.util.Scanner;

/*
 �� �� ������� ��������, ���� �����  �� ������� ��������� � ������� 
����.
���� �������� �� ������ �� �� ������� ����� �����, �� ����� ������� 
���� �� ������� � ������ �����, � ���������� ����� �� �� �����.
������: ����� ����� ������
�����: ����� ����� ������
 */
public class Task_06 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your sentence: ");
		String[] strArray = sc.nextLine().split(" ");
		sc.close();
		printResult(strArray);
	}

	static void printResult(String[] strArray) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < strArray.length; i++) {
            sb.append(strArray[i].substring(0,1).toUpperCase()).append(strArray[i].substring(1).toLowerCase() + " ");
		}
		System.out.println(sb);
	}
}
