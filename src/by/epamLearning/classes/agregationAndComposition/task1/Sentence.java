package by.epamLearning.classes.agregationAndComposition.task1;

import java.util.LinkedList;
import java.util.List;

public class Sentence {

	private List<Word> sentence;
	private char lastPunctuationMark;

	public Sentence() {
		super();
	}

	public Sentence(String sentenceValue) {
		convertStringToSentence(sentenceValue);
	}

	public Sentence(List<Word> sentence, char lastPunctuationMark) {
		super();
		this.sentence = sentence;
		this.lastPunctuationMark = lastPunctuationMark;
	}

	public List<Word> getSentence() {
		return sentence;
	}

	public void setSentence(List<Word> sentence) {
		this.sentence = sentence;
	}

	public char getLastPunctuationMark() {
		return lastPunctuationMark;
	}

	public void setLastPunctuationMark(char lastPunctuationMark) {
		this.lastPunctuationMark = lastPunctuationMark;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + lastPunctuationMark;
		result = prime * result + ((sentence == null) ? 0 : sentence.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Sentence other = (Sentence) obj;
		if (lastPunctuationMark != other.lastPunctuationMark)
			return false;
		if (sentence == null) {
			if (other.sentence != null)
				return false;
		} else if (!sentence.equals(other.sentence))
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		for (Word word : sentence) {
			builder.append(word + " ");
		}
		builder.replace(builder.length() - 1, builder.length(), String.valueOf(lastPunctuationMark) + "\n\r");
		return builder.toString();
	}

	private void convertStringToSentence(String value) {
		this.sentence = new LinkedList<Word>();
		for (String word : value.trim().split("\s+")) {
			this.sentence.add(new Word(word.trim()));
		}
		Word lastWord = this.sentence.get(this.sentence.size() - 1);
		if (lastWord.getWord().matches(".+[\\.\\?!]$")) {
			this.lastPunctuationMark = lastWord.getWord().charAt(lastWord.getWordLength() - 1);
			lastWord.setWord(lastWord.getWord().replaceAll("[\\.\\?!]$", ""));
		} else {
			this.lastPunctuationMark = '.';
		}
		// System.out.println("lpm="+lastPunctuationMark);
	}
}
