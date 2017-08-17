package recursionpractise;

import java.util.Scanner;

/*
Да се състави програма, която извежда квадрат, чийто страни са 
оформени със знака *, а вътрешността е запълнена със въведен знак. 
Входни данни b - дължина на страната число от интервала 
[3..20], c - желан знак. 
Програмата да използва цикъл for. 
Пример: 4 + 
Изход:
****
*++*
*++*
****
 */
public class Task_17 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the length of the square: ");
		int side = sc.nextInt();
		System.out.println("Please enter the symbol the square will be filled with: ");
		char ch = sc.next().charAt(0);
		sc.close();
		if (side < 2) {
			System.out.println("Please enter adequate length. Please try again.");
		} else {
			String firstAndLastRows = new String(new char[side]).replace('\0', '*');
			String allTheRestRows = "*" + new String(new char[side - 2]).replace('\0', ch) + "*";
			int currentRow = side;
			printResult(side, currentRow, firstAndLastRows, allTheRestRows);
		}
	}

	static void printResult(int side, int currentRow, String firstAndLastRows, String allTheRestRows) {
		
		if(currentRow == 0) {
			return;
		}
		
		printResult (side, currentRow - 1, firstAndLastRows, allTheRestRows);
			
		if(side == currentRow || currentRow == 1) {
			System.out.println(firstAndLastRows);
		} else {
			System.out.println(allTheRestRows);
		}
	}
}
