package by.epamLearning.algorithmization.multiDimArrays;


import java.util.Random;

public class Task2 {

	public static void main(String[] args) {
		Random rnd = new Random();
		int n = 6;
		int[][] array = new int[n][n];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				array[i][j] = rnd.nextInt(11);
				System.out.printf("%-3s",array[i][j]);
			}
			System.out.println();
		}
		task2(array);
	}

	public static void task2(int[][] array) {	
		System.out.println();
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i][i] + " ");
		}
	}

}
