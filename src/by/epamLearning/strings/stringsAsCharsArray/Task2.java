package by.epamLearning.strings.stringsAsCharsArray;

public class Task2 {

	public static void main(String[] args) {
		String stringValue = "In this string value word will be replaced with letter. New Word! wor";
		System.out.println(stringValue);
		stringValue = replaceWord(stringValue);
		System.out.println(stringValue);
	}

	private static String replaceWord(String stringValue) {
		String originalWord = "word";
		String newWord = "letter";
		String newStringValue = "";
		for (int i = 0; i < stringValue.length(); i++) {
			char currentSymbol = stringValue.charAt(i);
			if (Character.toLowerCase(currentSymbol) == originalWord.charAt(0)
					&& i + originalWord.length() < stringValue.length()) {
				boolean isEquals = true;
				for (int j = 1; j < originalWord.length(); j++) {
					if (Character.toLowerCase(stringValue.charAt(i + j)) != originalWord.charAt(j)) {
						isEquals = false;
						break;
					}
				}
				if (isEquals) {
					newStringValue += newWord;
					i += originalWord.length() - 1;
					continue;
				}
			}
			newStringValue += currentSymbol;
		}
		return newStringValue;
	}

}
