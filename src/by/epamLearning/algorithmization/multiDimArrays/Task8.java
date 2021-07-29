package by.epamLearning.algorithmization.multiDimArrays;

import java.util.Random;
import java.util.Scanner;

import by.epamLearning.utils.Print;

public class Task8 {

	public static void main(String[] args) {
		Random rnd = new Random();
		int length = 6;
		int width = 7;
		int[][] array = new int[length][width];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				array[i][j] = rnd.nextInt(11);
				System.out.printf("%4s", array[i][j]);
			}
			System.out.println();
		}
		task8(array);
	}

	public static void task8(int[][] array) {
		Scanner scan = new Scanner(System.in);
		System.out.println("\nEnter first column:");
		int firstColumn = scan.nextInt();
		System.out.println("\nEnter second column:");
		int secondColumn = scan.nextInt();
		if (firstColumn <= array[0].length && secondColumn <= array[0].length) {
			int tempValue;
			for (int i = 0; i < array.length; i++) {
				tempValue = array[i][firstColumn - 1];
				array[i][firstColumn - 1] = array[i][secondColumn - 1];
				array[i][secondColumn - 1] = tempValue;
			}
			Print.printMatrix(array);
		}
		scan.close();
	}
}
