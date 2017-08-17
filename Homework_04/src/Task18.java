package homework4;

/*
 Дадени са два едномерни масива с естествени числа.
Да се състави програма, която сравнява всички числа с еднакви 
индекси от двата масива и записва в трети масив, по-голямото от 
двете числа.
Да се изведе съдържанието и на трите масива
Пример:
18,19,32,1,3, 4, 5, 6, 7, 8
1, 2, 3,4,5,16,17,18,27,11
Изход: 
18,19,32 ,4,5,16,17,18,27,11
 */
public class Task18 {

	public static void main(String[] args) {

		int[] firstArray = { 18, 19, 32, 1, 3, 4, 5, 6, 7, 8 };
		int[] secondArray = { 1, 2, 3, 4, 5, 16, 17, 18, 27, 11 };

		if (firstArray.length != secondArray.length) {
			System.out.println("The arrays must be equal.");
		} else {
			int[] newArray = new int[firstArray.length];
			for (int i = 0; i < newArray.length; i++) {
				if (firstArray[i] > secondArray[i]) {
					newArray[i] = firstArray[i];
				} else {
					newArray[i] = secondArray[i];
				}
			}
			System.out.println("First array:");
			for (int i = 0; i < firstArray.length; i++) {
				System.out.print(firstArray[i] + " ");
			}
			System.out.println();
			System.out.println("Second array:");
			for (int i = 0; i < secondArray.length; i++) {
				System.out.print(secondArray[i] + " ");
			}
			System.out.println();
			System.out.println("New array:");
			for (int i = 0; i < newArray.length; i++) {
				System.out.print(newArray[i] + " ");
			}
		}
	}
}
