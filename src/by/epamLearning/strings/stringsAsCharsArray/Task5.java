package by.epamLearning.strings.stringsAsCharsArray;

import java.util.Arrays;

public class Task5 {

	public static void main(String[] args) {
		String stringValue = "   there  are   too many   spaces   in    this   line,   you need       to  remove   the extra   ones    ";
		System.out.println(stringValue);
		System.out.println("\n\n" + trimAndRemoveExtraSpaces(stringValue));
	}

	private static String trimAndRemoveExtraSpaces(String stringValue) {
		char[] correctedSymbols = new char[stringValue.length()];
		for (char c : correctedSymbols) {
			System.out.print(c);
		}
		char currentSymbol, nextSymbol;
		for (int i = 0, j = 0; i < stringValue.length() - 1; i++) {
			currentSymbol = stringValue.charAt(i);
			nextSymbol = stringValue.charAt(i + 1);
			if (currentSymbol == ' ' && (nextSymbol == ' ' || correctedSymbols[0] == '\u0000')) {
				continue;
			}
			correctedSymbols[j++] = currentSymbol;
		}
		int stringLength = correctedSymbols.length;
		for (int i = stringLength - 1; i >= 0; i--) {
			if (correctedSymbols[i] != '\u0000' && correctedSymbols[i] != '\u0000') {
				stringLength = i + 1;
				break;
			}
		}
		return String.valueOf(Arrays.copyOf(correctedSymbols, stringLength));
	}

}
