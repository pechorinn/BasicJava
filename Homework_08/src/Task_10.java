package lesson_08;

import java.util.Scanner;

/*
 �� �� ������� ��������, ����� �� ����� ��� ����� ����, 
���������, �� ����� �� �������� ���� ��� ����� ��� �� ������ 
��  ASCII ��������� � ���������� ������� 5 � � ������� 
������������� ������.
������ :
����: 
Hello
�����: 
Mjqqt
 */
public class Task_10 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your string: ");
		char[] charArray = sc.nextLine().toCharArray();
		sc.close();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < charArray.length; i++) {
			sb.append((char)(charArray[i]+5));
		}
		System.out.println(sb);
	}
}
