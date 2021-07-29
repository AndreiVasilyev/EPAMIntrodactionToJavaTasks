package by.epamLearning.algorithmization.sorting;

import java.util.Arrays;

public class Task7 {

	public static void main(String[] args) {
		double[] arrayA = { 2.4, 5, 8.01, 4, 3.73, 5, 8.34, 6 };
		double[] arrayB = { 1, 4, 7.56, 2, 5.76, 8.98, 3.76, 4, 1, 5, 6.56 };
		task7(arrayA, arrayB);
	}

	private static void task7(double[] arrayA, double[] arrayB) {
		System.out.println(Arrays.toString(arrayA));
		for (int i = 0; i < arrayB.length; i++) {
			int index = findIndex(arrayA, arrayB[i]);
			System.out.println("b[" + i + "]=" + arrayB[i] + " in position " + index);
		}
	}

	private static int findIndex(double[] array, double value) {
		int l = -1;
		int r = array.length - 1;
		while (l < r - 1) {
			int m = l + (r - l) / 2;
			if (array[m] < value)
				l = m;
			else
				r = m;
		}
		return r;
	}
}
