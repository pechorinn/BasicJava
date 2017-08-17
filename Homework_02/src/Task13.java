package homework;

import java.util.Scanner;
/*Да се състави програма, която да отгатне колко е студено/топло по
въведената температура t в градус Целзий.
Температурните интервали са:
под -20 ледено студено;
между 0 и -20 - студено;
между 15 и 0 - хладно;
между 25 и 15 - топло;
над 25 – горещо.
Входни данни: цяло число от интервала [-100..100].
*/
public class Task13 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int temperature;
		do {
			System.out.println("Please enter the temperature within the range of -100 and 100: ");
			temperature = sc.nextInt();

		} while (temperature < -100 || temperature > 100);
		sc.close();
		if (temperature > 25) {
			System.out.println("Hot");
		} else if (temperature >= 15 && temperature <= 25) {
			System.out.println("Warm");
		} else if (temperature >= 0 && temperature < 15) {
			System.out.println("Cool");
		} else if (temperature >= -20 && temperature < 0) {
			System.out.println("Cold");
		} else if (temperature < -20) {
			System.out.println("Freezing Cold");
		}
	}

}
