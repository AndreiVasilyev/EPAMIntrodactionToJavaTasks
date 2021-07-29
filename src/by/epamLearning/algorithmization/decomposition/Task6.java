package by.epamLearning.algorithmization.decomposition;

public class Task6 {

	public static void main(String[] args) {
		System.out.println("Is coprime numbers = " + isCoprimeNumbers(5, 7, 9));
		System.out.println("Is coprime numbers = " + isCoprimeNumbers(2, 4, 6));
	}

	private static boolean isCoprimeNumbers(int a, int b, int c) {
		if (getGreatestCommonDivisor(a, b) == 1 && getGreatestCommonDivisor(b, c) == 1)
			return true;
		return false;
	}

	private static int getGreatestCommonDivisor(int a, int b) {
		return b == 0 ? a : getGreatestCommonDivisor(b, a % b);
	}
}
