package homework3;

import java.util.Scanner;

/* Да се състави програма, която извежда квадрат, чийто страни са 
оформени със знака *, а вътрешността е запълнена със въведен знак. 
Входни данни b - дължина на страната число от интервала 
[3..20], c - желан знак. 
Програмата да използва цикъл for. 
 */
public class Task17 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the lentgth of the square: ");
		int side = sc.nextInt();
		System.out.println("Please enter the symbol you wish the square to be filled  with: ");
		char c = sc.next().charAt(0);
		sc.close();
		if (side < 3 || side > 20) {
			System.out.println("Illegal input. Please try again.");
		} else {

			for (int i = 0; i < side; i++) {
				//handles top and bottom rows
				if (i == 0 || i == side - 1) {
					for (int j = 0; j < side; j++) {
						System.out.print("*");
					}
					System.out.println();
				} else {
					for (int row = 0; row < side - 1; row++) {
						if (row == 0) {
							System.out.print("*");
						} else {
							System.out.print(c);
						if(row == side - 2)	System.out.print("*");
						}
					}
					System.out.println();
				}
			}
		}
	}
}
