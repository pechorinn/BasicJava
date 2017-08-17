package lesson_6;
/*
����� ������������� �������� ��������� �� ���������� �����. 
������� �� �������� � ��������� ������� � ������� 6 ���� � 6 
������.
�� �� ������� ��������, ���� ����� �� ������ ������ �� ������ 
�������� �� �������� � ����� ������: 2,4 � 6.
���������� �� ������� � ������ �� ����� ������� ���.
������:
11,12,13,14,15,16,
21,22,23,24,25,26,
31,32,33,34,35,36,
41,42,43,44,45,46,
51,52,53,54,55,56,
61,62,63,64,65,66
�����:
21,22,23,24,25,26 ���� 141
41,42,43,44,45,46 ���� 261
61,62,63,64,65,66 ���� 381
���� �� ���������� 783*/
public class Task_06 {

	public static void main(String[] args) {

		int [][] twoDArray = {
				{11,12,13,14,15,16},
			   	{21,22,23,24,25,26},
				{31,32,33,34,35,36},
				{41,42,43,44,45,46},
				{51,52,53,54,55,56},
				{61,62,63,64,65,66}
		};
		
		int sum = 0;
		int sumOfRow = 0;
		for(int row = 1; row < twoDArray.length; row +=2) {
			for(int col = 0; col < twoDArray[row].length; col++) {
				System.out.print(twoDArray[row][col] + " ");
				sumOfRow += twoDArray[row][col];
			}
		System.out.print("sum of the row: " + sumOfRow);
		sum += sumOfRow;
		sumOfRow = 0;
		System.out.println();
		}
		System.out.println("Sum of all the elements of even rows: " + sum);
	}
}
