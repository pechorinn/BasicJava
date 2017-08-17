package homework;

import java.util.Scanner;
/*Да се състави програма, която въвежда естествено число от интервала
[0..24].
Програмата да изведе съответстващо съобщение съобразно въведения
час.
Периодите са:
[18..4] - Добър вечер;
[4..9] - Добро утро;
[9..18] - Добър ден
*/

public class Task15 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int hour;
		do {
			System.out.println("Please enter an hour of the day from 0 to 24");
			hour = sc.nextInt();
		} while (hour < 0 || hour > 24);
		sc.close();
		if (hour > 18 || hour < 4) {
			System.out.println("Good Evening");
		} else if (hour >= 4 && hour < 9) {
			System.out.println("Good Morning");
		} else {
			System.out.println("Good day");
		}
	}

}
