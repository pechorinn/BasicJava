package homework3;
/*Да се състави програма, която извежда всички
естествени трицифрени числа, които нямат еднакви цифри т.е.
100,101, 606 и т.н. не се извеждат.*/
public class Task12 {

	public static void main(String[] args) {
	
			for (int i = 1; i <= 9; i++) {
				for (int j = 0; j <= 9; j++) {
					for(int y = 0; y <= 9; y++) {
						if(i != j && i != y && j != y) {
							System.out.print("" + i + j + y + " ");
					}
				}
			}
		}
	}
}