package by.epamLearning.algorithmization.sorting;

import java.util.Arrays;

public class Task4 {

	public static void main(String[] args) {
		int[] array = { 2, 3, 3, 5, 7, 8, 9, 12, 14, 22, 45, 65 };
		task4(array);
	}

	private static void task4(int[] array) {
		System.out.println(Arrays.toString(array));
		int counter = 0;
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = 0; j < array.length - 1 - i; j++) {
				if (array[j] < array[j + 1]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
					counter++;
				}

			}
		}
		System.out.println(Arrays.toString(array));
		System.out.println("Count of permutation:" + counter);
	}

}
