package by.epamLearning.algorithmization.multiDimArrays;

import by.epamLearning.utils.Print;

public class Task5 {

	public static void main(String[] args) {
		int n = 8;
		task5(n);
	}

	public static void task5(int dimention) {
		int[][] array = new int[dimention][dimention];
		for (int i = 0; i < dimention; i += 2) {
			for (int j = 0; j < dimention - i; j++) {
				array[i][j] = i + 1;
				if (j < dimention - 1 - i)
					array[i + 1][j] = i + 2;
			}
		}
		Print.printMatrix(array);
	}
}
