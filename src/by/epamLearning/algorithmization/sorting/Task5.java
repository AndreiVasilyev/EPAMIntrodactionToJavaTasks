package by.epamLearning.algorithmization.sorting;

import java.util.Arrays;

public class Task5 {

	public static void main(String[] args) {
		int[] array = { 2, 5, 8, 4, 3, 5, 8, 6, 1, 4, 7, 2, 5, 8, 3, 4, 1, 5, 6 };
		task5(array);
	}

	private static void task5(int[] array) {
		System.out.println(Arrays.toString(array));
		for (int i = 1; i < array.length; i++) {
			if (array[i] > array[i - 1])
				continue;
			int index = findIndex(array, i);
			int temp = array[i];
			for (int j = i; j > index; j--) {
				array[j] = array[j - 1];
			}
			array[index] = temp;
		}
		System.out.println("\n" + Arrays.toString(array));

	}

	private static int findIndex(int[] array, int valueIndex) {
		int key = array[valueIndex];
		int l = -1;
		int r = valueIndex - 1;
		while (l < r - 1) {
			int m = l + (r - l) / 2;
			if (array[m] < key)
				l = m;
			else
				r = m;
		}
		return r;
	}
}
