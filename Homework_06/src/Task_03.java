package lesson_6;

public class Task_03 {
	/*
	 * Задача 3: Имате двумерен масив от числа, чийто стойности са въведени
	 * предварително. Да се отпечатат сумата на елементите на масива, както и
	 * средноаритметичното на тези числа.
	 */
	public static void main(String[] args) {

		int[][] twoDArray = { { 1, 4, 6, 3 }, { 5, 9, 7, 2 }, { 4, 8, 1, 9 }, { 2, 3, 4, 5 } };
		int sum = 0;
		int count = 0;
		for (int row = 0; row < twoDArray.length; row++) {
			count += twoDArray[row].length;
			for (int col = 0; col < twoDArray[row].length; col++) {
				sum += twoDArray[row][col];
			}
		}
		float average = (float) sum / count;
		System.out.println("Sum of all elements: " + sum);
		System.out.println("Average of all the numbers in the array: " + average);

	}
}
