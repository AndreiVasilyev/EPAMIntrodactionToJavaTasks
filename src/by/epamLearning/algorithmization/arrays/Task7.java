package by.epamLearning.algorithmization.arrays;

import java.util.Arrays;

public class Task7 {

	public static void main(String[] args) {
		int n = 10;
		double[] array = new double[2 * n];
		for (int i = 0; i < array.length; i++) {
			array[i] = Math.random();
		}
		task7(array);
	}

	public static void task7(double[] array) {
		if (array.length % 2 == 0) {
			double maxValue = Double.MIN_VALUE;
			for (int i = 0; i < array.length / 2; i++) {
				int index = 2 * array.length / 2 - 1 - i;
				if ((array[i] + array[index]) > maxValue)
					maxValue = array[i] + array[index];
			}
			System.out.println(Arrays.toString(array));
			System.out.println("max=" + maxValue);
		} else {
			System.out.println("Incorrect array length!");
		}
	}
}
