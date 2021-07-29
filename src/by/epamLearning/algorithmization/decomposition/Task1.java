package by.epamLearning.algorithmization.decomposition;

public class Task1 {

	public static void main(String[] args) {
		System.out.println("GCD (30,18):" + getGreatestCommonDivisor(18, 30));
		System.out.println("LCM (30,18):" + getLeastCommonMultiple(30, 18));
	}

	public static int getGreatestCommonDivisor(int a, int b) {
		return b == 0 ? a : getGreatestCommonDivisor(b, a % b);
	}

	public static int getLeastCommonMultiple(int a, int b) {
		return a * b / getGreatestCommonDivisor(a, b);
	}

}
