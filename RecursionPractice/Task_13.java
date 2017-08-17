package recursionpractise;

/*
�� �� ������� ��������, ����� ������� ������ 
���������� ���������� �����, ����� ���� ���� �� ������� �����
�� ������ �����.
������ :
 sum, ������ 2>=sum<=27.
������: 26
�����: 899, 989, 998
 */
public class Task_13 {

	public static void main(String[] args) {
		int n = 5;
		printResult(100, 999, n);
	}

	static void printResult(int min, int max, int n) {

		if (min == max) {
			int hundreds = max / 100;
			int dec = (max / 10) % 10;
			int smallNumbers = max % 10;

			if (hundreds + dec + smallNumbers == n) {
				System.out.print(max + " ");
			}
			return;
		}
		printResult(min, max - 1, n);

		int hundreds = max / 100;
		int dec = (max / 10) % 10;
		int smallNumbers = max % 10;

		if (hundreds + dec + smallNumbers == n) {
			System.out.print(max + " ");

		}
	}
}
