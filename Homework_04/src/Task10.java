package homework4;

import java.util.Scanner;

/*Да се състави програма, чрез която се въвеждат 7 цели числа в 
едномерен масив. 
Програмата да изведе числото, което е най-близко до средната 
стойност на въведените числа.
Пример: 1,2,3,4,5,6,7
Изход: средна стойност 4, най-близка стойност 4
*/
public class Task10 {

	public static void main(String[] args) {
		double[] arr1 = new double[7];
		double sum = 0;
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < arr1.length; i++) {
			System.out.println("Please enter array's element: ");
			arr1[i] = sc.nextDouble();
			sum += arr1[i];
		}
		double average = sum / 7;
		double [] arr2 = new double [7];
		for(int i = 0; i < arr2.length; i++) {
			arr2[i] = arr1[i] - average;
			arr2[i] = (arr2[i] < 0) ? 0 - arr2[i] : arr2[i];		
		}
		
		int minIndex = 0;
		for(int i = 1; i < arr2.length; i++) {
			if(arr2[i-1] > arr2[i]){
				minIndex = i;
			}
		}
		System.out.println("Middle value: " + average);
		System.out.println("The closest value: " + (int)arr1[minIndex]);
		sc.close();
	}
}
