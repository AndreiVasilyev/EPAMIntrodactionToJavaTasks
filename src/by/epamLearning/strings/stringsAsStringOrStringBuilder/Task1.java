package by.epamLearning.strings.stringsAsStringOrStringBuilder;


public class Task1 {

	public static void main(String[] args) {
		String stringValue = "In   this    line you need to   find the maximum   number of consecutive spaces         ";
		System.out.println(stringValue);
		System.out.println("Maximum number of spaces: " + getMaxSpacesQuantity(stringValue));
	}

	private static int getMaxSpacesQuantity(String stringValue) {
		String[] spacesArray = stringValue.split("\\S");
		int result = 0;
		for (String string : spacesArray) {
			if (string.length() > result) {
				result = string.length();
			}
		}
		return result;
	}

}
