package homework3;

import java.util.Scanner;
/*�� �� �������� 2 ����� �� ������������ � � �. 
�� �� ������� ������ ����� �� � �� � �� ������ 2(��������� � 
�������).��� ����� ����� � ������ �� 3, �� �� ������ ��������� �� 
������� �� �������� �skip 3�.��� ������ �� ������ �������� ����� (���
������������) ����� ��-������ �� 200, �� �� �������� �����������.*/
public class Task9 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter first number: ");
		int first = sc.nextInt();
		System.out.println("Please enter second number: ");
		int second = sc.nextInt();
		int max;
		int min;
		if (first > second) {
			max = first;
			min = second;
		} else {
			max = second;
			min = first;
		}
		int sum = 0;
		for (int i = min; i <= max; i++) {
			if (i % 3 == 0) {
				System.out.print("skip 3, ");
				continue;
			}
			sum += i * i;

			if (sum > 200) {
				System.out.println("The sum of numbers on power of two is more than 200!");
				break;
			}
			System.out.print(i * i + ", ");
		}
		sc.close();
	}
}
