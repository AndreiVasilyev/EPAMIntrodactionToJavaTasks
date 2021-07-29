package by.epamLearning.algorithmization.decomposition;

public class Task2 {

	public static void main(String[] args) {
		System.out.println("GCD (8, 16, 32, 80):" + getGreatestCommonDivisor(8, 16, 32, 80));

	}

	public static int getGreatestCommonDivisor(int a, int b) {
		return b == 0 ? a : getGreatestCommonDivisor(b, a % b);
	}

	public static int getGreatestCommonDivisor(int a, int b, int c, int d) {
		return getGreatestCommonDivisor(getGreatestCommonDivisor(a, b), getGreatestCommonDivisor(c, d));
	}
}
