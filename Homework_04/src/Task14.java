package homework4;

/*
����� ������������� ������� ��������� �����, �������� ������ �����.
�� �� ������� ��������, ���� ����� �� ������� ���� �������� �� 
������ ��� ��������� �� ��������� [-2.99..2.99] � �� ���������� � ��� 
�����. ������ ����� �� �� ������� �� ������.
������: 7.1,8.5,0.2,3.7,0.99,1.4,-3.5,-110,212,341,1.2
�����: 0.2; 0.99; 1.4; 1.2
 */
public class Task14 {

	public static void main(String[] args) {

		double[] arr = { 7.1, 8.5, 0.2, 3.7, 0.99, 1.4, -3.5, -110, 212, 341, 1.2 };
		int newArrayLength = 0;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= -2.99 && arr[i] <= 2.99) {
				newArrayLength++;
			}
		}	
		int newArrayIndex = 0;

		double[] newArray = new double[newArrayLength];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= -2.99 && arr[i] <= 2.99) {
				newArray[newArrayIndex] = arr[i];
				System.out.print(newArray[newArrayIndex] + " ");
				newArrayIndex++;
			}
		}
	}
}
