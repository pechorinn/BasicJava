package homework4;

import java.util.Scanner;
/*Задача 4:
Да се прочете масив и да се отпечата дали е огледален.
Следните масиви са огледални:
[3 7 7 3]
[4]
[1 55 1]
[6 27 -1 5 7 7 5 -1 27 6]*/

public class Task4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter array's length: ");
		int length = sc.nextInt();
		if (length < 1) {
			System.out.println("Please enter valid length complying with the conditions.");
		} else {
			boolean isMirror = true;
			int[] arr = new int[length];
			for (int i = 0; i < arr.length; i++) {
				System.out.println("Please enter array's element: ");
				arr[i] = sc.nextInt();
			}
			for (int i = 0; i < arr.length / 2; i++) {
				if (arr[i] != arr[arr.length - 1 - i]) {
					isMirror = false;
					break;
				}
			}
			System.out.println("The array is a mirror type? - " + isMirror);
		}
		sc.close();
	}
}
