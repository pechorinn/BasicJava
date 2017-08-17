package homework4;

/*
Напишете програма, която създава масив с 10 елемента и 
инициализира всеки от елементите със стойност, равна на индекса на 
елемента, умножен по 3.
Да се изведат елементите на екрана.
*/
public class Task5 {

	public static void main(String[] args) {

		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i * 3;
			if (i == arr.length - 1) {
				System.out.print(arr[i] + ".");
			} else {
				System.out.print(arr[i] + ", ");
			}
		}
	}
}
