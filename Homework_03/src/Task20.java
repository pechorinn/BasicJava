package homework3;
/*
�� �� ������� ��������, ���� ����� �� ������� ������� ��
�����. ������ �� ���������� �� ���������� ��� ��� ����� ��
����� �� 45.
 */
public class Task20 {

	public static void main(String[] args) {

		for(int i = 9; i >= 0; i--) {
			for(int j = 0; j <= 9; j++) {
				System.out.print((j + 10 - i) % 10 + " ");
			}
			System.out.println();
		}
	}
}
