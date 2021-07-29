package by.epamLearning.algorithmization.arrays;

import java.util.Arrays;

public class Task4 {

	public static void main(String[] args) {

		double[] array = { 0.5, 5.8, 6.1, 0.9, 8.4, 3.6, 7.5, 2.5, 0, 3.1, -5.8, -8.7, -4.6 };
		System.out.println(Arrays.toString(array));
		double maxValue = Double.MIN_VALUE;
		int maxValueIndex = 0;
		double minValue = Double.MAX_VALUE;
		int minValueIndex = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] < minValue) {
				minValue = array[i];
				minValueIndex = i;
			}
			if (array[i] > maxValue) {
				maxValue = array[i];
				maxValueIndex = i;
			}
		}
		array[minValueIndex] = maxValue;
		array[maxValueIndex] = minValue;
		System.out.println("min value = " + minValue + " in position[" + minValueIndex + "]");
		System.out.println("max value = " + maxValue + " in position[" + maxValueIndex + "]");
		System.out.println(Arrays.toString(array));
	}
}
