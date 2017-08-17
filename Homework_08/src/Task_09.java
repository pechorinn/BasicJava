package lesson_08;

/*
 Да се състави програма, чрез която по въведен низ съдържащ букви, 
цифри, знак минус '-' се извежда сборът на въведените числа като се 
отчита знакът '-' пред съответното число.
Вход: asd-12sdf45-56asdf100
Изход:
-12
45
-56
100
Сума = 77
 */
public class Task_09 {

	public static void main(String[] args) {

		String str = "asd-12sdf45-56asdf100";
		int sum = 0;
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) > 47 && str.charAt(i) < 58) {
				sb.append(str.charAt(i));
				if (sb.length() > 0 && i == str.length() - 1) {
					sum = calculateSum(sb, str, i, sum);
				}
			} else {
				if (sb.length() > 0)
				sum = calculateSum(sb, str, i, sum);
			}
		}
		System.out.println("The result of this calculation is: " + sum);
	}

	static int powerOfTen(int pow) {
		int result = 1;
		for (int i = 0; i < pow - 1; i++) {
			result *= 10;
		}
		return result;
	}

	static int calculateSum(StringBuilder sb, String str, int i, int sum) {

		boolean isNegative = false;
		
		if(i -1 - sb.length() >= 0 && str.charAt(i-sb.length()-1)== 45){
			isNegative = true;
		}
		
		int tempSum = 0;
		for (int j = 0; j < sb.length(); j++) {

			switch (sb.charAt(j)) {
			case '0':
				break;
			case '1':
				tempSum += 1 * powerOfTen(sb.length() - j);
				break;
			case '2':
				tempSum += 2 * powerOfTen(sb.length() - j);
				break;
			case '3':
				tempSum += 3 * powerOfTen(sb.length() - j);
				break;
			case '4':
				tempSum += 4 * powerOfTen(sb.length() - j);
				break;
			case '5':
				tempSum += 5 * powerOfTen(sb.length() - j);
				break;
			case '6':
				tempSum += 6 * powerOfTen(sb.length() - j);
				break;
			case '7':
				tempSum += 7 * powerOfTen(sb.length() - j);
				break;
			case '8':
				tempSum += 8 * powerOfTen(sb.length() - j);
				break;
			case '9':
				tempSum += 9 * powerOfTen(sb.length() - j);
				break;
			}
		}

		tempSum = isNegative ? tempSum * (-1) : tempSum;
		sum += tempSum;
		sb.setLength(0);
		return sum;
	}

}
