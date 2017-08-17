package recursionpractise;

import java.util.Scanner;

/*
�� �� ������� �� ����������� 2 �����. � �� �� 
������� �� ������ ������ ����� �� ��-������� �� ��-��������.
 */
public class Task_05 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter first number: ");
		int first = sc.nextInt();
		System.out.println("Please enter second number: ");
		int second = sc.nextInt();
		sc.close();
		int min = (first < second) ? first : second;
		int max = (first > second) ? first : second;
		printNumbers(min,max);
	}

	static void printNumbers(int min, int max) {
		if(min == max) {
			System.out.print(max + " ");
			return;
		}
		printNumbers(min, max - 1);	
		System.out.print(max + " ");
	}
}
