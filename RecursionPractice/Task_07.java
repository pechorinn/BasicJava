package recursionpractise;
/*
���������� �� 3, �� �� ������� �� ������ ������� n 
����� ����� �� ����� �� 3. ������� �� �� ��������� ��� �������.
 */
public class Task_07 {

	public static void main(String[] args) {

		int n = 10;
		printDividableByThree(n*3);
	}

	static void printDividableByThree(int n) {
		if(n == 3) {
			System.out.print(n + " ");
			return;
		}
		printDividableByThree(n-3);
		System.out.print(n + " ");
	}
}
