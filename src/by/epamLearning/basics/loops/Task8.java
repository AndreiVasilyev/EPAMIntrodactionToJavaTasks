package by.epamLearning.basics.loops;

public class Task8 {

	public static void main(String[] args) {
		int firstNumber = 45612;
		int secondNumber = 84651;
		while (firstNumber > 0) {
			int digit = firstNumber % 10;
			int number = secondNumber;
			while (number > 0) {
				if (digit == number % 10)
					System.out.println(digit);
				number /= 10;
			}
			firstNumber /= 10;
		}

	}

}
