package lesson_08;

/*
 Да се състави програма, чрез която по въведени трите имена на двама 
човека разделени със запетая, се извежда чие име има по-голям сбор 
от ASCII кодовете на съставящите името букви.
Пример: Anna Dosewa Asenowa, Iwo Peew Peew
Изход: Anna Dosewa Asenowa
 */
public class Task_04 {

	public static void main(String[] args) {

		String str = "Anna Dosewa Asenowa, Iwo Peew Peew";
		String[] strArray = str.split(",");
		printResult(strArray);
	}

	static void printResult(String[] array) {
		int sumOfCharsStr1 = 0;
		int sumOfCharsStr2 = 0;
		for (int i = 0; i < array[0].length(); i++) {
			sumOfCharsStr1 += (int) array[0].charAt(i);
		}
		for (int i = 0; i < array[1].length(); i++) {
			sumOfCharsStr2 += (int) array[1].charAt(i);
		}

		System.out.println("First sum: " + sumOfCharsStr1);
		System.out.println("Second sum: " + sumOfCharsStr2);

		if (sumOfCharsStr2 != sumOfCharsStr1) {
			System.out.println((sumOfCharsStr1 > sumOfCharsStr2) ? array[0] : array[1]);
		} else {
			System.out.println("Both names have equal some of characthers.");
		}
	}
}
