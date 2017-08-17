package homework3;

import java.util.Scanner;

/*Да се състави програма, чрез която по въведено
естествено число от интервала [10..99] се извежда поредица
числа, при спазване на следните изисквания:
1) ако предходното число е четно се извежда 0.5*числото;
2) ако предходното число е нечетно се извежда 3*числото +1.
Извеждането продължава докато не се получи стойност 1.
Пример: 11
Изход: 34 17 52 26 13 40 20 10 5 16 8 4 2 1.*/
public class Task19 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the number: ");
		int n = sc.nextInt();
		if (n < 10 || n > 99) {
			System.out.println("Wrong input. Please try again!");

		} else {

			int temp = n;
			while (temp > 1) {
				if (temp % 2 == 0) {
					temp = temp / 2;
					System.out.print(temp + " ");
				} else {
					temp = 3 * temp + 1;
					System.out.print(temp + " ");
				}
			}
			sc.close();
		}
	}
}