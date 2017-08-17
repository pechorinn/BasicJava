package homework;

import java.util.Scanner;

/*Да се състави програма, която по въведени координати на 2 позиции
от шахматната дъска извежда отговор дали са оцветени в еднакъв или
различен цвят.
Шахматната дъска е квадратна.
Въвеждат се две двойки числа от интервала [1..8].
*/

public class Task14 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int x1;
		int y1;
		int x2;
		int y2;
		do {
			System.out.println("Please enter x1 coordinate:");
			x1 = sc.nextInt();
			System.out.println("Please enter y1 coordinate:");
			y1 = sc.nextInt();
			System.out.println("Please enter x2 coordinate:");
			x2 = sc.nextInt();
			System.out.println("Please enter y2 coordinate:");
			y2 = sc.nextInt();
		} while ((x1 <= 0 && x1 > 8) || (y1 <= 0 && y1 > 8) || (x2 <= 0 && x2 > 8) || (y2 <= 0 && y2 > 8));
		sc.close();
		if ((((x1 + y1) % 2 == 0) && (x2 + y2) % 2 == 0) || (((x1 + y1) % 2 == 1) && (x2 + y2) % 2 == 1)) {
			System.out.println("Positions are of the same color.");
		} else {
			System.out.println("Positions are of different color.");
		}
	}

}
