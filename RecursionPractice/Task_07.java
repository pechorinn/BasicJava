package recursionpractise;
/*
Започвайки от 3, да се изведат на екрана първите n 
числа които се делят на 3. Числата да са разделени със запетая.
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
