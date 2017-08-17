package homework3;

import java.util.Scanner;

/*
 �� �� ������� ��������, ����� ������� ������ 
���������� ���������� �����, ����� ���� ���� �� ������� �����
�� ������ �����.
������ :
 sum, ������ 2>=sum<=27.
������: 26
�����: 899, 989, 998.*/

public class Task13 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter number from 2 to 27: ");
		int n = sc.nextInt();
		if (n < 2 || n > 27) {
			System.out.println("Wrong input. Please try again.");
		} else {

			for (int first = 1; first <= 9; first++) {
				for (int second = 0; second <= 9; second++) {
					for (int third = 0; third <= 9; third++) {
						if ((first + second + third) == n) {
							System.out.print("" + first + second + third + ", ");
						}
					}
				}
			}
		}
		sc.close();
	}
}
