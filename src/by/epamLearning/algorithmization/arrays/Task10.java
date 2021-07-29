package by.epamLearning.algorithmization.arrays;

import java.util.Arrays;
import java.util.Random;

public class Task10 {

	public static void main(String[] args) {
		Random rnd = new Random();
		int n = 20;
		int[] array = new int[n];
		for (int i = 0; i < array.length; i++)
			array[i] = rnd.nextInt(11);
		task10(array);
	}

	public static void task10(int[] array) {
		System.out.println(Arrays.toString(array));
		for (int i = 1; i < array.length; i++) {
			if (i * 2 < array.length - 1)
				array[i] = array[i * 2];
			else
				array[i] = 0;
		}
		System.out.println(Arrays.toString(array));
	}

}
