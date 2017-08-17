package homework4;

import java.util.Scanner;

/*
Да се състави програма, която въвежда в едномерен масив реални числа. 
Като изход: програма извежда онези 3 различни числа, чиято 
абсолютна стойност формира максималната обща сума.
Пример: 7.13; 0.2; 4.9; 5.1; 6.34; 1.12 
Изход: 5.1; 6.34; 7.13
 */
public class Task15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the length of the array: ");
		int length = sc.nextInt();
		if (length < 3) {
			System.out.println("The length must be at least three according to task conditions.");
		} else {
			double[] array = new double[length];
			for (int i = 0; i < array.length; i++) {
				System.out.println("Please enter array's " + (i + 1) + " element.");
				array[i] = sc.nextDouble();
			}
			for (int i = 0; i < 3; i++) {
				for (int j = 1; j < array.length - i; j++) {
					array[j-1] = array[j-1] < 0 ? 0 - array[j-1] : array[j-1];
					array[j] = array[j] < 0 ? 0 - array[j] : array[j];
					if (array[j] < array[j - 1]) {
						double temp;
						temp = array[j];
						array[j] = array[j - 1];
						array[j - 1] = temp;
					}
				}
			}
			System.out.println("The three biggest numbers: " + array[array.length-3] + ", " + array[array.length - 2] + ", " + array[array.length - 1]);
		}
		sc.close();
	}
}
