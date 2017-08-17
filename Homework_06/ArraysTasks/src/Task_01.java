
public class Task_01 {
	/*
	 * Напишете програма, която проверява дали в масив от цели числа всички
	 * числа са неотрицателни.
	 */
	public static void main(String[] args) {
		boolean isNegative = true;
		int[] arr = { -3, -8, -9, -6 };
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= 0) {
				isNegative = false;
				break;
			}
		}
		System.out.println(isNegative ? "All the elements are negative" : "Not all the elements are negative.");

	}
}
