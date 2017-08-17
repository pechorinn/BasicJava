import java.util.Scanner;

public class Task_11c {

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
			for (int col = 0; col < twoDArray[0].length; col++) {
				for (int row = 0; row < twoDArray.length; row++) {
					if (col % 2 == 0) {
						twoDArray[row][col] = ++counter;
					} else {
						twoDArray[twoDArray.length - 1 - row][col] = ++counter;
					}
		
				}
			
			}
			
			for (int row = 0; row < twoDArray.length; row++) {
				for (int col = 0; col < twoDArray[0].length; col++) {
				System.out.print(twoDArray[row][col] + "\t" 	);					
				}
				System.out.println();
			}
			sc.close();
		}

	}


}
