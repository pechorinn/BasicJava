package lesson_08;

import java.util.Scanner;

/*
 * Да се състави програма, чрез която се въвеждат 2 редици от знаци 
(думи).
Ако в двете редици участва един и същи знак, да се изведе на екрана 
първата редица хоризонтално, а втората вертикално, така че да се 
пресичат в общия си знак.
Ако редиците нямат общ знак да се изведе само уведомително 
съобщение.
Пример :
м
а
шапка
и
н
а
 */
public class Task_05 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter first word: ");
		String str1 = sc.next();
		System.out.println("Please enter second word: ");
		String str2 = sc.next();
		sc.close();
		printResult(str1, str2);

	}

	static void printResult(String str1, String str2) {
	
		int commonCharPositionStr1 = 0;
		int commonCharPositionStr2 = 0;
		boolean haveCommonChar = false;
		for (int i = 0; i < str1.length(); i++) {
			if (str2.contains("" + str1.charAt(i))) {
				commonCharPositionStr1 = i;
				commonCharPositionStr2 = str2.indexOf(str1.charAt(i));
				haveCommonChar = true;
				break;
			}
		}

		if (!haveCommonChar) {
			System.out.println("The words provided have no common charachters.");
		} else {

			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < str2.length(); i++) {
				if (i == commonCharPositionStr2) {
					sb.append(str1 + "\n");
				} else {
					sb.append(new String(new char[commonCharPositionStr1]) + str2.charAt(i) + "\n");
				}
			}

			System.out.println(sb);
		}
	}
}
