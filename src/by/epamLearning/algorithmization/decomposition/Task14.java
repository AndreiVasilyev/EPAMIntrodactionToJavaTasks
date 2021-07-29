package by.epamLearning.algorithmization.decomposition;

public class Task14 {

	public static void main(String[] args) {
		showArmstrongNumbers(10000);
	}

	private static void showArmstrongNumbers(long range) {
		int digitsQuantity;
		int digitsSum;
		System.out.println("Armstrong numbers in range (1," + range + "):");
		for (int i = 1; i <= range; i++) {
			digitsQuantity = getDigitsQuantity(i);
			digitsSum = getDigitsSum(i);
			if (Math.pow(digitsSum, digitsQuantity) == i) {
				System.out.print(i + "  ");
			}
		}

	}

	private static int getDigitsSum(long number) {
		return (int) (number == 0 ? 0 : number % 10 + getDigitsSum(number / 10));
	}

	private static int getDigitsQuantity(long number) {
		int counter = 0;
		while (number != 0) {
			number /= 10;
			counter++;
		}
		return counter;
	}
}
