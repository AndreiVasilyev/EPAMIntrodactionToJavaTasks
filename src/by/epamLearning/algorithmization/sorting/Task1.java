package by.epamLearning.algorithmization.sorting;

import java.util.Arrays;

public class Task1 {

	public static void main(String[] args) {
		int[] firstArray = { 3, 5, 4, 6, 6, 7, 3, 2 };
		int[] secondArray = { 4, 7, 8, 9, 0, 0, 0, 4, 3, 3, 6, 9, 2 };
		int k = 5;
		task1(firstArray, secondArray, k);
	}

	private static void task1(int[] firstArray, int[] secondArray, int k) {
		if (k + 1 < firstArray.length) {
			int[] resultArray = new int[firstArray.length + secondArray.length];

			for (int i = 0; i < resultArray.length; i++) {
				if (i < k) {
					resultArray[i] = firstArray[i];
				} else if (i >= k && i - k < secondArray.length) {
					resultArray[i] = secondArray[i - k];
				} else {
					resultArray[i] = firstArray[i - secondArray.length];
				}
			}
			System.out.println(Arrays.toString(resultArray));
		}
	}
}
