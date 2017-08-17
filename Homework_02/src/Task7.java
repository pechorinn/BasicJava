package homework;

import java.util.Scanner;
/*Въведете 3 променливи от клавиатурата – час (целочислен тип), сума
пари (число с плаваща запетая), дали съм здрав – булев тип.
Съставете програма, която взема решения на базата на тези данни по
следния начин:
 - ако съм болен, няма да излизам
 - ако имам пари, ще си купя лекарства
 - ако нямам – ще стоя вкъщи и ще пия чай
 - ако съм здрав, ще отида на кино с приятели
 - ако имам по-малко от 10 лв, ще отида на кафе.
Полученото решение покажете като съобщение в конзолата.
*/
public class Task7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the amount of money you have: ");
		double money = sc.nextDouble();
		System.out.println("Please type true if you are healthy and false if you are not: ");
		boolean isHealthy = sc.nextBoolean();
		sc.close();

		if (isHealthy) {
			if (money >= 10)
				System.out.println("Ще отида на кино с приятели.");
			if (money < 10)
				System.out.println("Ще отида на кафе.");
		} else {
			System.out.println("Болен съм, - няма да излизам.");
			if (money >= 10)
				System.out.println("Ще си купя лекарства.");
			if (money < 10)
				System.out.println("Ще пия чай.");

		}
	}
}
