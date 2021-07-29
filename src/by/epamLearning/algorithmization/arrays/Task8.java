package by.epamLearning.algorithmization.arrays;

import java.util.Arrays;

public class Task8 {

	public static void main(String[] args) {
		int[] array = { 3, 5, 7, 6, 9, 7, 6, 8, 9, 4, 3, 5, 6, 4, 3, 6, 8, 6, 5, 3, 7 };
		task8(array);
	}

	public static void task8(int[] array) {

		int minValue = Integer.MAX_VALUE;
		int minElementCounter = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] < minValue) {
				minValue = array[i];
				minElementCounter = 1;
			} else if (array[i] == minValue) {
				minElementCounter++;
			}
		}
		int[] newArray = new int[array.length - minElementCounter];
		for (int i = 0, j = 0; i < array.length; i++) {
			if (minElementCounter == -1)
				break;
			if (array[i] == minValue) {
				minElementCounter--;
				continue;
			}
			newArray[j++] = array[i];
		}
		System.out.println(Arrays.toString(array));
		System.out.println(Arrays.toString(newArray));

	}

}
