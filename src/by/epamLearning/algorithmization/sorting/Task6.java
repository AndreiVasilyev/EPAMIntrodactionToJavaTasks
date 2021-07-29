package by.epamLearning.algorithmization.sorting;

import java.util.Arrays;

public class Task6 {

	public static void main(String[] args) {
		double[] array = { 2.3, 5.6, 8, 4, 3, 5, 8, 6, 1.4, 4.7, 7, 2, 5, 8, 3, 4, 1, 5, 6 };
		task6(array);
	}

	private static void task6(double[] array) {
		System.out.println(Arrays.toString(array));
		int counter = 0;
		while (counter < array.length - 1) {
			if (array[counter] > array[counter + 1]) {
				double temp = array[counter];
				array[counter] = array[counter + 1];
				array[counter + 1] = temp;
				if (counter > 0)
					counter--;
				continue;
			}
			counter++;
		}
		System.out.println("\n" + Arrays.toString(array));
	}
}
