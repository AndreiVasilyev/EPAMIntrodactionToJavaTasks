package by.epamLearning.strings.stringsAsCharsArray;

public class Task3 {

	public static void main(String[] args) {
		String stringValue = "In this string exist 4 digits. This are 5 and 95 and result";
		System.out.println(stringValue);
		System.out.println("Quantity of digits in string: " + calculateQuantityOfDigits(stringValue));
	}

	private static int calculateQuantityOfDigits(String stringValue) {
		int counter = 0;
		for (int i = 0; i < stringValue.length(); i++) {
			char currentSymbol = stringValue.charAt(i);
			if (currentSymbol == 0 || (currentSymbol > 47 && currentSymbol < 58)) {
				counter++;
			}
		}
		return counter;
	}

}
