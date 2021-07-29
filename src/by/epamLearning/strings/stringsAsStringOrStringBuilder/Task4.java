package by.epamLearning.strings.stringsAsStringOrStringBuilder;

public class Task4 {

	public static void main(String[] args) {
		task4();
	}

	private static void task4() {
		String word = "информатика";
		String newWord = word.charAt(7) + word.substring(3, 5) + word.charAt(7);
		System.out.println(newWord);
	}

}
