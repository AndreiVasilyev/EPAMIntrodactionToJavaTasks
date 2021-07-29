package by.epamLearning.utils.copy;

public class Print {

	public static void printMatrix(int[][] matrix) {
		System.out.println();
		for (int[] array : matrix) {
			for (int element : array) {
				System.out.printf("%4s", element);
			}
			System.out.println();
		}
		System.out.println();
	}
}
