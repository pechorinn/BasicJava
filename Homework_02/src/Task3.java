package homework;

import java.util.Scanner;
/*
�������� 2 �������� ����� �� ��������� � ��������� ���������� ��. 
������������ ������ ���������. �������� 2 �������� ����� �� ��������� � �� ������������ � 
��������� ���.
 */
public class Task3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter first number: ");
		int a = sc.nextInt();
		System.out.println("Please enter second number: ");
		int b = sc.nextInt();
		sc.close();
		int temp = a;
		a = b;
		b = temp;
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		
	}

}
