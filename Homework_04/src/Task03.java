package homework4;

import java.util.Scanner;

/*
�� �� ������ �����, ���� ����� �� �� ������� ����� � 10 
�������� �� ������� �����:
������� 2 �������� �� ������ �� ���������� �����.
����� ������� ������� �� ������ � ����� �� ����� �� 
���������� 2 �������� � ������.
���� ���� �������� ������ .
 */
public class Task3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the number: ");
		int n = sc.nextInt();
		int[] arr = new int[10];
		arr[0] = n;
		arr[1] = n;
		System.out.println("The constructed array looks this way: ");
		System.out.print(arr[0] + ", " + arr[1] + ", ");
		for (int i = 2; i < arr.length; i++) {
			arr[i] = arr[i - 1] + arr[i - 2];
			if (i == arr.length - 1) {
				System.out.print(arr[i] + ".");
			} else {
				System.out.print(arr[i] + ", ");
			}
		}
		sc.close();
	}
}
