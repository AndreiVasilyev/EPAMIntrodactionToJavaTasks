package by.epamLearning.basics.loops;

public class Task5 {

	public static void main(String[] args) {
		int n = 20;
		double e = 0.005;
		double sum = 0;
		for (int i = 0; i <= n; i++) {
			double a = 1 / Math.pow(2.0, i) + 1 / Math.pow(3.0, i);
			if (Math.abs(a) >= e)
				sum += a;
		}
		System.out.println("Sum=" + sum);
	}
}
