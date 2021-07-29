package by.epamLearning.strings.stringsAsStringOrStringBuilder;

public class Task10 {

	public static void main(String[] args) {
		String value = "В этой строке несколько предложений. Первое заканчивается точкой! Второе восклицательным знаком. А третье? Нужно их сосчитать.";
		System.out.println(value);
		System.out.println("Quantity of sentences: " + calculateQuantityOfSentences(value));
	}

	private static int calculateQuantityOfSentences(String value) {
		return value.split("[!.?]").length;
	}

}
