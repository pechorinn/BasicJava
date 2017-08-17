package homework4;

import java.util.Scanner;


/*
 Да се прочете масив и да се намери най-малкото число кратно на
 3 от мaсива. 
 10, 3, 5, 8, 6, -3, 7
 Най-малкото число кратно на 3 е -3
*/
public class Task1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the length of the array: ");
		int length = sc.nextInt();
		if (length < 1) {
			System.out.println("Please provide valid length.");
		} else {
			int[] arr = new int[length];
			int minMultOfTree = 0;
			boolean hasAMultipleOfThree = false;
			for (int i = 0; i < arr.length; i++) {
				System.out.println("Please enter array's element: ");
				arr[i] = sc.nextInt();
				if (arr[i] % 3 == 0) {
					if (!hasAMultipleOfThree) {
						minMultOfTree = arr[i];
						hasAMultipleOfThree = true;
					} else {
						if (arr[i] < minMultOfTree) {
							minMultOfTree = arr[i];
						}
					}
				}
			}
			sc.close();

			if (!hasAMultipleOfThree) {
				System.out.println("The array doesn't contain a number which is a multiple of three.");
			} else {
				System.out.println("The minimum multiple of three in the array is: " + minMultOfTree);
			}
		}
	}
}
