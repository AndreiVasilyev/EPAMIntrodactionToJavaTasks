package by.epamLearning.algorithmization.arrays;

import java.util.Arrays;
import java.util.Random;

public class Task2 {

	public static void main(String[] args) {
		Random rnd = new Random();
		int n = 10;
		double[] a = new double[n];
		for (int i = 0; i < a.length; i++) {
			a[i] = rnd.nextDouble();
		}
		System.out.println(Arrays.toString(a));
		double z = rnd.nextDouble();
		System.out.println("Z=" + z);
		int replaceCounter = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > z) {
				a[i] = z;
				replaceCounter++;
			}
		}
		System.out.println(Arrays.toString(a));
		System.out.println("replacements: " + replaceCounter);

	}
}
