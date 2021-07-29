package by.epamLearning.algorithmization.decomposition;

public class Task9 {

	public static void main(String[] args) {
		System.out.println("(x=2,y=3,z=4,t=5) perimeter = " + square(5, 5, 5, 5));
		System.out.println("(x=3,y=4,z=12,t=13) perimeter = " + square(3, 4, 12, 13));
	}

	private static double square(int x, int y, int z, int t) {
		double d = diagonal(x, y);
		double p = semiPerimeter(d, z, t);
		return Math.sqrt((p - z) * (p - t) * (p - d) * p) + x * y / 2;
	}

	private static double semiPerimeter(double a, double b, double c) {
		return (a + b + c) / 2;
	}

	private static double diagonal(int x, int y) {
		return Math.sqrt(x * x + y * y);
	}

}
