package by.epamLearning.algorithmization.multiDimArrays;

import java.util.Random;

public class Task3 {

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
		int n = 1, k = 4;
		task3(array, n, k);
	}

	public static void task3(int[][] array, int lineNumber, int columnNumber) {
		System.out.print("\nline " + lineNumber + ": ");
		for (int i = 0; i < array[lineNumber].length; i++) {
			System.out.print(array[lineNumber][i] + " ");
		}
		System.out.print("\ncoulumn " + columnNumber + ": ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i][columnNumber] + " ");
		}
	}
}
