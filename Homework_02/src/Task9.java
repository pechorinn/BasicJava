package homework;

import java.util.Scanner;

/*�� �� ������� ��������, ����� ���� �� ��������� 2 ����������
���������� ����� a,b.
���������� �� ������ � ��������� ���� ���������� ����� ��
�������������� �� ����� ����� � �����, ����� � ������ �����.
������ �����: a,b - ���������� ����� �� ��������� [10..99].
*/

public class Task9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		int b;
		do {
			System.out.println("Please enter firts natural number within range of 10 to 99: ");
			a = sc.nextInt();
			System.out.println("Please enter second natural number within range of 10 to 99: ");
			b = sc.nextInt();

		} while ((a < 10 || a >= 100)&&(b < 10 || b >= 100));
		sc.close();
		
		int aByb = a * b;
		int lastDigit = aByb % 10;
		if((lastDigit & 1) == 1){
			System.out.println(aByb + ", " + lastDigit + " odd number.");
		} else {
			System.out.println(aByb + ", " + lastDigit + " even number.");

		}
	}
}
