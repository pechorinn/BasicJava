package recursionpractise;

/*
�� �� ������� ��������, ����� �� ������� ������ �� 
������  ����� �� 1 �� �������� ����� N.
������: 5
�����: 15
 */
public class Task_15 {

	public static void main(String[] args) {

		int n = 4;
		System.out.println(printSum(n));
	}

	static int printSum(int n) {
		if (n == 1) {
			return n;
		}
		return n + printSum(n-1);
	}
}
