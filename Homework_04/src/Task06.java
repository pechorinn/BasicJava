package homework4;

import java.util.Scanner;

/*
Напишете програма, която първо чете 2 масива и после извежда 
съобщение дали са еднакви, и дали са с еднакъв размер.
 */
public class Task6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter length of the first array: ");
		int length1 = sc.nextInt();
		System.out.println("Please enter length of the second array: ");
		int length2 = sc.nextInt();
		if (length1 < 0 || length2 < 0) {
			System.out.println("Please enter positive values for both length.");
		} else {
			if (length1 != length2) {
				System.out.println("The arrays cannot be equal. They have different lengths.");
			} else {
				int[] arr1 = new int[length1];
				for (int i = 0; i < arr1.length; i++) {
					System.out.println("Please enter element of the first array: ");
					arr1[i] = sc.nextInt();
				}
				int[] arr2 = new int[length2];
				for (int i = 0; i < arr2.length; i++) {
					System.out.println("Please enter element of the second array: ");
					arr2[i] = sc.nextInt();
				}
				boolean isEqual = true;

				for (int i = 0; i < arr1.length; i++) {
					if (arr1[i] != arr2[i]) {
						isEqual = false;
						break;
					}
				}
				System.out.println("The arrays are equal: - " + isEqual);
			}
			sc.close();
		}
	}
}