import java.util.Arrays;

public class Task_04 {
	/*
	 * Напишете програма, която сортира (подрежда елементите във възходящ ред)
	 * масив, съдържащ само 0 и 1.
	 */
	public static void main(String[] args) {

		int[] arr = { 0, 1, 0, 1, 1, 1, 1, 1, 0, 1, 0, 1, 0, 1, 1, 1, 1 };
		int countOfZeros = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				countOfZeros++;
			}
		}

		for (int i = 0; i < arr.length; i++) {
			if(i < countOfZeros) {
				arr[i] = 0;
			} else {
				arr[i] = 1;
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
