package homework3;

import java.util.Scanner;
/*�� �������� ����� n, �� �� ������ �� ������ ������� ��  ������� �����:

������:                   
�������� n:                 �������� n:
1                               2
0                              11
                               33
*/

public class Task8 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the number: ");
		int n = sc.nextInt();

		int b = n - 1;
		
			for (int i = 0; i < n; i++) {
				if (i != 0) {
					b += 2;
				}
				for (int j = 0; j < n; j++) {
					System.out.print(b);
				}
				System.out.println();
			}
			sc.close();
		}
}