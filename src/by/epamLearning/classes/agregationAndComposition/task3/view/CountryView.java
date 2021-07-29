package by.epamLearning.classes.agregationAndComposition.task3.view;

import java.util.List;

public class CountryView {

	public void print(String title, String value) {
		System.out.println(title + ": " + value);
	}

	public void print(String title, List<String> value) {
		System.out.println(title + ":\n");
		for (String string : value) {
			System.out.print(string + " ");
		}
	}
}
