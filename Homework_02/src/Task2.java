package homework;

import java.util.Scanner;
/*
 Въведете 2 различни цели числа от конзолата. Запишете тяхната сума,
разлика, произведение, остатък от деление и целочислено деление в 
отделни променливи и разпечатайте тези резултати в конзолата. 
Опитайте същото с числа с плаваща запетая.
 */
public class Task2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter first number(integer): ");
		int a = sc.nextInt();
		System.out.println("Please enter second number(integer): ");
		int b = sc.nextInt();

		int abSum = a + b;
		int abSub = a - b;
		int abProd = a * b;
		int abDiv = a / b;
		int abMod = a % b;

		System.out.println("Sum of a and b: " + abSum);
		System.out.println("Substraction of a and b: " + abSub);
		System.out.println("Production of a and b: " + abProd);
		System.out.println("Division of a and b: " + abDiv);
		System.out.println("Modular of a and b: " + abMod);
		System.out.println();
		System.out.println("Please enter first number(double): ");
		double aDouble = sc.nextDouble();
		System.out.println("Please enter second number(double): ");
		double bDouble = sc.nextDouble();

		double abSumDouble = aDouble + bDouble;
		double abSubDouble = aDouble - bDouble;
		double abProdDouble = aDouble * bDouble;
		double abDivDouble = aDouble / bDouble;
		double abModDouble = aDouble % bDouble;

		System.out.println("Sum of aDouble and bDouble: " + abSumDouble);
		System.out.println("Substraction of aDouble and bDouble: " + abSubDouble);
		System.out.println("Production of aDouble and bDouble: " + abProdDouble);
		System.out.println("Division of aDouble and bDouble: " + abDivDouble);
		System.out.println("Modular of aDouble and bDouble: " + abModDouble);

		sc.close();
	}

}
