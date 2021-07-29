package by.epamLearning.strings.stringsAsStringOrStringBuilder;

import java.util.Scanner;

public class Task9 {

	public static void main(String[] args) {
		task9();
	}

	private static void task9() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your string:");
		String value = scan.nextLine();
		System.out.println("Source string: " + value);
		int lowerCaseLetterCounter = 0;
		int upperCaseLetterCounter = 0;
		for (char symbol : value.toCharArray()) {
			if (Character.UnicodeBlock.of(symbol) == Character.UnicodeBlock.BASIC_LATIN) {
				if (Character.isLetter(symbol)) {
					if (Character.isLowerCase(symbol)) {
						lowerCaseLetterCounter++;
					} else {
						upperCaseLetterCounter++;
					}
				}
			}
		}
		System.out.println("Lowercase letters quantity: " + lowerCaseLetterCounter);
		System.out.println("Uppercase letters quantity: " + upperCaseLetterCounter);
		scan.close();
	}
}
