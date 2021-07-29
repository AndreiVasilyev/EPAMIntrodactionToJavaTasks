package by.epamLearning.strings.stringsAsStringOrStringBuilder;

public class Task3 {

	public static void main(String[] args) {
		String word = "asdzxccxzdsa";
		System.out.println("Is word '" + word + "' palindrome? : " + isPalindrome(word));
		word = "asdzxccxzdsad";
		System.out.println("Is word '" + word + "' palindrome? : " + isPalindrome(word));
	}

	private static boolean isPalindrome(String word) {
		return word.equalsIgnoreCase(new StringBuffer(word).reverse().toString()) ? true : false;
	}

}
