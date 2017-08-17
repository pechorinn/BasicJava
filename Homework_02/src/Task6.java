package homework;

import java.util.Scanner;
/*
 Въведете 3 числа от клавиатурата а1, а2 и а3. Разменете стойностите 
им така, че а1 да има стойността на а2, а2 да има стойността на а3, а 
а3 да има старата стойност на а1.
 */
public class Task6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter first number: ");
		int a1 = sc.nextInt();
		System.out.println("Please enter second number: ");
		int a2 = sc.nextInt();
		System.out.println("Please enter third number: ");
		int a3 = sc.nextInt();
		sc.close();
		int temp = a1;
		a1 = a2;
		a2 = a3;
		a3 = temp;
		System.out.println("a1 = " + a1);
		System.out.println("a2 = " + a2);
		System.out.println("a3 = " + a3);
	}
}
