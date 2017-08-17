package recursionpractise;

import java.util.Scanner;

/*
Въведете число N чрез конзолата и изкарайте като 
резултат следния триъгълник с височина 
N
:
      *
     ***
    *****
.................
Кaто допълнително упражнение – нарисувайте същия 
триъгълник, но незапълнен.
 */
public class Task_11 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the height of triangle: ");
		int n = sc.nextInt();

		if (n < 1) {
			System.out.println("Please enter an integer bigger than zero.");
		} else {
			
			int spaces = 0;
			int asterix = n*2 - 1;
			drawTriangle(spaces, asterix);
		}

		sc.close();
	}
	
	static void drawTriangle(int spaces, int asterix) {
		if(asterix == 1) {
			System.out.print(new String(new char[spaces]));
			System.out.print(new String(new char[asterix]).replace('\0', '*'));
			System.out.println();
			return;
		}
		
		drawTriangle(spaces + 1, asterix - 2);
		System.out.print(new String(new char[spaces]));
		System.out.print(new String(new char[asterix]).replace('\0', '*'));
		System.out.println();
	}
}
