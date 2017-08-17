package lesson_6;
/*
  Да се състави програма, при която предварително са въведени 
естествени числа в двумерен масив 4*4 елемента.
Програмата да извежда резултат от проверката какво е съотношението
на най-голямата сума по редове спрямо най-голямата сума по колони.
Пример:
1,2,3,4
5,6,7,8
9,10,11,12
13,14,15,16
 */
public class Task_05 {

	public static void main(String[] args) {

		int [][] twoDArray = {
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12},
				{13,14,15,16}
		      };
		int maxSumByCol = 0;
		int currentSumByCol = 0;
		int maxSumByRow = 0;
		int currentSumByRow = 0;
		for (int row = 0; row < twoDArray.length; row++) {
			for (int col = 0; col < twoDArray[row].length; col++) {
				if (row == 0) {
					maxSumByRow += twoDArray[row][col];
				}
				if (row > 0) {
					currentSumByRow += twoDArray[row][col];
				}
			}
			if (row > 0 && currentSumByRow > maxSumByRow) {
				maxSumByRow = currentSumByRow;
			}
			currentSumByRow = 0;
		}

		for (int col = 0; col < twoDArray.length; col++) {
			for (int row = 0; row < twoDArray.length; row++) {
				if (col == 0) {
					maxSumByCol += twoDArray[row][col];
				}
				if (col > 0) {
					currentSumByCol += twoDArray[row][col];
				}
			}
			if (col > 0 && currentSumByCol > maxSumByCol) {
				maxSumByCol = currentSumByCol;
			}
			currentSumByCol = 0;
		}

		float ratioRowByCol = (float) maxSumByRow / maxSumByCol;
		
		System.out.println("Max sum by row: " + maxSumByRow);
		System.out.println("Max sum by colomn: " + maxSumByCol);
		System.out.println("The result is: " + ratioRowByCol);
	}
}
