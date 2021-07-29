package by.epamLearning.algorithmization.arrays;

import java.util.Arrays;

public class Task6 {

	public static void main(String[] args) {

		int n = 1;
		double[] array = new double[n];
		double sum = 0;
		for (int i = 0; i < array.length; i++) {
			array[i] = Math.random();
			if (isSimple(i))
				sum += array[i];
		}

		System.out.println(Arrays.toString(array));
		System.out.println("sum=" + sum);
	}

	private static boolean isSimple(int value) {
		if (value > 2) {
			for (int i = 2; i < value; i++) {
				if (value % i == 0)
					return false;
			}
			System.out.println("value=" + value + " true");
			return true;
		}
		return false;
	}
}
