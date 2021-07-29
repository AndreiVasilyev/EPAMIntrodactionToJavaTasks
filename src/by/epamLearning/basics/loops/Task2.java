package by.epamLearning.basics.loops;

public class Task2 {

	public static void main(String[] args) {
		int a = 0;
		int b = 5;
		float h = 0.5f;
		for (float i = a; i <= b; i += h)
			System.out.println("x=" + i + "; y=" + y(i));

	}

	private static double y(double x) {
		if (x > 2)
			return x;
		else
			return -x;
	}
}
