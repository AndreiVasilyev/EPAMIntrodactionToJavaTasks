package by.epamLearning.algorithmization.decomposition;

public class Task8 {

	public static void main(String[] args) {
		int[] d = { 4, 2, 5, 7, 3, 5, 3, 1, 4, 6 };
		System.out.println("D[1]+D[2]+D[3]=" + getSum(d, 1));
		System.out.println("D[3]+D[4]+D[5]=" + getSum(d, 3));
		System.out.println("D[4]+D[5]+D[6]=" + getSum(d, 4));
	}

	private static int getSum(int[] array, int startIndex) {
		int sum = 0;
		for (int i = startIndex; i < array.length && i < startIndex + 3; i++) {
			sum += array[i];
		}
		return sum;
	}
}
