package by.epamLearning.algorithmization.multiDimArrays;

import java.util.Arrays;
import java.util.Random;

public class Task1 {

	public static void main(String[] args) {
		Random rnd = new Random();
		int n = 5;
		int[][] array = new int[n][n];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				array[i][j] = rnd.nextInt(11);
			}
		}
		task1(array);
	}

	public static void task1(int[][] array) {
		System.out.println(Arrays.deepToString(array));
		for (int i = 0; i < array[0].length; i += 2) {
			if (array[0][i] > array[array.length - 1][i]) {
				for (int j = 0; j < array.length; j++) {
					System.out.print(array[j][i]+" ");
				}
				System.out.println();
			}
		}
	}

}
