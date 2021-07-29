package by.epamLearning.strings.regexp;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task1 {

	private static String value = "Lorem ipsum dooor sit amet, consectetur. Adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua! Hendrerit dolor magna eget est? Ultrices dui sapien eget mi. Id consectetur purus ut faucibus pulvinar elementum. Justo laoreet sit amet cursus sit amet dictum sit. Ac tincidunt vitae semper quis lectus. In hendrerit gravida rutrum quisque non tellus orci. Sollicitudin tempor id eu nisl nunc mi ipsum. In hendrerit gravida rutrum quisque non tellus orci ac auctor. Sit amet mattis vulputate enim nulla aliquet porttitor lacus luctus. Morbi tristique senectus et netus et. Enim neque volutpat ac tincidunt vitae semper quis lectus nulla. Mi proin sed libero enim sed faucibus turpis. Diam phasellus vestibulum lorem sed risus ultricies tristique nulla. Nisl nisi scelerisque eu ultrices vitae auctor.\r\n"
			+ "\r\n"
			+ "Nullam non nisi est sit amet. Urna molestie at elementum eu facilisis sed. Bibendum enim facilisis gravida neque convallis a cras. Enim ut sem viverra aliquet eget sit amet. Neque aliquam vestibulum morbi blandit cursus risus at. Elementum curabitur vitae nunc sed velit dignissim sodales. Sagittis nisl rhoncus mattis rhoncus urna neque viverra justo. In ornare quam viverra orci sagittis eu. Egestas maecenas pharetra convallis posuere morbi leo urna molestie. Est sit amet facilisis magna etiam tempor. Dignissim sodales ut eu sem integer vitae justo eget magna. Fringilla urna porttitor rhoncus dolor purus non enim. Luctus accumsan tortor posuere ac ut consequat semper viverra. Lacinia quis vel eros donec ac odio tempor orci. Urna et pharetra pharetra massa massa ultricies mi quis hendrerit. Sapien et ligula ullamcorper malesuada proin libero nunc consequat interdum. Massa enim nec dui nunc. Pellentesque diam volutpat commodo sed egestas. Lobortis elementum nibh tellus molestie nunc non.\r\n"
			+ "\r\n"
			+ "Platea dictumst quisque sagittis purus sit amet volutpat. In fermentum et sollicitudin ac orci phasellus. Odio ut sem nulla pharetra diam sit amet nisl. Tellus elementum sagittis vitae et leo. Dolor sit amet consectetur adipiscing elit pellentesque. Integer vitae justo eget magna fermentum. Purus sit amet luctus venenatis lectus magna fringilla urna. Interdum velit euismod in pellentesque massa placerat duis. Elementum curabitur vitae nunc sed velit. Aliquam sem et tortor consequat id porta. Odio morbi quis commodo odio aenean sed adipiscing. Netus et malesuada fames ac turpis egestas sed tempus urna. Justo laoreet sit amet cursus sit amet dictum. Dictum non consectetur a erat nam at lectus. Diam ut venenatis tellus in metus vulputate eu scelerisque felis. Enim facilisis gravida neque convallis a cras semper. Egestas tellus rutrum tellus pellentesque eu tincidunt tortor aliquam nulla. Auctor elit sed vulputate mi sit amet. Facilisis leo vel fringilla est ullamcorper eget nulla facilisi. Odio morbi quis commodo odio aenean sed adipiscing diam.\r\n"
			+ "\r\n"
			+ "Sapien nec sagittis aliquam malesuada bibendum arcu vitae elementum curabitur. Faucibus a pellentesque sit amet porttitor eget. Pellentesque eu tincidunt tortor aliquam. Volutpat lacus laoreet non curabitur gravida arcu. Pulvinar etiam non quam lacus suspendisse faucibus interdum posuere lorem. Commodo sed egestas egestas fringilla. Pellentesque eu tincidunt tortor aliquam nulla facilisi cras. Arcu dictum varius duis at consectetur lorem donec massa sapien. Ultrices gravida dictum fusce ut placerat orci. Consectetur a erat nam at lectus urna. Nunc pulvinar sapien et ligula. Et odio pellentesque diam volutpat commodo sed. Non diam phasellus vestibulum lorem sed risus ultricies. Elit eget gravida cum sociis natoque penatibus et magnis. Risus nec feugiat in fermentum posuere urna nec. Auctor augue mauris augue neque gravida in fermentum. Eleifend donec pretium vulputate sapien nec sagittis aliquam malesuada bibendum.\r\n"
			+ "\r\n"
			+ "Aliquam purus sit amet luctus venenatis lectus magna. Viverra nibh cras pulvinar mattis nunc sed blandit. Cum sociis natoque penatibus et magnis dis parturient montes. Integer malesuada nunc vel risus commodo. Malesuada fames ac turpis egestas sed tempus. Pretium fusce id velit ut. Velit aliquet sagittis id consectetur purus ut faucibus pulvinar elementum. Purus ut faucibus pulvinar elementum. Consectetur lorem donec massa sapien. Sed cras ornare arcu dui vivamus arcu felis. Pellentesque habitant morbi tristique senectus et netus et malesuada fames. Arcu vitae elementum curabitur vitae nunc sed velit dignissim. Urna porttitor rhoncus dolor purus non enim praesent. Eros donec ac odio tempor orci dapibus ultrices in.";

	private static Scanner scan = new Scanner(System.in);
	private static final String PARAGRAPH_PATTERN = ".+?((\r\n)+|$)";
	private static final String SENTENCE_PATTERN = ".+?[\\.!\\?]+( |$|(\r\n)+)";
	private static final String WORD_PATTERN = ".+?( |$)";

	public static void main(String[] args) {
		runApplication();
	}

	private static void showStartScreen() {
		System.out.println(value + "\n\n");
		System.out.println("1. Sort paragraphs by number of sentences");
		System.out.println("2. Sort words by length in each sentences");
		System.out.println(
				"3. Sort lexemes in each sentences in descending by the number of occurrences of a given character, or if equals - by alphabet");
		System.out.println("4. Exit");
		System.out.println("\n Enter number of your choice:\n");
	}

	private static void runApplication() {
		while (true) {
			clearScreen();
			showStartScreen();
			int userChoice = scan.nextInt();
			scan.nextLine();
			switch (userChoice) {
			case 1:
				sortParagraphs();
				break;
			case 2:
				sortWordsByLength();
				break;
			case 3:
				sortLexemsByCharacter();
				break;
			case 4:
				scan.close();
				return;
			default:
				continue;
			}
			if (!isContinue())
				return;
		}
	}

	private static void sortLexemsByCharacter() {
		String enteredValue = "";
		while (!enteredValue.matches("\\w{1}")) {
			System.out.println("\nEnter character value: ");
			enteredValue = scan.nextLine();

		}
		char characterValue = enteredValue.charAt(0);
		Comparator<String> comparator = new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				int difference = countLexemsQuantity(o1, characterValue) - countLexemsQuantity(o2, characterValue);
				return difference < 0 ? 1 : difference == 0 ? o1.toLowerCase().compareTo(o2.toLowerCase()) : -1;
			}

			private int countLexemsQuantity(String o1, char characterValue) {
				Pattern pattern = Pattern.compile(String.valueOf(characterValue), Pattern.CASE_INSENSITIVE);
				Matcher matcher = pattern.matcher(o1);
				return (int) matcher.results().count();
			}
		};
		System.out.println("\nSorted lexems:\n\n" + sortWords(comparator) + "\n\n");
	}

	private static void sortWordsByLength() {
		Comparator<String> comparator = new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				int difference = isolateWord(o1).length() - isolateWord(o2).length();
				return difference < 0 ? -1 : difference == 0 ? o1.compareTo(o2) : 1;
			}
		};
		System.out.println("\nSorted words:\n\n" + sortWords(comparator) + "\n\n");
	}

	private static String sortWords(Comparator<String> comparator) {
		String[] sentences = splitString(value, SENTENCE_PATTERN);
		for (int i = 0; i < sentences.length; i++) {
			String isolatedSentence = sentences[i].replaceAll("[\\.!\\?]+( |$|(\r\n)+)", "");
			String endOfSentence = sentences[i].replaceAll(isolatedSentence, "");
			String[] words = splitString(isolatedSentence, WORD_PATTERN);
			words[words.length - 1] += " ";
			Arrays.sort(words, comparator);
			sentences[i] = assembleString(words).replaceAll(" $", endOfSentence);
		}
		return assembleString(sentences) + "\n\n";
	}

	private static void sortParagraphs() {
		String[] paragraphs = splitString(value, PARAGRAPH_PATTERN);
		paragraphs[paragraphs.length - 1] += "\r\n\r\n";
		Arrays.sort(paragraphs, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				int difference = splitString(o1, SENTENCE_PATTERN).length - splitString(o2, SENTENCE_PATTERN).length;
				return difference < 0 ? -1 : difference == 0 ? 0 : 1;
			}
		});
		System.out.println("\nSorted paragraphs:\n\n" + assembleString(paragraphs));
	}

	private static String assembleString(String[] stringArray) {
		StringBuilder builder = new StringBuilder();
		for (String subString : stringArray) {
			builder.append(subString);
		}
		return builder.toString();
	}

	private static String isolateWord(String value) {
		return value.replaceAll("[^a-zA-Z\\-]", "");
	}

	private static String[] splitString(String stringValue, String regexp) {
		Pattern pettern = Pattern.compile(regexp);
		Matcher matcher = pettern.matcher(stringValue);
		String[] result = new String[(int) matcher.results().count()];
		matcher.reset();
		int index = 0;
		while (matcher.find()) {
			result[index++] = matcher.group();
		}
		return result;
	}

	private static void clearScreen() {
		for (int i = 0; i < 50; i++) {
			System.out.println();
		}
	}

	private static boolean isContinue() {
		System.out.println("Enter 0 - to Exit anyKey - to Continue...");
		String choice = scan.nextLine();
		if (choice.matches("0"))
			return false;
		return true;
	}

}
