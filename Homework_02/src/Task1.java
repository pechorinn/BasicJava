package homework;

import java.util.Scanner;
/*
 �� �� ������� ��������� ��� ����������� � �� �� �������� 2 ����� �� 
������������ A � B (���� �� �� � ������� ������� � double).
����� �� �� ������� 3-�� ����� C � �� �� ������� ���� �� � �/� A � B.
�� �� ������ ��������� ��������� �� ���� ���� C � ����� A � B.
 */
public class Task1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter first number: ");
		double a = sc.nextDouble();
		System.out.println("Please enter second number: ");
		double b = sc.nextDouble();
		System.out.println("Please enter third number: ");
		double c = sc.nextDouble();
		sc.close();
		if ((c > a && c < b)||(c > b && c < a)) {
			System.out.println("The number " + c + " is between " + a + " and " + b);
		} else {
			System.out.println("The number " + c + " is not between " + a + " and " + b);
		}
	}

}
