
public class Task_05 {
	/*
	 * Напишете програма, която за дадена матрица m x n от числа намира реда, в
	 * който сумата от елементите е максимална.
	 */
	public static void main(String[] args) {
		int maxSum = 0;
		int curMaxSum = 0;
		int curRowIndex = 0;
		int rowIndex = 0;
		int[][] twoDMatrix = { { 1, 5, 9, 8, 7, 15 }, { 45, 8, 9, -78, 4, 8 }, { 47, 7, 8, 4, 8, 15 } };

		for (int row = 0; row < twoDMatrix.length; row++) {
			for (int col = 0; col < twoDMatrix[row].length; col++) {
				if (row == 0) {
					maxSum += twoDMatrix[row][col];
					rowIndex = row;
				} else {
					curMaxSum += twoDMatrix[row][col];
					curRowIndex = row;
				}
			}
			if (curMaxSum > maxSum) {
				maxSum = curMaxSum;
				rowIndex = curRowIndex;
			}
			curMaxSum = 0;

		}

		System.out.println(
				"The row with the greatest sum of elements: " + (rowIndex + 1) + " \nThe sum of the row is: " + maxSum);
	}
}
