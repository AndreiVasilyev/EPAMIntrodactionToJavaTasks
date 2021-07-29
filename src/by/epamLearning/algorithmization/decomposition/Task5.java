package by.epamLearning.algorithmization.decomposition;

public class Task5 {

	public static void main(String[] args) {
		int[] array = { 3, 5, 6, 7, 4, 6, 2, 9, 46, 45, 31, 2, 8, 24, 67 };
		showBeforeMaxElement(array);
	}

	private static void showBeforeMaxElement(int[] array) {
		int maxElementIndex = maxElementIndex(array);
		int maxElementValue = array[maxElementIndex];
		array[maxElementIndex] = Integer.MIN_VALUE;
		int beforeMaxElementIndex = maxElementIndex(array);
		array[maxElementIndex] = maxElementValue;
		System.out.println("Before max value = " + array[beforeMaxElementIndex]);

	}

	private static int maxElementIndex(int[] array) {
		int index = 0;
		int maxElement = array[index];
		for (int i = 1; i < array.length; i++) {
			if (array[i] > maxElement) {
				maxElement = array[i];
				index = i;
			}
		}
		return index;
	}
}
