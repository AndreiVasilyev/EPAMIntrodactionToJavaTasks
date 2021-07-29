package by.epamLearning.algorithmization.multiDimArrays;

import java.util.Random;

public class Task11 {

	public static void main(String[] args) {
		task10();
	}

	public static void task10() {
		Random rnd = new Random();
		int[][] array = new int[10][20];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				array[i][j] = rnd.nextInt(16);
				System.out.printf("%3s", array[i][j]);
			}
			System.out.println();
		}
		System.out.print("\nLines numbers: ");
		for (int i = 0; i < array.length; i++) {
			int counter = 0;
			for (int j = 0; j < array[i].length; j++) {
				if (array[i][j] == 5)
					counter++;
			}
			if (counter >= 3)
				System.out.print((i + 1) + " ");
		}
	}
}
