package by.epamLearning.algorithmization.decomposition;

import java.util.Arrays;

public class Task12 {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(getArray(100, 15)));
	}

	private static int[] getArray(int n, int k) {
		int[] currentArray = new int[n + 1];
		int arrayCounter = 0;
		for (int i = 0; i <= n; i++) {
			if (getDigitsSum(i) == k)
				currentArray[arrayCounter++] = i;
		}
		int[] resultArray = new int[arrayCounter + 1];
		resultArray = Arrays.copyOf(currentArray, arrayCounter);
		return resultArray;
	}

	private static int getDigitsSum(int n) {
		return n / 10 == 0 ? n % 10 : n % 10 + getDigitsSum(n / 10);
	}
}
