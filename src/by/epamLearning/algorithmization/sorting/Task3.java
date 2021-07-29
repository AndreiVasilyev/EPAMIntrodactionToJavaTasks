package by.epamLearning.algorithmization.sorting;

import java.util.Arrays;

public class Task3 {

	public static void main(String[] args) {
		int[] array = { 2, 3, 3, 5, 7, 8, 9, 12, 14, 22, 45, 65 };
		task3(array);
	}

	private static void task3(int[] array) {
		System.out.println(Arrays.toString(array));
		for (int i = 0; i < array.length / 2; i++) {
			int temp = array[i];
			array[i] = array[array.length - 1 - i];
			array[array.length - 1 - i] = temp;
		}
		System.out.println(Arrays.toString(array));
	}

}
