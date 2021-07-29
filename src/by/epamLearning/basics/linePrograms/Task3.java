package by.epamLearning.basics.linePrograms;

public class Task3 {

	public static void main(String[] args) {
		double value = calculate(1, 2);
		System.out.println(value);

	}

	private static double calculate(double x, double y) {
		double result = Math.sin(x) + Math.cos(y);
		result /= Math.cos(x) - Math.sin(y);
		result *= Math.tan(x * y);
		return result;
	}

}
