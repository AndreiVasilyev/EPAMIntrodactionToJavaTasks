package by.epamLearning.algorithmization.arrays;

import java.util.Arrays;
import java.util.Random;

public class Task3 {

	public static void main(String[] args) {
		int n = 10;
		double[] array = new double[n];
		Random rnd = new Random();
		int positiveCounter = 0;
		int zeroCounter = 0;
		for (int i = 0; i < array.length; i++) {
			double value = rnd.nextDouble();
			array[i] = value > 0.5 ? value : value * -1;
			if (array[i] > 0)
				positiveCounter++;
			else if (array[i] == 0)
				zeroCounter++;
		}
		System.out.println(Arrays.toString(array));
		System.out.println("Psitive counter = " + positiveCounter);
		System.out.println("Zero counter = " + zeroCounter);
		System.out.println("Negative counter = " + (array.length - (positiveCounter + zeroCounter)));
	}
}
