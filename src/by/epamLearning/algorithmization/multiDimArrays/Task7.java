package by.epamLearning.algorithmization.multiDimArrays;

public class Task7 {

	public static void main(String[] args) {
		int n = 3;
		task7(n);
	}

	public static void task7(int dimention) {
		double[][] array = new double[dimention][dimention];
		int counter = 0;
		for (int i = 0; i < dimention; i++) {
			for (int j = 0; j < dimention; j++) {
				array[i][j] = Math.sin((i * i - j * j) / dimention);
				if (array[i][j] >= 0)
					counter++;
			}
		}
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < dimention; j++) {
				System.out.printf("%-7.4s", array[i][j]);
			}
			System.out.println();
		}
		System.out.println("positive elements count: " + counter);
	}
}
