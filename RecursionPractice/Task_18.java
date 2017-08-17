package recursionpractise;

import java.util.Scanner;

/*
Да се състави програма, чрез която се въвеждат 
две числа от интервала [1..9].
Програмата да извежда таблицата за умножение.
Максималната стойност на множителите е определена от 2-те числа.
Пример: 2 2 
Изход:
1*1= 1; 
1*2= 2;
2*1= 2; 
2*2= 4
 */
public class Task_18 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter first number: ");
		int first = sc.nextInt();
		System.out.println("Please enter second number: ");
		int second = sc.nextInt();
		sc.close();
		if (first < 1 || first > 9 || second < 1 || second > 9) {
			System.out.println("The numbers must be within range [1 - 9]. Please try again.");
		} else {
			
			int currentSecond = second;
			printResult( second, first, currentSecond);
		}
	}

	static void printResult( int second, int first, int currentSecond) {
		if (currentSecond == 0 && first > 1) {
			first--;
			currentSecond = second;
		} 
		if (currentSecond == 0 && first == 1) {
			return;
		} 
		printResult(second, first, currentSecond - 1);
		System.out.println(first + "*" + currentSecond + "=" + (first * currentSecond));
	}
}
