package recursionpractise;
/*
�� �� ������� ��������, ���� ����� �� �������� 
���������� ����� �� ��������� [10..99] �� ������� �������� 
�����, ��� �������� �� �������� ����������:
1) ��� ����������� ����� � ����� �� ������� 0.5*�������;
2) ��� ����������� ����� � ������� �� ������� 3*������� + 1.
����������� ���������� ������ �� �� ������ �������� 1.
������: 11 
�����: 34 17 52 26 13 40 20 10 5 16 8 4 2 1.
 */

public class Task_19 {

	public static void main(String[] args) {

		int n = 11;
		printResult(n);
	}

	static void printResult(int n) {
		if (n % 2 == 0) {
			n = n / 2;
			System.out.print(n + " ");
		} else {
			n = 3 * n + 1;
			System.out.print(n + " ");
		}

		if (n == 1) {
			return;
		}
		printResult(n);

	}
}
