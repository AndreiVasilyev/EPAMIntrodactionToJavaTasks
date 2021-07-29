package by.epamLearning.algorithmization.decomposition;

public class Task17 {

	public static void main(String[] args) {
		long number = 653;
		System.out.println("Quantity of actions for " + number + ": " + getQuantityOfActions(number));

	}

	private static int getQuantityOfActions(long number) {
		int counter = 0;
		while (number > 0) {
			number -= digitsSum(number);
			counter++;
		}
		return counter;
	}

	private static int digitsSum(long number) {
		return (int) (number == 0 ? 0 : number % 10 + digitsSum(number / 10));
	}

}
