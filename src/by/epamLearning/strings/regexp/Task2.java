package by.epamLearning.strings.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2 {

	private static String value = "<notes>\r\n" + " <note id = \"1\">\r\n" + " <to>Вася</to>\r\n"
			+ " <from>Света</from>\r\n" + " <heading>Напоминание</heading>\r\n"
			+ " <body>Позвони мне завтра!</body>\r\n" + " </note>\r\n" + " <note id = \"2\">\r\n" + " <to>Петя</to>\r\n"
			+ " <from>Маша</from>\r\n" + " <heading>Важное напоминание</heading>\r\n" + " <body/>\r\n" + " </note>\r\n"
			+ "</notes>";
	private static final String TAG_WITH_BODY_REGEXP = "(?<openTag><(?<tagName>.+?[^\\/])( .+)?>)(?<body>(.*?[\\r\\n]?)*)(?<closeTag><\\/\\k<tagName>>)";
	private static final String TAG_WITHOUT_BODY_REGEXP = "<.+( .+)?\\/>";

	public static void main(String[] args) {
		parseTagsWithBody(value);
		parseTagsWithoutBody(value);
	}

	private static void parseTagsWithoutBody(String sourceString) {
		Pattern tagWithoutBodyPattern = Pattern.compile(TAG_WITHOUT_BODY_REGEXP);
		Matcher matcher = tagWithoutBodyPattern.matcher(sourceString);
		while (matcher.find()) {
			System.out.println(matcher.group());
		}
	}

	private static void parseTagsWithBody(String sourceString) {
		Pattern tagWithBodyPattern = Pattern.compile(TAG_WITH_BODY_REGEXP);
		Matcher matcher = tagWithBodyPattern.matcher(sourceString);
		while (matcher.find()) {
			System.out.println(matcher.group("openTag") + matcher.group("closeTag"));
			System.out.println("\t" + matcher.group("body").trim().replaceAll("\\r\\n", "\r\n\t"));
			if (matcher.group("body").contains("<")) {
				parseTagsWithBody(matcher.group("body"));
			}
		}
	}

}
