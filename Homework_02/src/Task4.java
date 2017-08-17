package homework;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter first number: ");
		int a = sc.nextInt();
		System.out.println("Please enter second number: ");
		int b = sc.nextInt();
		sc.close();
		if (a > b) {
			System.out.println(a);
			System.out.println(b);
		} else {
			System.out.println(b);
			System.out.println(a);
		}

	}

}
