package by.epamLearning.algorithmization.decomposition;

public class Task4 {

	public static void main(String[] args) {
		int[][] dots = { { 2, 3 }, { 0, 5 }, { 0, 3 }, { 4, 2 }, { 1, 1 }, { 1, 0 }, { 4, 2 } };
		longestDistance(dots);
	}

	private static void longestDistance(int[][] dots) {
		double maxDistance = Double.MIN_VALUE;
		int sourceIndex = 0;
		int distanationIndex = 0;
		double currentDistance;
		for (int i = 0; i < dots.length - 1; i++) {
			for (int j = i + 1; j < dots.length; j++) {
				currentDistance = lengthBetweenDots(dots[i], dots[j]);
				if (currentDistance > maxDistance) {
					maxDistance = currentDistance;
					sourceIndex = i;
					distanationIndex = j;
				}
			}
		}
		System.out.printf("Longest distance = %5.5s\n", maxDistance);
		System.out.println("between (" + dots[sourceIndex][0] + "," + dots[sourceIndex][1] + ") and ("
				+ dots[distanationIndex][0] + "," + dots[distanationIndex][1] + ")");
	}

	private static double lengthBetweenDots(int[] a, int[] b) {
		return Math.sqrt(squaredDifference(a[0], b[0]) + squaredDifference(a[1], b[1]));
	}

	private static int squaredDifference(int x1, int x2) {
		return (x2 - x1) * (x2 - x1);
	}

}
