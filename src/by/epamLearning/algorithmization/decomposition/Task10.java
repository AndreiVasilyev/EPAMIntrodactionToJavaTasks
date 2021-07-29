package by.epamLearning.algorithmization.decomposition;

import java.util.Arrays;

public class Task10 {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(createArray(684533512)));
	}

	private static int[] createArray(long n) {
		int digitQuantity = calculateDigitQuantity(n);
		int[] array = new int[digitQuantity];
		for (int i = digitQuantity - 1; i >= 0; i--) {
			array[i] = (int) (n / (int) Math.pow(10, digitQuantity - 1 - i) % 10);
		}
		return array;
	}

	private static int calculateDigitQuantity(long n) {
		int counter = (n == 0 ? 1 : 0);
		while (n != 0) {
			n /= 10;
			counter++;
		}
		return counter;
	}
}
