import java.util.Scanner;

public class Task_03 {
	/*
	 * Напишете програма, която за даден масив от символи arr и символ ch,
	 * въведен от потребителя, проверява али arr съдържа ch. Ако се съдържа,
	 * отпечатайте индекса на елемента. Ако не, отпечатайте подходящо избрана от
	 * вас стойност.
	 */
	public static void main(String[] args) {

		char[] c = { 's', 'a', 'b', 'c', 'd', 'p' };
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the char: ");
		char ch = sc.next().charAt(0);
		boolean containsChar = false;
		int index = -1;
		for (int i = 0; i < c.length; i++) {
			if (c[i] == ch) {
				containsChar = true;
				index = i;
				break;
			}
		}
		System.out.println(containsChar ? "The array contains the char " + ch + " at index " + (index+1)
				: "The array doesn't contain the char " + ch);
		sc.close();
	}

}
