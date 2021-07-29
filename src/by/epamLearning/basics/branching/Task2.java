package by.epamLearning.basics.branching;

public class Task2 {

	public static void main(String[] args) {
		System.out.println("result=" + getResult(2, 5, 1, 6));
		System.out.println("result=" + getResult(2, 2, 6, 6));
	}

	private static int getResult(int a, int b, int c, int d) {
		if (a <= b && c < d) {
			if (a > c)
				return a;
			else
				return c;
		} else if (a <= b && c > d) {
			if (a > d)
				return a;
			else
				return d;
		} else if (a > b && c >= d) {
			if (b > d)
				return b;
			else
				return d;
		} else {
			if (b > c)
				return b;
			else
				return c;
		}
	}

}
