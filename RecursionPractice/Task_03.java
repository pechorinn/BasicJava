package recursionpractise;
//ƒа се изведат на екрана всички нечетни числа от -10 до 10

public class Task_03 {

	public static void main(String[] args) {

		int start = -10;
		int end = 10;
		end = end % 2 == 0 ? end - 1 : end;
		printOdd(start, end);

	}

	static void printOdd(int start, int end) {

		if (end == start || end == start + 1) {
			System.out.print(end + " ");
			return;
		}
		printOdd(start, end - 2);
		System.out.print(end + " ");
	}
}
