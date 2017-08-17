package homework3;

import java.util.Scanner;

/*�� �� ������� ��������, ����� ������� ������� 10 ���-�����
�����, ����� �� ����� �� 2, 3 ��� �� 5 � ����� �� ��-������ ��
�������� ���������� �����.
������� �� ��������, ������ � ������ ������� �����.
������ �����: ����� �� ��������� [1..999]
������: 1
�����: 1:2; 2:3, 3:4, 4:5, 5:6, 6:8, 7:9, 8:10, 9:12, 10:14
����������� ����� while.*/

public class Task22 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the number: ");
		int n = sc.nextInt();
		int count = 0;
		while(count < 10) {
			++n;
			if( n % 2 == 0 || n % 3 == 0 || n % 5 == 0) {
				count++;
				System.out.print(count + ":" + n);
				if(count == 10) {
					System.out.print(".");
				}else {
					System.out.print(", ");
				}
			}
		}
		sc.close();
	}
}
