package recursionpractise;
//Да се изведат на екрана числата от 1 до 100.

public class Task_01 {

	public static void main(String[] args) {
		int n = 100;
		printNumbers(n);

	}

	static void printNumbers(int n) {
		if (n == 1) {
			System.out.print(n + " ");
			return;
		}
		printNumbers(n - 1);
		System.out.print(n + " ");
	}
}
