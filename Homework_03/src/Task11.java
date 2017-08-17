package homework3;

import java.util.Scanner;

/*Въведете число N чрез конзолата и изкарайте като 
резултат следния триъгълник с височина N:
      *
     ***
    *****
.................
*/

public class Task11 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the height of the triangle: ");
		int n = sc.nextInt();
		sc.close();
		int sp = n - 1;
		int as = 1;
		
		for (int row = 0; row < n; row++) {

			for(int spaces = sp - row; spaces >= 0; spaces--){
				System.out.print(" ");
			}
			for(int asterix = (as + row)*2; asterix > 1; asterix--){
				System.out.print("*");
			}	
			
			System.out.println();
		}
	}
}
