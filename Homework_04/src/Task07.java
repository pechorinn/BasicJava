package homework4;

import java.util.Scanner;

/*
 Напишете програма, която първо чете масив  и после създава нов 
масив със същия размер по следния начин: стойността на всеки 
елемент от втория масив да е равна на сбора от предходния и 
следващият елемент на съответния елемент от първия масив. Първият 
и последният елемент на втория масив трябва да си останат равни на 
първият и последният от елемент от първия масив.
Да се изведе получения масив.
 */
public class Task7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter array's length: ");
		int length = sc.nextInt();
		if (length < 2) {
			System.out.println("The array length must be at least two.");
		} else {
			int[] arr1 = new int[length];
			for (int i = 0; i < arr1.length; i++) {
				System.out.println("Please enter array's element: ");
				arr1[i] = sc.nextInt();
			}
			int[] arr2 = new int[length];
			arr2[0] = arr1[0];
			arr2[arr2.length - 1] = arr1[arr1.length - 1];
			System.out.println("The new array's elements: ");
			System.out.print(arr2[0] + ",");
			for (int i = 1; i < arr2.length - 1; i++) {
				arr2[i] = arr1[i - 1] + arr1[i + 1];

				System.out.print(arr2[i] + ",");
			}
			System.out.print(arr2[arr2.length - 1] + ".");
		}
		sc.close();
	}
}
