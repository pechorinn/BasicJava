package homework4;
/*
Да се състави програма, чрез която предварително въведени 10 
реални числа от интервала се обработват по следния начин: 
1. Извежда съществуващите числа.
2. Всички елементи със стойност по-малки от -0.231 се заменят със 
сумата от квадрата на поредния им номер + числото 41.25, а всички 
останали елементи се заменят с произведението между самия елемент 
и неговият пореден номер. Поредният номер на първият елемент е 1.
3. Да се изведат елементите от началния и новообразувания масив.
 */
public class Task16 {

	public static void main(String[] args) {

		float [] arr = {-1.12f, -2.43f, 3.1f, 4.2f, 0f, 6.4f, - 7.5f, 8.6f, 9.1f, -4f};
		System.out.println("The elements of original array: ");
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i] + " ");
		}
		System.out.println();		
		System.out.println("The elements of new array: ");
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] < -0.231) {
				arr[i] = (i+1)*(i+1) + 41.25f;
				System.out.print(arr[i] + " ");
			} else {
				arr[i] = (i+1)*arr[i];
				System.out.print(arr[i] + " ");
			}
		}
	}
}
