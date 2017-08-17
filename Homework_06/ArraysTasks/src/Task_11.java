import java.util.Scanner;

public class Task_11 {
	/*
	 * Да се напише програма която изисква от потребителя да въведе 2 числа n и
	 * m. След това да се построи матрица с размер n x m по следният начин
	 * (примерите са дадени за въведени n=4 и m=5):
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter N value for the matrix: ");
		int n = sc.nextInt();
		System.out.println("Please enter M value for the matrix: ");
		int m = sc.nextInt();

		if (n < 0 || m < 0) {
			System.out.println("Wrong input.");
		} else {
			int counter = 0;
			int[][] twoDArray = new int[n][m];
			for (int row = 0; row < twoDArray.length; row++) {
				for (int col = 0; col < twoDArray[row].length; col++) {
					twoDArray[row][col] = ++counter;
					System.out.print( twoDArray[row][col] + "\t");
				}
				System.out.println();
			}
			System.out.println();
				
			
			
			sc.close();
		}

	}
}