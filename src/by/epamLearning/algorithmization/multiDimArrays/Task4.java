package by.epamLearning.algorithmization.multiDimArrays;

import by.epamLearning.utils.Print;

public class Task4 {

	public static void main(String[] args) {
		int n = 8;
		task4(n);
	}

	public static void task4(int dimention) {
		int[][] array = new int[dimention][dimention];
		for (int i = 0; i < dimention; i += 2) {
			for (int j = 0; j < dimention; j++) {
				array[i][j] = j + 1;
				array[i + 1][j] = dimention - j;
			}
		}
		Print.printMatrix(array);
	}

}
