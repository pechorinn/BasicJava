package homework4;

/*
Напишете програма, която намира и извежда най-дългата редица от 
еднакви поредни елементи в даден масив.
 */
public class Task8 {

	public static void main(String[] args) {

		int[] arr = { 1, 5, 8, 9, 999, 9, 4, 444, 4, 0, 0 };
		int curCount = 0;
		int curValue;
		int maxCount = 0;
		int maxValue = 0;
		boolean allElementsUsedOnes = true;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] == arr[i + 1]) {
				curCount++;
				curValue = arr[i];
				if (curCount > maxCount) {
					allElementsUsedOnes = false;
					maxCount = curCount;
					maxValue = curValue;
				}
			} else {
				curCount = 0;
			}
		}

		if (allElementsUsedOnes) {
			System.out.println("None of the elements in the array are used in a sequence longer than 1.");
		} else {
			System.out.println("The number " + maxValue + " appears " + (maxCount + 1) + " times in a sequence.");
		}
	}
}
