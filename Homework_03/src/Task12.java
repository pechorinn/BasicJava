package homework3;
/*�� �� ������� ��������, ����� ������� ������
���������� ���������� �����, ����� ����� ������� ����� �.�.
100,101, 606 � �.�. �� �� ��������.*/
public class Task12 {

	public static void main(String[] args) {
	
			for (int i = 1; i <= 9; i++) {
				for (int j = 0; j <= 9; j++) {
					for(int y = 0; y <= 9; y++) {
						if(i != j && i != y && j != y) {
							System.out.print("" + i + j + y + " ");
					}
				}
			}
		}
	}
}