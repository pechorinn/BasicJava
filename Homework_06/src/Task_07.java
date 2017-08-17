package lesson_6;
/*
����� ������������� �������� ��������� �� ���������� �����,  
�������� � ��������� ������� � ������� 6 ���� � 6 ������.
�� �� ������� �������� , ���� ����� �� ������ ������ �� ������ 
��������, ����� ���� �� ������� �� ��� � ������ � ����� �����. 
���������� �� ������� ����������� ���� �� ����� ������� ��� �� 
����������� �������, ����� � ������ ���� �� ���� ��������.
�� �� �������� ���� ���� �����.
 */
public class Task_07 {

	public static void main(String[] args) {
		int [][] twoDArray = {
				{11,12,13,14,15,16},
			   	{21,22,23,24,25,26},
				{31,32,33,34,35,36},
				{41,42,43,44,45,46},
				{51,52,53,54,55,56},
				{61,62,63,64,65,66}
		};
		int sumByRow = 0;
		int totalSum = 0;
		for (int row = 0, col = 0; row < twoDArray.length && col < twoDArray[row].length; col++) {

			if ((row + col) % 2 == 0) {
				System.out.print(twoDArray[row][col] + " ");
				sumByRow += twoDArray[row][col];
			}
			if (col == twoDArray[row].length - 1) {
				System.out.print("sum of the elements by row: " + sumByRow);
				System.out.println();
				totalSum += sumByRow;
				sumByRow = 0;
			}
			if (col == twoDArray[row].length - 1 && row < twoDArray.length - 1) {
				row++;
				col = -1;
			}

		}
		System.out.println("Sum of elements: " + totalSum);
	}
}
