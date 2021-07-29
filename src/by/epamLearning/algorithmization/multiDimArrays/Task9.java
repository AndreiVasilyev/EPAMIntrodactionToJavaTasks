package by.epamLearning.algorithmization.multiDimArrays;

import java.util.Random;

public class Task9 {

	public static void main(String[] args) {
		Random rnd = new Random();
		int length = 6;
		int width = 7;
		int[][] array = new int[length][width];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				array[i][j] = rnd.nextInt(11);
				System.out.printf("%-3s", array[i][j]);
			}
			System.out.println();
		}
		task9(array);
	}

	public static void task9(int[][] array) {
		int maxSum = Integer.MIN_VALUE;
		int maxSumIndex = 0;
		for (int i = 0; i < array[0].length; i++) {
			int sum = 0;
			for (int j = 0; j < array.length; j++) {
				sum += array[j][i];
			}
			if (sum > maxSum) {
				maxSum = sum;
				maxSumIndex = i + 1;
			}
		}
		System.out.println("\n\nColumn with max summ: " + maxSumIndex);
	}
}
