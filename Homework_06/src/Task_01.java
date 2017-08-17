package lesson_6;

public class Task_01 {
	/*
	 * . ������ 1: ����� �������� ����� 6�5 �� ���������� �����, ����� ���������
	 * �� �������� �������������. �� �� ������� ��������, ���� ����� �� ��������
	 * ���������� �� ������ � ���-������� � ���-�������� ��������. ������:
	 * 48,72,13,14,15 21,22,53,24,75 31,57,33,34,35 41,95,43,44,45
	 * 59,52,53,54,55 61,69,63,64,65 �����: ���-����� 13; ���-������ 95
	 */
	public static void main(String[] args) {
		int[][] twoDArray = { { 48, 72, 13, 14, 15 }, 
				{ 21, 22, 53, 24, 75 },
				{ 31, 57, 33, 34, 35 },
				{ 41, 95, 43, 44, 45 }, 
				{ 59, 52, 53, 54, 55 }, 
				{ 61, 69, 63, 64, 65 } };

		int max = twoDArray[0][0];
		int min = twoDArray[0][0];

		for (int row = 0; row < twoDArray.length; row++) {
			for (int col = 0; col < twoDArray[row].length; col++) {
				if (twoDArray[row][col] > max) {
					max = twoDArray[row][col];
				}
				if (twoDArray[row][col] < min) {
					min = twoDArray[row][col];
				}
			}
		}

		System.out.println("�he smallest number in the array: " + min);
		System.out.println("�he biggest number in the array: " + max);
	}

}
