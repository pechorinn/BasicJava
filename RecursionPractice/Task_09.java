package recursionpractise;

import java.util.Scanner;

/*
Да се прочетат 2 числа от клавиатурата А и В. 
Да се изведат всички числа от А до В на степен 2(разделени с 
запетая).Ако някое число е кратно на 3, да се изведе съобщение че 
числото се пропуска „skip 3“.Ако сумата от всички изведени числа (без
пропуснатите) стане по-голяма от 200, да се прекрати извеждането.

 */
public class Task_09 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter number A: ");
		int first = sc.nextInt();
		System.out.println("Please enter second number B: ");
		int second = sc.nextInt();
		sc.close();
		int min = (first > second ? second : first);
		int max = (first > second ? first : second);
		int sum = 0;
		printSequence(min, max, sum);
	}

	static int printSequence(int min, int max, int sum) {

		if (min == max) {
			if ((max * max) % 3 == 0) {
				System.out.print("skip 3,");
			} else {
				System.out.print(max * max + ",");
				sum = max * max;
			}
			return sum;
		}
		sum = printSequence(min, max - 1, sum);
		sum = max * max % 3 != 0 ? sum + max * max : sum;
		if ((max * max) % 3 != 0 && sum <= 200) {
			System.out.print(max * max + ",");
		} else {
			if (sum <= 200)
				System.out.print("skip 3,");
		}
		return sum;
	}
}
