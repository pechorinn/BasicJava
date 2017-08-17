package homework4;

import java.util.Scanner;

/*
Една редица от естествени числа ще наричаме зигзагообразна нагоре, 
ако за елементите и са изпълняват условията:
N1 < N2 > N3 < N4 > N5 <..
Съставете програма, която проверява дали въведени в едномерен 
масив редица от числа изпълняват горните изисквания.
Пример: 1 3 2 4 3 7
Изход: изпълнява изискванията за зигзагообразна нагоре редица
 */

public class Task17 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter array's length: ");
		int length = sc.nextInt();
		if (length < 3) {
			System.out.println("According to the task conditions the array's length must be at least 3.");
		} else {
			int[] arr = new int[length];
			for (int i = 0; i < arr.length; i++) {
				System.out.println("Please provide " + (i + 1) + " element of the array.");
				arr[i] = sc.nextInt();
			}
			boolean isZigUp = true;
			for (int i = 1; i < arr.length; i += 2) {
				if (arr.length % 2 == 0 && i == arr.length - 1) {
					if (arr[i] <= arr[i - 1]) {
						isZigUp = false;
						break;
					}
				} else {
					if (arr[i] <= arr[i - 1] || arr[i] <= arr[i + 1]) {
						isZigUp = false;
						break;
					}
				}
			}
			System.out.println(isZigUp ? "The array provided is a zigUp array."
					: "The array provided does not meet requirements to be call a sigUp array.");

			sc.close();
		}
	}
}
