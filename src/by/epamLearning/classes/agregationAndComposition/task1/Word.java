package by.epamLearning.classes.agregationAndComposition.task1;

public class Word {

	private String word;
	private String font;
	private int wordSize;
	private int wordLength;

	public Word() {
		super();
	}

	public Word(String word) {
		super();
		this.word = word;	
		this.wordLength = word.length();
	}
	
	public Word(String word, String font, int wordSize) {
		super();
		this.word = word;
		this.font = font;
		this.wordSize = wordSize;
		this.wordLength = word.length();
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	public String getFont() {
		return font;
	}

	public void setFont(String font) {
		this.font = font;
	}

	public int getWordSize() {
		return wordSize;
	}

	public void setWordSize(int wordSize) {
		this.wordSize = wordSize;
	}

	public int getWordLength() {
		return wordLength;
	}

	public void setWordLength(int wordLength) {
		this.wordLength = wordLength;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((font == null) ? 0 : font.hashCode());
		result = prime * result + ((word == null) ? 0 : word.hashCode());
		result = prime * result + wordLength;
		result = prime * result + wordSize;
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
		Word other = (Word) obj;
		if (font == null) {
			if (other.font != null)
				return false;
		} else if (!font.equals(other.font))
			return false;
		if (word == null) {
			if (other.word != null)
				return false;
		} else if (!word.equals(other.word))
			return false;
		if (wordLength != other.wordLength)
			return false;
		if (wordSize != other.wordSize)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return word;
	}

}
