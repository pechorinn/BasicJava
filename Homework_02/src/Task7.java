package homework;

import java.util.Scanner;
/*�������� 3 ���������� �� ������������ � ��� (���������� ���), ����
���� (����� � ������� �������), ���� ��� ����� � ����� ���.
��������� ��������, ����� ����� ������� �� ������ �� ���� ����� ��
������� �����:
 - ��� ��� �����, ���� �� �������
 - ��� ���� ����, �� �� ���� ���������
 - ��� ����� � �� ���� ����� � �� ��� ���
 - ��� ��� �����, �� ����� �� ���� � ��������
 - ��� ���� ��-����� �� 10 ��, �� ����� �� ����.
���������� ������� �������� ���� ��������� � ���������.
*/
public class Task7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the amount of money you have: ");
		double money = sc.nextDouble();
		System.out.println("Please type true if you are healthy and false if you are not: ");
		boolean isHealthy = sc.nextBoolean();
		sc.close();

		if (isHealthy) {
			if (money >= 10)
				System.out.println("�� ����� �� ���� � ��������.");
			if (money < 10)
				System.out.println("�� ����� �� ����.");
		} else {
			System.out.println("����� ���, - ���� �� �������.");
			if (money >= 10)
				System.out.println("�� �� ���� ���������.");
			if (money < 10)
				System.out.println("�� ��� ���.");

		}
	}
}
