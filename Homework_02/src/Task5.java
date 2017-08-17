package homework;

import java.util.Scanner;

/*
Въведете 3 различни числа от конзолата и ги разпечатайте в низходящ ред.
*/
public class Task5 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter first number: ");
		int a = sc.nextInt();
		System.out.println("Please enter second number: ");
		int b = sc.nextInt();
		System.out.println("Please enter third number: ");
		int c = sc.nextInt();
		sc.close();
		int max = 0;
		int min = 0;

		if (a > b) {
			max = a;
			min = b;
		} else {
			max = b;
			min = a;
		}

		if (max < c) {
			System.out.println(c);
			System.out.println(max);
			System.out.println(min);
		} else {
			if (c < min) {
				System.out.println(max);
				System.out.println(min);
				System.out.println(c);
			} else {
				System.out.println(max);
				System.out.println(c);
				System.out.println(min);
			}
		}
	}
}
