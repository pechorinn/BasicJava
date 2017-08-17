
public class Task_02 {
	/*
	 * Едномерен масив наричаме назъбен, ако всеки елемент в масива е > от
	 * предишния и < от следващия. Напишете програма, която проверява дали даден
	 * масив от числа е назъбен.
	 */
	public static void main(String[] args) {

		int[] arr = { 5, 8, 1, 6, 2, 11, 3 };
		boolean isZigUp = true;

		for (int i = 1; i < arr.length; i += 2) {

			if (arr.length % 2 == 0 && i == arr.length - 1) {
				if (arr[i] <= arr[i - 1]) {
					isZigUp = false;
					break;
				}
			} else {
				if (arr[i] <= arr[i - 1] && arr[i] <= arr[i + 1]) {
					isZigUp = false;
					break;
				}
			}
		}

		System.out.println(isZigUp ? "The array is a ZigUpArray." : "The array is not a ZigUpArray.");

	}

}
