package by.epamLearning.algorithmization.multiDimArrays;

import java.util.Random;

import by.epamLearning.utils.Print;

public class Task15 {

	public static void main(String[] args) {
		Random rnd = new Random();
		int length = 7;
		int width = 8;
		int[][] array = new int[length][width];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				array[i][j] = rnd.nextInt(11);
				System.out.printf("%-3s", array[i][j]);
			}
			System.out.println();
		}
		task12(array);
	}

	public static void task12(int[][] array) {
		int maxElement = Integer.MIN_VALUE;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (array[i][j] > maxElement)
					maxElement = array[i][j];
			}
		}
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (array[i][j] % 2 != 0)
					array[i][j] = maxElement;
			}
		}
		System.out.println("\nMax value=" + maxElement + "\n");
		Print.printMatrix(array);
	}
}
