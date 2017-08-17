package homework;

import java.util.Scanner;

/*�������� � ���������� ���������� ����� �� ���� abc.
������ �� �� ������� ����:
��� a = b = c - �����: ������� �� �����;
��� a>b>c - �����: ������� �� ��� �������� ���;
��� a<b<c ������� �� � �������� ���;
� �����: ������� �� ����������, �� ����������� ������.
�� �� ������� ��������, ����� ������� ��������� �� ���������� ��
������� �� ������� � �������.
*/

public class Task16 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int abc;
		do {
			System.out.println("Please enter a number containing tree digits: ");
			abc = sc.nextInt();
		} while (abc < 100 || abc > 999);
		sc.close();

		int a = abc / 100;
		int b = (abc / 10) % 10;
		int c = abc % 10;

		if (a == b && c == b) {
			System.out.println("The digits are equal.");
		} else if (a > b && b > c) {
			System.out.println("The digits are in ascending order.");
		} else if (a < b && b < c) {
			System.out.println("The digits are in descending order.");
		} else {
			System.out.println("The digits are out of order.");
		}
	}
}
