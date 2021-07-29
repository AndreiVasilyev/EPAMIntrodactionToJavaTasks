package by.epamLearning.classes.agregationAndComposition.task1;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Word> header=new LinkedList<>(Arrays.asList(new Word("What"),new Word("is"),new Word("Lorem"),new Word("Ipsum")));
		List<Sentence> sentences=new LinkedList<Sentence>();
		sentences.add(new Sentence("Lorem Ipsum is simply dummy text of the printing and typesetting industry"));
		sentences.add(new Sentence("Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book."));
		sentences.add(new Sentence("It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged"));
		sentences.add(new Sentence(" It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum."));
		Text text=new Text(header, sentences, "me.");
		text.printHeaderToConsole();
		text.printTextToConsole();
		text.addText("The standard chunk of Lorem Ipsum used since the 1500s is reproduced below for those interested.");
		System.out.println(text.toString());
	}

}
