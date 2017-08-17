package homework;

import java.util.Scanner;

/*Да се състави програма, която чете от конзолата 4-цифренo
естествено число от интервала [1000.. 9999]. От това число се
формират 2 нови 2-цифрени числа. Първото число се формира от 1-та
и 4-та цифра на въведеното число. Второто число се формира от 2-рa -
3-та цифра на въведеното число. Като резултат да се изведе дали 1-то
ново число e по-малко <, равно = или по-голямо от 2-то число.
*/
public class Task8 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int number;
		do {
			System.out.println("Please enter a four digit natural number within range of 1000 to 9999: ");
			number = sc.nextInt();
		} while (number < 1000 || number >= 10000);
		sc.close();
		int thousands = number / 1000;
		int hundreds = (number / 100) % 10;
		int tens = (number / 10) % 10;
		int smallDigits = number % 10;

		int firstNumber = thousands * 10 + smallDigits;
		int secondNumber = hundreds * 10 + tens;
		if (firstNumber < secondNumber) {
			System.out.println("The first number is smaller (" + firstNumber + "<" + secondNumber + ")");
		} else if (firstNumber == secondNumber) {
			System.out.println("The numbers are equal (" + firstNumber + "=" + secondNumber + ")");
		} else {
			System.out.println("The second number is bigger (" + firstNumber + ">" + secondNumber + ")");
		}
	}
}
