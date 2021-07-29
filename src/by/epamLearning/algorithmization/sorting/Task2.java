package by.epamLearning.algorithmization.sorting;

import java.util.Arrays;

public class Task2 {

	public static void main(String[] args) {
		int[] firstArray = { 2, 3, 3, 5, 7, 8, 9, 12, 14, 22, 45, 65 };
		int[] secondArray = { 4, 7, 8, 9, 10, 20, 30, 44, 53, 63 };
		task2(firstArray, secondArray);
	}

	private static void task2(int[] firstArray, int[] secondArray) {
		int[] resultArray = new int[firstArray.length + secondArray.length];
		for (int i = 0, firstCounter = 0, secondCounter = 0; i < resultArray.length; i++) {
			if (firstCounter < firstArray.length && secondCounter < secondArray.length
					&& firstArray[firstCounter] < secondArray[secondCounter] || secondCounter == secondArray.length) {
				{
					resultArray[i] = firstArray[firstCounter++];
				}
			} else {
				resultArray[i] = secondArray[secondCounter++];
			}
		}
		System.out.println(Arrays.toString(resultArray));
	}
}
