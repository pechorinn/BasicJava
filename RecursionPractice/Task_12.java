package recursionpractise;

/*
Да се състави програма, която извежда всички 
естествени трицифрени числа, които нямат еднакви цифри т.е. 
100,101,606 и т.н.
не се извеждат. 
 */
public class Task_12 {

	public static void main(String[] args) {

		int a = 1;
		int b = 0;
		int c = 0;
		int count = 0;
		System.out.println("\nCount: " + printPermutaion(a, b, c, count));
	}

	static int printPermutaion(int a, int b, int c, int count) {
		if (c == 10) {
			b++;
			c = 0;
		}
		if (b == 10) {
			a++;
			b = 0;
		}
		if (a == 9 && b == 8 && c == 7) {
			System.out.print("" + a + b + c + " ");
			return 1;
		}
		
		count = printPermutaion(a, b, c + 1, count);

		if (a != b && a != c && b != c) {
			System.out.print("" + a + b + c + " ");
			count++;
		}
		return count;
	}
}
