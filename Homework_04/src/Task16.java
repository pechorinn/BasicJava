package homework4;
/*
�� �� ������� ��������, ���� ����� ������������� �������� 10 
������ ����� �� ��������� �� ���������� �� ������� �����: 
1. ������� �������������� �����.
2. ������ �������� ��� �������� ��-����� �� -0.231 �� ������� ��� 
������ �� �������� �� �������� �� ����� + ������� 41.25, � ������ 
�������� �������� �� ������� � �������������� ����� ����� ������� 
� �������� ������� �����. ��������� ����� �� ������� ������� � 1.
3. �� �� ������� ���������� �� �������� � ��������������� �����.
 */
public class Task16 {

	public static void main(String[] args) {

		float [] arr = {-1.12f, -2.43f, 3.1f, 4.2f, 0f, 6.4f, - 7.5f, 8.6f, 9.1f, -4f};
		System.out.println("The elements of original array: ");
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i] + " ");
		}
		System.out.println();		
		System.out.println("The elements of new array: ");
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] < -0.231) {
				arr[i] = (i+1)*(i+1) + 41.25f;
				System.out.print(arr[i] + " ");
			} else {
				arr[i] = (i+1)*arr[i];
				System.out.print(arr[i] + " ");
			}
		}
	}
}
