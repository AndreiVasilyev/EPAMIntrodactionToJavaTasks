package by.epamLearning.strings.stringsAsCharsArray;

public class Task4 {

	public static void main(String[] args) {
		String stringValue = "In this string exist 3 numbers. This are 5781 and 95 and result";
		System.out.println(stringValue);
		System.out.println("Quantity of numbers in string: " + calculateQuantityOfNumbers(stringValue));

	}

	private static int calculateQuantityOfNumbers(String stringValue) {
		int counter = 0;
		boolean numberFlag = false;
		for (int i = 0; i < stringValue.length(); i++) {
			char currentSymbol = stringValue.charAt(i);
			if (isDigit(currentSymbol)) {
				numberFlag = true;
			} else if (numberFlag) {
				numberFlag = false;
				counter++;
			}
		}
		return counter;
	}

	private static boolean isDigit(char symbol) {
		return (symbol == 0 || (symbol > 47 && symbol < 58)) ? true : false;
	}

}
