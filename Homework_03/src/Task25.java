package homework3;

import java.util.Scanner;

/*
�� �� ������� ��������, ����� �� ������ ����� N, �� ���������
N!, �.�. 1*2*3*4...*N.
������: 5
�����: 120
����������� ����� do-while.
 */
public class Task25 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the number from 0 to 20: ");
		int n = sc.nextInt();
		if (n < 0 || n > 20) {
			System.out.println(
					"Wrong input! The number is negative or factorial of the number is too big to be displayed as long. Please try again.");
		} else if (n == 0 || n == 1) {
			System.out.println("N! = " + 1);
		} else {
			long factorial = 1L;
			long increament = 2L;
			do {
				factorial *= increament;
				increament++;
			} while (n >= increament);
			System.out.println("N! = " + factorial);
		}
		sc.close();
	}
}
