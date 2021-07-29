package by.epamLearning.strings.stringsAsStringOrStringBuilder;

public class Task2 {

	public static void main(String[] args) {
		String stringValue = "In this line after each character 'a' you need to insert the character 'b'";
		System.out.println(stringValue);
		System.out.println("\n" + getProcessedString(stringValue));
	}

	private static String getProcessedString(String stringValue) {
		return stringValue.replaceAll("a", "ab");
	}
}
