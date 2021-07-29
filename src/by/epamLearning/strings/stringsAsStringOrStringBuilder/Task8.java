package by.epamLearning.strings.stringsAsStringOrStringBuilder;

import java.util.Scanner;

public class Task8 {

	public static void main(String[] args) {
		task8();
	}

	private static void task8() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your string:");
		String value = scan.nextLine();
		System.out.println("Source string: " + value);
		String[] words = value.trim().split(" ");
		String longestWord = "";
		int wordsCounter = 0;
		for (String word : words) {
			if (word.length() > longestWord.length()) {
				longestWord = word;
				wordsCounter = 1;
			} else if (word.length() == longestWord.length()) {
				wordsCounter++;
			}
		}
		if (wordsCounter > 1) {
			System.out.println("There is no longest word");
		} else {
			System.out.println("Longest word: " + longestWord);
		}
		scan.close();
	}
}
