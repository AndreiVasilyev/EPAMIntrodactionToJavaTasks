package by.epamLearning.algorithmization.decomposition;

public class Task11 {

	public static void main(String[] args) {
		System.out.println("(2345 vs 73567) longer=" + getLonger(2345, 73567));
		System.out.println("(55 vs 55) longer=" + getLonger(55, 55));
		System.out.println("(2456356 vs 56786) longer=" + getLonger(2456356, 56786));
	}

	private static long getLonger(long a, long b) {
		return calculateDigitQuantity(a) >= calculateDigitQuantity(b) ? a : b;
	}

	private static int calculateDigitQuantity(long n) {
		int counter = (n == 0 ? 1 : 0);
		while (n != 0) {
			n /= 10;
			counter++;
		}
		return counter;
	}

}
