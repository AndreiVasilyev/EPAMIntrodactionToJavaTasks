package by.epamLearning.algorithmization.decomposition;

public class Task15 {

	public static void main(String[] args) {
		showIncreaseNumbers(3);
	}

	private static void showIncreaseNumbers(int digitsQuantity) {
		int[] digits = createArray(digitsQuantity);
		System.out.println(arrayToNumber(digits));
		while (isIncreaseNumber(digits)) {
			System.out.println(arrayToNumber(digits));
		}
	}

	private static long arrayToNumber(int[] digits) {
		long result = 0;
		for (int i = 0; i < digits.length; i++) {
			result += digits[i] * Math.pow(10, digits.length - i - 1);
		}
		return result;
	}

	private static boolean isIncreaseNumber(int[] digits) {
		int size = digits.length;
		for (int i = size - 1; i >= 0; --i) {
			if (digits[i] < 9 - size + i + 1) {
				++digits[i];
				for (int j = i + 1; j < size; ++j) {
					digits[j] = digits[j - 1] + 1;
				}
				return true;
			}
		}
		return false;
	}

	private static int[] createArray(int arraySize) {
		int[] array = new int[arraySize];
		for (int i = 0; i < arraySize; i++) {
			array[i] = i + 1;
		}
		return array;
	}

}
