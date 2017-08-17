package homework4;

import java.util.Scanner;
/*
�������� ��������, � ����� ����������� ������� �����, ���� ����� 
���������� �� ������ �� ������� � ������� ��� (����� �� � ������ ��
�� �������� � ������� ���, ��� ����� �� �� ������, ���� ����� �� �� 
�������� � �������� ���). ��������� �� ������ �������� ����� � ����
������������ ����� � ����� ��� �� ���������� ���� �����.
 */
public class Task9a {
	// Second version - using additional array
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter array's length: ");
		int length = sc.nextInt();
		if (length < 1) {
			System.out.println("Please enter a length that is more than 0.");
		} else {
			int[] arr1 = new int[length];

			for (int i = 0; i < arr1.length; i++) {
				System.out.println("Please enter array's element: ");
				arr1[arr1.length - 1 - i] = sc.nextInt();
			}
			System.out.println("New array's elements: ");
			for (int i = 0; i < arr1.length; i++) {
				if (i == arr1.length - 1) {
					System.out.print(arr1[i] + ".");
				} else {
					System.out.print(arr1[i] + ",");
				}
			}
		}
		sc.close();
	}
}
