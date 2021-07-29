package by.epamLearning.algorithmization.arrays;

import java.util.Arrays;
import java.util.Random;

public class Task9 {

	public static void main(String[] args) {
		Random rnd = new Random();
		int n = 20;
		int[] array = new int[n];
		for (int i = 0; i < array.length; i++)
			array[i] = rnd.nextInt(11);
		task9(array);
	}

	public static void task9(int[] array) {

		int[] counterArray = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			int elementCounter = 1;
			for (int j = 0; j < array.length; j++) {
				if (i != j) {
					if (array[i] == array[j]) {
						if (i < j) {
							counterArray[i] = counterArray[j];
							break;
						} else
							elementCounter++;
					}
				}
			}
			counterArray[i] = elementCounter;
		}
		int maxValue = Integer.MIN_VALUE;
		int maxValueQuantity = 0;
		for (int i = 0; i < counterArray.length; i++) {
			if (counterArray[i] > maxValue) {
				maxValue = counterArray[i];
				maxValueQuantity = 1;
			} else if (counterArray[i] == maxValue)
				maxValueQuantity++;
		}
		int mostCommonNumber = 0;

		int minValue = Integer.MAX_VALUE;
		for (int i = 0; i < array.length; i++) {
			if (counterArray[i] == maxValue && array[i] < minValue) {
				minValue = array[i];
				if (maxValueQuantity == 1)
					break;
			}
		}
		mostCommonNumber = minValue;
		System.out.println(Arrays.toString(array));
		System.out.println(Arrays.toString(counterArray));
		System.out.println("Most common number: " + mostCommonNumber);

	}
}
