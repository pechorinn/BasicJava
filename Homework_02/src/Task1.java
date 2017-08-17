package homework;

import java.util.Scanner;
/*
 Да се изведат съобщения към потребителя и да се прочетат 2 числа от 
клавиатурата A и B (може да са с плаваща запетая – double).
После да се прочете 3-то число C и да се провери дали то е м/у A и B.
Да се изведе подходящо съобщение за това дали C е между A и B.
 */
public class Task1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter first number: ");
		double a = sc.nextDouble();
		System.out.println("Please enter second number: ");
		double b = sc.nextDouble();
		System.out.println("Please enter third number: ");
		double c = sc.nextDouble();
		sc.close();
		if ((c > a && c < b)||(c > b && c < a)) {
			System.out.println("The number " + c + " is between " + a + " and " + b);
		} else {
			System.out.println("The number " + c + " is not between " + a + " and " + b);
		}
	}

}
