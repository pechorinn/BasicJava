package recursionpractise;

/*
�� �� ������� ��������, ����� ���� ����� 
while ������� ��������� �� ���������, �� ��� ����������. 
�.�. ��� � �������� 4*5 �� �� ������� 5*4. 
 */
public class Task_23 {

	public static void main(String[] args) {

		printTable(1, 2);
	}

	static void printTable(int number1, int number2) {
		
		if (number2 == 10 && number1 < 9) {
			number1 += 1;
			number2 = number1;
		}
		System.out.println(number1 + "*" + number2 + "=" + (number1 * number2));

		if (number1 == 9) {
			return;
		}
		printTable(number1, number2 + 1);
	}
}
