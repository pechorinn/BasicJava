package recursionpractise;

// Да се изведат на екрана числатa от -20 до 50.
public class Task_02 {

	public static void main(String[] args) {
		int start = -20;
		int end = 50;
		printSequence(start, end);
	}

	static void printSequence(int start, int end) {

		if (end == start) {
			System.out.print(end + " ");
			return;
		}
		printSequence(start, end - 1);
		System.out.print(end + " ");
	}
}
