
public class Task_08 {
	/*
	 * Напишете програма, която за матрица от булеви стойности, проверява дали
	 * се съдържа елемент със стойност true над втория диагонал.
	 */
	public static void main(String[] args) {

		boolean[][] twoDMatrix = new boolean[3][3];
		boolean containsTrue = false;
        twoDMatrix[0][2] = true;
        
		for (int row = 0; row < twoDMatrix.length; row++) {
			for (int col = 0; col < twoDMatrix[row].length; col++) {
				if (col > 0 && row < twoDMatrix[row].length - 1 && row < col) {
					if(twoDMatrix[row][col]){
						containsTrue = true;
						break;
					}
				}
			}
		}
		System.out.println(containsTrue? "The matrix contains true above the main diagonal." : "The matrix doesn't contain true above the main diagonal.");
	}
}
