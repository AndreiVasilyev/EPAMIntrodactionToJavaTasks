package by.epamLearning.algorithmization.arrays;

import java.util.Arrays;

public class Task5 {

	public static void main(String[] args) {
		int[] array = { 1, 5, 8, 4, 2, 1, 5, 7, 9, 5, 3, 2, 5, 4 };
		System.out.println(Arrays.toString(array));
		for (int i = 0; i < array.length; i++) {
			if (array[i] < i)
				System.out.print(array[i] + " ");
		}

	}

}
