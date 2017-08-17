package lesson_08;
/*
 * ������ 1:
�� �� ������� ��������, ���� ����� �� �������� ��� ���� ��������� 
�� 40 ������ � ����� �����.
���� �������� �� ������ �� �� �������� �������� ���� � ������ � ����
� ����� �����.
������: Abcd Efgh
�����: ABCD abcd EFGH efgh
 */
import java.util.Scanner;

public class Task_01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String str1 = "";
		do {
			System.err.println("Please enter first word, it should contain up to 40 characters: ");
			str1 = sc.next();
		} while (str1.length() > 40);

		String str2 = "";

		do {
			System.err.println("Please enter second word, it should contain up to 40 characters: ");
			str2 = sc.next();
		} while (str2.length() > 40);
		
		System.out.printf("%s %s%n", str1.toUpperCase(), str1.toLowerCase());
		System.out.printf("%s %s%n", str2.toUpperCase(), str2.toLowerCase());
		
		sc.close();
	}
}
