package homework3;

import java.util.Scanner;

/*������ � �������� ����� �����.
��������� �� ������ �� ����� �: 2,3,4,5,6,7,8,9,10, ����, ����, ���, ���.
��������� �� ���� �� ������� �: ������, ����, ����, ����.
�� �� ������� ��������, ���� ����� �� ������� N - ����� ��
��������� [1..51] � �� �������� ��������� ����� ����� �
���������� ��-������ ����� �� �������.
������: 47.
�����: ��� ����, ��� ����, ��� ������, ��� ����, ��� ����, ��� ���� */
public class Task21 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the card number from 1 to 52: ");
		int card = sc.nextInt();
		sc.close();
		if (card < 1 || card > 52) {
			System.out.println("Wrong input! Please try again.");
		} else {

			for (int i = card; i <= 52; i++) {

				int cardNumber = (i - 1) / 4 + 1;
				int cardSuit = i % 4;

				switch (cardNumber) {
				case 1:
					System.out.print("������ ");
					break;
				case 2:
					System.out.print("������ ");
					break;
				case 3:
					System.out.print("�������� ");
					break;
				case 4:
					System.out.print("������ ");
					break;
				case 5:
					System.out.print("������� ");
					break;
				case 6:
					System.out.print("������� ");
					break;
				case 7:
					System.out.print("������ ");
					break;
				case 8:
					System.out.print("������� ");
					break;
				case 9:
					System.out.print("������� ");
					break;
				case 10:
					System.out.print("���� ");
					break;
				case 11:
					System.out.print("���� ");
					break;
				case 12:
					System.out.print("��� ");
					break;
				case 13:
					System.out.print("��� ");
					break;
				}

				switch (cardSuit) {
				case 1:
					System.out.print("������");
					break;
				case 2:
					System.out.print("����");
					break;
				case 3:
					System.out.print("����");
					break;
				case 0:
					System.out.print("����");
					break;
				}

				if (i == 52) {
					System.out.print(".");
				} else {
					System.out.print(", ");
				}
			}
		}
	}
}
