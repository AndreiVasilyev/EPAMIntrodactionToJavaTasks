package by.epamLearning.algorithmization.decomposition;

public class Task7 {

	public static void main(String[] args) {
		System.out.println(calculateSum());
	}

	private static int calculateSum() {
		int sum = 0;
		for (int i = 1; i <= 9; i += 2) {
			sum += factorial(i);
		}
		return sum;
	}

	private static int factorial(int a) {
		return a == 0 ? 1 : a * factorial(a - 1);
	}

}
