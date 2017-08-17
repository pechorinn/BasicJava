package homework3;

import java.util.Scanner;
/*Да се въведат от потребителя 2 числа. И да се 
изведат на екрана всички числа от по-малкото до по-голямото.*/
public class Task5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter first number: ");
		int first = sc.nextInt();
		System.out.println("Please enter second number: ");
		int second = sc.nextInt();
		sc.close();
		int max;
		int min;
		if (first > second) {
			max = first;
			min = second;
		} else {
			max = second;
			min = first;
		}
		
		for(int i = min; i <= max; i++) {
			System.out.print(i + " ");
		}
	}
}
