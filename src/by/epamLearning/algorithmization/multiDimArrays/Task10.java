package by.epamLearning.algorithmization.multiDimArrays;

import java.util.Random;

public class Task10 {

	public static void main(String[] args) {
		Random rnd = new Random();
		int n = 6;
		int[][] array = new int[n][n];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				array[i][j] = rnd.nextInt(12) - 10;
				System.out.printf("%4s", array[i][j]);
			}
			System.out.println();
		}
		task10(array);
	}

	public static void task10(int[][] array) {
		System.out.print("\nPositive elements of main diagonal: ");
		for (int i = 0; i < array.length; i++) {
			if (array[i][i] >= 0)
				System.out.print(array[i][i] + " ");
		}
	}
}
