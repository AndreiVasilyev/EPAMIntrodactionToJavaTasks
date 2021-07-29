package by.epamLearning.basics.branching;

public class Task5 {

	public static void main(String[] args) {
		System.out.println("x=2 f(x)=" + f(2));
		System.out.println("x=4 f(x)=" + f(4));
	}

	private static double f(int x) {
		if (x <= 3) {
			return x * x - 3 * x + 9;
		} else
			return (double) 1 / (x * x * x + 6);
	}
}
