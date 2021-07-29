package by.epamLearning.algorithmization.multiDimArrays;

import java.util.Arrays;
import java.util.Random;

import by.epamLearning.utils.Print;

public class Task13 {

	public static void main(String[] args) {
		Random rnd = new Random();
		int length = 5;
		int width = 7;
		int[][] array = new int[length][width];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				array[i][j] = rnd.nextInt(11);
				System.out.printf("%4s", array[i][j]);
			}
			System.out.println();
		}
		task13(array);
	}

	public static void task13(int[][] array) {
		for (int i = 0; i < array[0].length; i++) {
			int[] columnArray = new int[array.length];
			for (int j = 0; j < array.length; j++) {
				columnArray[j] = array[j][i];
			}
			Arrays.sort(columnArray);
			for (int j = 0; j < array.length; j++) {
				array[j][i] = columnArray[j];
			}
		}
		Print.printMatrix(array);
		for (int i = 0; i < array[0].length; i++) {
			for (int j = 0; j < array.length / 2; j++) {
				int tempValue = array[j][i];
				array[j][i] = array[array.length - 1 - j][i];
				array[array.length - 1 - j][i] = tempValue;
			}
		}		
		Print.printMatrix(array);
	}
}
