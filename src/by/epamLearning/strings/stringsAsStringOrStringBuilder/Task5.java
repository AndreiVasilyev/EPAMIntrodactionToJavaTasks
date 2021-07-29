package by.epamLearning.strings.stringsAsStringOrStringBuilder;

public class Task5 {

	public static void main(String[] args) {
		String value = "Count how many times the letter \"a\" occurs among the characters of a given string.";
		System.out.println(value);
		System.out.println("Quantity of letter 'a' : " + getQuantityOfLetter(value));
	}

	private static int getQuantityOfLetter(String value) {
		return value.length() - value.replaceAll("a", "").length();
	}
}
