package by.epamLearning.strings.stringsAsStringOrStringBuilder;

public class Task6 {

	public static void main(String[] args) {
		String value = "Get a new one from the given string by repeating each character twice.";
		System.out.println(value);
		System.out.println(getProcessedString(value));

	}

	private static String getProcessedString(String value) {
		StringBuilder processedString = new StringBuilder(value);
		processedString.setLength(value.length() * 2);
		for (int i = 0; i < processedString.length() - 1; i += 2) {
			processedString.insert(i, processedString.charAt(i));
		}
		return processedString.toString();

	}

}
