package homework4;

import java.util.Scanner;

/*
 Нека по въведен масив да се конструира нов, като половината му
 елементи са точно като на оригиналния, а другите да са тези 
 елементи, но в обратен ред. Последно, да се изведе новия масив 
 на екрана.
 
 */
public class Task2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter array's length it should be an even number: ");
		int length = sc.nextInt();
		if (length < 1 || length % 2 != 0) {
			System.out.println("Please enter a normal length for the array and try again.");
		} else {
			int[] arr = new int[length];
			for (int i = 0; i < arr.length; i++) {
				System.out.println("Please enter array element: ");
				arr[i] = sc.nextInt();
			}
			System.out.println("New array elements: ");
			for (int i = 0; i < arr.length; i++) {
				if (i < arr.length / 2) {
					arr[i] = arr[i];
					System.out.print(arr[i] + ", ");
				} else {
					arr[i] = arr[(arr.length - 1) - i];
					if (i == arr.length - 1) {
						System.out.print(arr[i] + ".");
					} else {
						System.out.print(arr[i] + ", ");
					}
				}
			}
		}
		sc.close();
	}
}
