package homework;

import java.util.Scanner;

public class Task12 {

	public static void main(String[] args) {
		boolean isDataValid = true;
		boolean isLeapingYear = false;
		Scanner sc = new Scanner(System.in);
		int day, month, year;
		do {
			System.out.println("Please enter valid day of the month: ");
			day = sc.nextInt();
			System.out.println("Please enter valid month: ");
			month = sc.nextInt();
			System.out.println("Please enter valid year: ");
			year = sc.nextInt();
		} while ((day < 0 || day > 31) || (month < 0 || month > 12) || (year < 0) || (!isDataValid));
		sc.close();
		
		if (year % 4 == 0) {
			isLeapingYear = true;
		}

		if (year % 100 == 0 && year % 400 != 0) {
			isLeapingYear = false;
		}

		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
			if (day < 31) {
				day++;
			} else {
				day = 1;
				month++;
			}
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			if (day < 30) {
				day++;
			} else if (day == 30) {
				day = 1;
				month++;
			} else if (day == 31) {
				System.out.println("This month " + month + " has 30 days.");
				isDataValid = false;
			}
			break;
		case 2:
			if (isLeapingYear) {
				if (day < 29) {
					day++;
				} else if (day == 29) {
					day = 1;
					month++;
				} else if (day > 29) {
					System.out.println("It's a leaping year therefor February has 29 days.");
					isDataValid = false;
				}
			} else {
				if (day < 28) {
					day++;
				} else if (day == 28) {
					day = 1;
					month++;
				} else if (day > 28) {
					System.out.println("It's not a leaping year therefor February has 28 days.");
					isDataValid = false;
				}
			}
			break;
		case 12:
			if (day < 31) {
				day++;
			} else if (day == 31) {
				day = 1;
				month = 1;
				year++;
			}
		}

		if (isDataValid) {
			System.out.println("The next day date is " + day + ", " + month + ", " + year);
		} else {
			System.out.println("The input is invalid!");
		}
	}
}
