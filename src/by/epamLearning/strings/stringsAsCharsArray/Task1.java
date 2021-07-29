package by.epamLearning.strings.stringsAsCharsArray;

import java.util.Arrays;

public class Task1 {

	public static void main(String[] args) {
		String[] variablesInCamelCase = { "FirstVariable", "SecondVariable", "ThirdVariableLonger", "Next" };
		System.out.println(Arrays.toString(variablesInCamelCase));
		String[] variablesInSnakeCase = convertToSnakeCase(variablesInCamelCase);
		System.out.println(Arrays.toString(variablesInSnakeCase));
	}

	private static String[] convertToSnakeCase(String[] variablesInCamelCase) {
		String[] variablesInSnakeCase = new String[variablesInCamelCase.length];
		String currentValue = "";
		char currentSymbol;
		for (int i = 0; i < variablesInCamelCase.length; i++) {
			currentValue = "";
			for (int j = 0; j < variablesInCamelCase[i].length(); j++) {
				currentSymbol = variablesInCamelCase[i].charAt(j);
				if (Character.isUpperCase(currentSymbol)) {
					if (j > 0) {
						currentValue += "_";
					}
					currentValue += Character.toLowerCase(currentSymbol);
					continue;
				}
				currentValue += variablesInCamelCase[i].charAt(j);
			}
			variablesInSnakeCase[i] = currentValue;
		}
		return variablesInSnakeCase;
	}
}
