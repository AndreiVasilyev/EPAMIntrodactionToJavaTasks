package by.epamLearning.algorithmization.multiDimArrays;

import by.epamLearning.utils.Print;

public class Task6 {
	
	public static void main(String[] args) {
		int n = 10;
		task6(n);
	}

	public static void task6(int dimention) {
		int[][] array = new int[dimention][dimention];
		for (int i = 0; i < dimention/2; i++) {
			for (int j = i; j < dimention - i; j++) {
				array[i][j] = 1;
				array[dimention-1-i][j]=1;				
			}
		}
		Print.printMatrix(array);
	}

}
