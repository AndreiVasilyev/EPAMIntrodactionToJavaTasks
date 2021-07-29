package by.epamLearning.algorithmization.multiDimArrays;

import java.util.Random;

import by.epamLearning.utils.Print;

public class Task14 {

	public static void main(String[] args) {
		int m = 8;
		int n = 8;
		task14(m, n);
	}

	public static void task14(int m, int n) {
		Random rnd = new Random();
		int[][] array = new int[m][n];
		for (int i = 0; i < array[0].length; i++) {
			for (int j = 0; j <= i; j++) {
				if(j<m) {
					while(true) {
						int index=rnd.nextInt(m);
						if(array[index][i]==0) {
							array[index][i] = 1;
							break;
						}
							
					}
				
				}
			}

		}
		Print.printMatrix(array);
	}
}
