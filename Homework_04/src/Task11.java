package homework4;

import java.util.Scanner;

/*
�� �� ������� ��������, ����� ������� �� ������������ 7 ���� ����� 
� ��������� ����� 
���������� �� ������ ������ ����� ������ �� 5, �� �� ������ �� 5.
������: -23, -55, 17, 75, 56, 105, 134
�����: 75,105 - 2 �����
 */
public class Task11 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] arr = new int[7];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Please enter " + (i + 1) + " element of the array.");
			arr[i] = sc.nextInt();
		}
		boolean hasOutput = false;
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 5 == 0 && arr[i] > 5) {
				System.out.print(arr[i] + " ");
				hasOutput = true;
				count++;
			}
		}
		if(hasOutput) {
			System.out.println("\n" + count + " numbers.");
		}
		if (!hasOutput) {
			System.out.println("None of the elements is a multiple of 5 and is more than 5.");
		}
		sc.close();
	}
}
