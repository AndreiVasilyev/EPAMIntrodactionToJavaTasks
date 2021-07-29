package by.epamLearning.algorithmization.multiDimArrays;

import java.util.Arrays;
import java.util.Random;

import by.epamLearning.utils.Print;

public class Task12 {

	public static void main(String[] args) {
		Random rnd = new Random();
		int length = 7;
		int width = 7;
		int[][] array = new int[length][width];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				array[i][j] = rnd.nextInt(11);
				System.out.printf("%4s", array[i][j]);
			}
			System.out.println();
		}
		task12(array);
	}

	public static void task12(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			Arrays.sort(array[i]);
		}
		Print.printMatrix(array);
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length / 2; j++) {
				int tempValue = array[i][j];
				array[i][j] = array[i][array[i].length - 1 - j];
				array[i][array[i].length - 1 - j] = tempValue;
			}
		}
		Print.printMatrix(array);
	}
}
