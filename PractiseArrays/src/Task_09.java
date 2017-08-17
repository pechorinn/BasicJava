
public class Task_09 {
/*
 Дадена е правоъ­гълна матрица с числа. Да се намери в нея
максималната подмат­рица с размер 2 х 2 и да се отпечата на
конзолата. Под максимална подматрица се разбира
подматрица, която има максимална сума на елементите, които я
съставят.
 */
	public static void main(String[] args) {

		int[][] twoDMatrix = { { 1, 5, 9, 8, 7, 15 }, 
				{ 45, 8, 9, -78, 4, 8 }, 
				{ 47, 15, 8, 4, 8, 15 },
				{ 47, 7, 8, 10, 8, 15 },
				{ 47, 0, 8, 4, 8,3 },
				{ 47, 158, 8, 4, 8, 15 }
		};

		
		int x = twoDMatrix[0][0];
		int y = twoDMatrix[0][1];
		int z = twoDMatrix[1][0];
		int j = twoDMatrix[1][1];

		int maxSum = x + y + z + j;
		int curSubMatrixSum = 0;

		for (int row = 0; row < twoDMatrix.length - 1; row++) {
			for (int col = 0; col < twoDMatrix[row].length - 1; col++) {
				curSubMatrixSum = twoDMatrix[row][col] + twoDMatrix[row][col + 1] + twoDMatrix[row + 1][col]
						+ twoDMatrix[row + 1][col + 1];
	
				if (curSubMatrixSum > maxSum) {
					maxSum = curSubMatrixSum;
					x = twoDMatrix[row][col];
					y = twoDMatrix[row][col + 1];
					z = twoDMatrix[row + 1][col];
					j = twoDMatrix[row + 1][col + 1];

				}
			}
			curSubMatrixSum = 0;
		}
		System.out.println("The maximum sum of elements of the subMatrix 2x2 is: " + maxSum);

		System.out.println(x + " " + y);
		System.out.println(z + " " + j);
	}
}
