package by.epamLearning.algorithmization.arrays;

import java.util.Random;

public class Task1 {

	public static void main(String[] args) {
		Random rnd = new Random();
		int n = 10;
		int[] a = new int[n];
		for (int i = 0; i < a.length; i++)
			a[i] = rnd.nextInt(100) + 1;
		int k = 2;
		int sum = 0;
		for (int i : a) {
			if (i % k == 0)
				sum += i;
		}
		System.out.println("\n" + sum);

	}

}
