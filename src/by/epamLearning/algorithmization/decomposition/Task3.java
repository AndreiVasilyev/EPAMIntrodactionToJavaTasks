package by.epamLearning.algorithmization.decomposition;

public class Task3 {

	public static void main(String[] args) {
		System.out.println("Hexagon (side=3) square = " + hexagonSquare(3));
		System.out.println("Hexagon (side=10) square = " + hexagonSquare(10));
	}

	private static double hexagonSquare(int a) {
		return 6 * equilateralTriangleSquare(a);
	}

	private static double equilateralTriangleSquare(int a) {
		return a * a * Math.sqrt(3) / 4;
	}
}
