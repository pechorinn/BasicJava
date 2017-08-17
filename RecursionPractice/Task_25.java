package recursionpractise;

/*
�� �� ������� ��������, ����� �� ������ ����� 
N, �� ��������� N!, �.�. 1*2*3*4...*N.
������: 5
�����: 120
 */
public class Task_25 {

	public static void main(String[] args) {

		int n = 5;

		System.out.println(calculateFactorial(n));
	}

	static int calculateFactorial(int n) {

		if (n == 1) {
			return 1;
		}

		return n * calculateFactorial(n - 1);
	}
}
