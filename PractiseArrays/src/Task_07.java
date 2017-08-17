
public class Task_07 {
	/*
	 * Напишете програма, която за дадена матрица намира произведението на
	 * елементите под главния диагонал.
	 */
	public static void main(String[] args) {

		int[][] twoDMatrix = { { 1, 5, 9 }, { 45, 8, 9 }, { 47, 7, 8 } };

		int multipleOfDiagonal = 1;
		for (int row = 0; row < twoDMatrix.length; row++) {
			for (int col = 0; col < twoDMatrix[row].length; col++) {
				if (row > 0 && col < twoDMatrix[row].length - 1 && row > col) {
					multipleOfDiagonal *= twoDMatrix[row][col];
				}
			}
		}
		System.out.println("Multiple of the elements below main diagonal: " + multipleOfDiagonal);
	}
}
