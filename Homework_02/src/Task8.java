package homework;

import java.util.Scanner;

/*�� �� ������� ��������, ����� ���� �� ��������� 4-������o
���������� ����� �� ��������� [1000.. 9999]. �� ���� ����� ��
�������� 2 ���� 2-������� �����. ������� ����� �� ������� �� 1-��
� 4-�� ����� �� ���������� �����. ������� ����� �� ������� �� 2-�a -
3-�� ����� �� ���������� �����. ���� �������� �� �� ������ ���� 1-��
���� ����� e ��-����� <, ����� = ��� ��-������ �� 2-�� �����.
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
