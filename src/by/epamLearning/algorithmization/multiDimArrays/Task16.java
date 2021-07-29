package by.epamLearning.algorithmization.multiDimArrays;

import java.util.Arrays;

import by.epamLearning.utils.Print;

public class Task16 {

	public static void main(String[] args) {
		task16(3);
		task16(5);
		task16(7);
		task16(9);
	}

	public static void task16(int n) {
		if (n > 2 && n % 2 != 0) {
			int m = 2 * n - 1;
			int[][] matrix = new int[m][m];			
			for (int i = 0; i < n; i++) {
				for (int j = i; j < n + i; j++) {
					matrix[j][n - 1 - 2 * i + j] = 1 + n * i + j - i;
				}
			}			
			int index;
			int shift = (m - n) / 2;
			for (int i = 0; i < shift; i++) {
				for (int j = m / 2 - i; j <= m / 2 + i; j += 2) {
					index = m - 1 - i;
					matrix[i + n][j] = matrix[i][j];
					matrix[index - n][j] = matrix[index][j];
					matrix[j][i + n] = matrix[j][i];
					matrix[j][index - n] = matrix[j][index];
				}
			}
			int[][] magicMatrix = new int[n][n];			
			for (int i = 0; i < n; i++) {
				magicMatrix[i] = Arrays.copyOfRange(matrix[i + shift], shift, shift + n);
			}
			Print.printMatrix(magicMatrix);
		}
	}
}
