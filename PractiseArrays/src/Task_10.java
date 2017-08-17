
public class Task_10 {
/*
 Напишете програма, която намира най-често срещания елемент
в масив. Пример: {4, 1, 1, 4, 2, 3,4, 4, 1, 2, 4, 9, 3} => 4 (5 times).
*/
	public static void main(String[] args) {

		int[] arr = {4, 1, 1,4, 2, 3,4,4, 1, 2,4, 9, 3};
		int maxCount = 0;
		int curCount = 0;
		int searchedElement = 0;
		boolean isAllAppearOnes = true;
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j <arr.length; j++) {
				if(arr[i] == arr[j]) {
					curCount++;
				}
			}

			if(curCount > maxCount) {
				maxCount = curCount;
				searchedElement = arr[i];
				isAllAppearOnes = false;
			}
			curCount = 0;
		}
		
		System.out.println(isAllAppearOnes? "All elements appear only ones.":"The element that appears more times than others is: " + searchedElement + ". It appears " + maxCount + " times.");
	}
}
