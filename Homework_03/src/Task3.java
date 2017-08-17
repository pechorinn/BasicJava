package homework3;
//ƒа се изведат на екрана всички нечетни числа от -10 до 10

public class Task3 {

	public static void main(String[] args) {

		for (int i = -10; i <= 10; i++) {

			if (i % 2 != 0) {
				System.out.print(i + " ");
			}
		}
	}
}
