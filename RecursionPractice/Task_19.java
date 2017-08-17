package recursionpractise;
/*
Да се състави програма, чрез която по въведено 
естествено число от интервала [10..99] се извежда поредица 
числа, при спазване на следните изисквания:
1) ако предходното число е четно се извежда 0.5*числото;
2) ако предходното число е нечетно се извежда 3*числото + 1.
Извеждането продължава докато не се получи стойност 1.
Пример: 11 
Изход: 34 17 52 26 13 40 20 10 5 16 8 4 2 1.
 */

public class Task_19 {

	public static void main(String[] args) {

		int n = 11;
		printResult(n);
	}

	static void printResult(int n) {
		if (n % 2 == 0) {
			n = n / 2;
			System.out.print(n + " ");
		} else {
			n = 3 * n + 1;
			System.out.print(n + " ");
		}

		if (n == 1) {
			return;
		}
		printResult(n);

	}
}
