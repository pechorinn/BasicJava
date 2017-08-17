package homework3;

import java.util.Scanner;

/*�� �� ������� ��������, ���� ����� �� ��������
���������� ����� �� ��������� [10..99] �� ������� ��������
�����, ��� �������� �� �������� ����������:
1) ��� ����������� ����� � ����� �� ������� 0.5*�������;
2) ��� ����������� ����� � ������� �� ������� 3*������� +1.
����������� ���������� ������ �� �� ������ �������� 1.
������: 11
�����: 34 17 52 26 13 40 20 10 5 16 8 4 2 1.*/
public class Task19 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the number: ");
		int n = sc.nextInt();
		if (n < 10 || n > 99) {
			System.out.println("Wrong input. Please try again!");

		} else {

			int temp = n;
			while (temp > 1) {
				if (temp % 2 == 0) {
					temp = temp / 2;
					System.out.print(temp + " ");
				} else {
					temp = 3 * temp + 1;
					System.out.print(temp + " ");
				}
			}
			sc.close();
		}
	}
}