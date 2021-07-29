package by.epamLearning.strings.stringsAsStringOrStringBuilder;

import java.util.Scanner;

public class Task7 {

	public static void main(String[] args) {
		task7();
	}

	private static void task7() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your string:");
		String value = scan.nextLine();
		value.trim().replaceAll(" ", "");
		int counter = 0;
		char currentSymbol;
		System.out.println("Source string: " + value);
		while (counter < value.length() - 1) {
			currentSymbol = value.charAt(counter);
			if (value.lastIndexOf(currentSymbol) > counter) {
				value = value.substring(0, counter + 1)
						+ value.substring(counter + 1).replaceAll(String.valueOf(currentSymbol), "");
			}
			counter++;
		}
		System.out.println("New string: " + value);
		scan.close();
	}

}
