package lesson_6;

import java.util.Scanner;

/*
Задача 2:
Имате квадратен двумерен масив от естествени числа, чийто стойности се въвеждат от конзолата. Да се отпечатат диагоналите на масива.
Пример:
1,4,6,3
5,9,7,2
4,8,1,9
2,3,4,5
Изход: 
1 9 1 5
3 7 8 2*/
public class Task_02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the size of the matrix: ");
		int size = sc.nextInt();
		if (size < 0) {
			System.out.println("Wrong input!");
		} else {
			int[][] matrix = new int[size][size];
			for (int row = 0; row < matrix.length; row++) {
				for (int col = 0; col < matrix[row].length; col++) {
					System.out.println(
							"Please enter coordinates for the elements cell[" + (row + 1) + "[" + (col + 1) + "]");
				}
			}
			System.out.print("First diagonal: ");
			for (int i = 0; i < matrix.length; i++) {
				System.out.print(matrix[i][i] + " ");
			}
			System.out.print("\nSecond diagonal: ");
			for (int i = 0; i < matrix.length; i++) {
				System.out.print(matrix[i][matrix.length - 1 - i] + " ");
			}
		}
		sc.close();
	}
}
