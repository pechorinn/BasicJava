
public class Task_06 {
	/*
	 * Напишете програма, която за дадена матрица от символи отпечатва на екрана
	 * елементите, които се намират на главния диагонал.
	 */
	public static void main(String[] args) {

		int[][] twoDMatrix = { { 1, 5, 9 }, { 45, 8, 9 }, { 47, 7, 8 } };
		System.out.println("The main diagonal is: ");
		for (int i = 0; i < twoDMatrix.length; i++) {
			System.out.print(twoDMatrix[i][i] + " ");
		}
	}
}
