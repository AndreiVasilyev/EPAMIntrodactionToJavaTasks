package by.epamLearning.basics.linePrograms;

public class Task2 {

	public static void main(String[] args) {
		double value = calculate(1, 2, 3);
		System.out.println(value);

	}

	private static double calculate(double a, double b, double c) {
		double result = Math.sqrt(Math.pow(b, 2) + 4 * a * c) + b;
		result /= 2 * a;
		result -= Math.pow(a, 3) * c;
		result += Math.pow(b, -2);
		return result;
	}

}
