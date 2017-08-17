package recursionpractise;

/*
 По зададено число n, да се изведе на екрана таблица по следния начин:
 Въведете n:
4
3333
5555
7777
9999
 */
public class Task_08 {

	public static void main(String[] args) {

		int n = 20;
		int floor = n - 1;
		int ceiling = 3 * floor;
		drawTable(floor, ceiling);
	}

	static void drawTable(int floor, int ceiling) {
		if (floor == ceiling) {
			printRow(floor, floor + 1);
			System.out.println();
			return;
		}
		drawTable(floor, ceiling - 2);
		printRow(ceiling, floor + 1);
		System.out.println();
	}

	static void printRow(int value, int count) {

		if (count == 1) {
			System.out.printf("%3d", value);
			return;
		}
		printRow(value, count - 1);
		System.out.printf("%3d", value);
	}
}
