package homework3;

import java.util.Scanner;

/*Въведете число N чрез конзолата и изкарайте като 
резултат следния триъгълник с височина N:
      *
     * *
    *****
.................
Нарисувайте същия триъгълник, но незапълнен.*/
public class Task11a {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the height of the triangle: ");
		int n = sc.nextInt();
		int sp1 = n - 1;
		int sp2 = 0;

		for (int i = 0; i < n; i++) {
			// handling spaces before the left side
			for (int spaces1 = sp1 - i; spaces1 > 0; spaces1--) {
				System.out.print(" ");
			}
			// draws the left side of the triangle and the tip
			System.out.print("*");
			// the bottom row
			if (i == n - 1) {
				for (int endRow = 2 * n - 2; endRow > 0; endRow--) {
					System.out.print("*");
				}
			} else {
				// handles spaces between left and right sides
				for (int spaces2 = sp2 + i * 2; spaces2 > 1; spaces2--) {
					System.out.print(" ");
				}
				// draws the right side (please note - the tip is handled by
				// left side)
				if (i != 0)
					System.out.print("*");
				System.out.println();
			}
		}
		sc.close();
	}
}
