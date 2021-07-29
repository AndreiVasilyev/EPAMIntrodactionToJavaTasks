package by.epamLearning.algorithmization.decomposition;

import java.util.Arrays;

public class Task13 {

	public static void main(String[] args) {
		printTwinPrimeNumbers(50);
	}

	private static void printTwinPrimeNumbers(int n) {
		if (n > 2) {
			int[] array = getFilledArray(n);
			int[] primeNumbers = getPrimeNumbersArray(array, n);
			System.out.println("Range [" + n + "," + n * 2 + "]");
			for (int i = 0; i < primeNumbers.length - 1; i++) {
				if (primeNumbers[i] + 2 == primeNumbers[i + 1]) {
					System.out.println("twin numbers : " + primeNumbers[i] + " and " + primeNumbers[i + 1]);
				}
			}
		}
	}

	private static int[] getPrimeNumbersArray(int[] array, int n) {
		int counter = array.length;
		int searchRange = (int) Math.sqrt(n * 2);
		for (int i = 0; i <= searchRange; i++) {
			if (array[i] != 0) {
				for (int j = i + array[i]; j < array.length; j += array[i]) {
					if (array[j] != 0) {
						array[j] = 0;
						counter--;
					}
				}
			}
		}
		return filterPrimeNumbersArray(array, counter, n);
	}

	private static int[] filterPrimeNumbersArray(int[] array, int size, int n) {
		int[] tempArray = new int[size];
		int counter = 0;
		for (int element : array) {
			if (element != 0 && element >= n)
				tempArray[counter++] = element;
		}
		return Arrays.copyOf(tempArray, counter);
	}

	private static int[] getFilledArray(int n) {
		int[] array = new int[2 * n - 1];
		for (int i = 0; i < array.length; i++) {
			array[i] = i + 2;
		}
		return array;
	}

}
