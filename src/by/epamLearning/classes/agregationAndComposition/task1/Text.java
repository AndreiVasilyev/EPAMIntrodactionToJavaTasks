package by.epamLearning.classes.agregationAndComposition.task1;

import java.util.List;

public class Text {

	private List<Word> header;
	private List<Sentence> textBody;
	private String author;

	public Text() {
		super();
	}

	public Text(List<Word> header, List<Sentence> textBody, String author) {
		super();
		this.header = header;
		this.textBody = textBody;
		this.author = author;
	}

	public List<Word> getHeader() {
		return header;
	}

	public void setHeader(List<Word> header) {
		this.header = header;
	}

	public List<Sentence> getTextBody() {
		return textBody;
	}

	public void setTextBody(List<Sentence> textBody) {
		this.textBody = textBody;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((author == null) ? 0 : author.hashCode());
		result = prime * result + ((header == null) ? 0 : header.hashCode());
		result = prime * result + ((textBody == null) ? 0 : textBody.hashCode());
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
		Text other = (Text) obj;
		if (author == null) {
			if (other.author != null)
				return false;
		} else if (!author.equals(other.author))
			return false;
		if (header == null) {
			if (other.header != null)
				return false;
		} else if (!header.equals(other.header))
			return false;
		if (textBody == null) {
			if (other.textBody != null)
				return false;
		} else if (!textBody.equals(other.textBody))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return buildHeader() + buildTextBody() + author;
	}

	public void addText(String textValue) {
		textBody.add(new Sentence(textValue));
	}

	public void printHeaderToConsole() {
		System.out.println(buildHeader());
	}

	public void printTextToConsole() {
		System.out.println(buildTextBody());
	}

	private String buildHeader() {
		StringBuilder builder = new StringBuilder();
		builder.append("\t\t");
		for (Word word : header) {
			builder.append(word + " ");
		}
		builder.append("\n\r\n\r");
		return builder.toString();
	}

	private String buildTextBody() {
		StringBuilder builder = new StringBuilder();
		for (Sentence sentence : textBody) {
			builder.append(sentence.toString());
		}
		builder.append("\n\r\n\r");
		return builder.toString();
	}
}
