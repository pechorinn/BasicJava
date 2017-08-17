package recursionpractise;

/*
Да се състави програма, чрез която се извежда квадрат от 
цифри. Сумите от елементите на произволен ред или стълб са 
равни на 45.
 */
public class Task_20 {

	public static void main(String[] args) {

		buildSqaureOfNumbers(9, 0, 0);

	}

	static void buildSqaureOfNumbers(int start, int end, int count) {

		if (end == 10 && start > 0) {
			end = 0;
			start -= 1;
		}
		if (end == 10 && start == 0) {
			return;
		}
		buildSqaureOfNumbers(start, end + 1, count+1);
		
		System.out.print((start + 10 - end) % 10 + " ");
		
		if (count % 10 == 0) {
			System.out.println();
		}
	}
}
