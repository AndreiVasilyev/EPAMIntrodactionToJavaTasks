package by.epamLearning.algorithmization.decomposition;

import java.util.Arrays;

public class Task16 {

	public static void main(String[] args) {
		calculateSumAndQuantity(3);
	}

	private static void calculateSumAndQuantity(int digitsQuantity) {
		long sum = 0;
		int[] digits = createArray(digitsQuantity);
		sum += arrayToNumber(digits);
		while (isOddDigit(digits)) {
			sum += arrayToNumber(digits);
		}
		System.out.println("Quantity of digits in number= " + digitsQuantity);
		System.out.println("Sum of numbers with odd digits =" + sum);
		System.out.println("Quantity of even digits in sum = " + getQuantityOfEvenDigits(sum));
	}

	private static int getQuantityOfEvenDigits(long sum) {
		int counter = 0;
		while (sum != 0) {
			if (sum % 10 % 2 == 0) {
				counter++;
			}
			sum /= 10;
		}
		return counter;
	}

	private static boolean isOddDigit(int[] digits) {
		int size = digits.length;
		for (int i = size - 1; i >= 0; i--) {
			if (digits[i] < 9) {
				digits[i] += 2;
				for (int j = i + 1; j < size; j++) {
					digits[j] = 1;
				}
				return true;
			}
		}
		return false;
	}

	private static long arrayToNumber(int[] digits) {
		long result = 0;
		for (int i = 0; i < digits.length; i++) {
			result += digits[i] * Math.pow(10, digits.length - i - 1);
		}
		return result;
	}

	private static int[] createArray(int arraySize) {
		int[] array = new int[arraySize];
		Arrays.fill(array, 1);
		return array;
	}

}
