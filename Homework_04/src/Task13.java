package homework4;

import java.util.Scanner;

/*
�� �� ������� ��������, ���� ����� �� �������  ����� � �� ��������� 
���� ����� � ������� ������ �������.
����������, ���� �����, �� ��������� �������������� ������ ����� 
�� ���������� ���������� ����� � 2-���� ������ �������.
������: 99 
�����: 1100011
 */
public class Task13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a natural number: ");
		int number = sc.nextInt();
		if (number < 0) {
			System.out.println("Please enter a valid input.");
		} else {
			int digitCount = 0;
			int n2 = number;
			while (n2 > 0) {
				n2 /= 2;
				digitCount++;
			}
			if (digitCount == 0) {
				digitCount = 1;
			}
			int[] arr = new int[digitCount];
			for (int i = 0; i < digitCount; i++) {
				arr[i] = number % 2;
				number /= 2;
			}
			for (int i = arr.length - 1; i >= 0; i--) {
				System.out.print(arr[i]);
			}
		}
		sc.close();
	}
}
