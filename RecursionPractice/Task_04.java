package recursionpractise;
// �� �� ������� �� ������ ������� �� 10 �� 1 � ������� ���.
public class Task_04 {

	public static void main(String[] args) {

		int start = 10;
		int end = 1;
		printReverse(start,end);
	}
	
	static void printReverse(int start, int end) {
		
		if(end == start) {
			System.out.print(end + " ");
			return;
		}
		printReverse(start, end + 1);
		System.out.print(end + " ");
	}
}
