package recursionpractise;

/*
Въведете число от клавиатурата и определете дали е
просто. Просто число е това което се дели САМО на 1 и на себе 
си.
 */
public class Task_10 {

	public static void main(String[] args) {

		int n = 5;
		System.out.print("The number " + n + " is a prime - ");
		System.out.print(isTheNumberPrime(n, 2));
	}

	static boolean isTheNumberPrime(int n, int temp) {

		if (n - 1 == temp) {
			if (n % temp == 0) {
				return false;
			} else {
				return true;
			}
		}
		if (n % temp == 0) {
			return false;
		}
		
		return isTheNumberPrime(n, temp + 1);
	}
}
