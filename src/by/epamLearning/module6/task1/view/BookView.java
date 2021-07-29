package by.epamLearning.module6.task1.view;

import java.util.List;

import by.epamLearning.module6.task1.bean.Book;
import by.epamLearning.module6.task1.bean.BookType;

public class BookView {

	public static String prepareStringToWrite(Book book) {
		StringBuilder builder = new StringBuilder();
		String endLine = "\n";
		builder.append("id=");
		builder.append(book.getId());
		builder.append(endLine);
		builder.append("title=");
		builder.append(book.getTitle());
		builder.append(endLine);
		builder.append("authors=");
		for (String author : book.getAuthors()) {
			builder.append(author + ", ");
		}
		builder.append(endLine);
		builder.append("book type=");
		builder.append(book.getBookType().toString());
		builder.append(endLine);
		builder.append("description=");
		builder.append(book.getDescription().replaceAll("\n", " "));
		builder.append(endLine);
		builder.append(endLine);
		return builder.toString();
	}

	public static String readBooksAnswer(List<Book> books) {
		StringBuilder builder = new StringBuilder();
		if (books == null) {
			builder.append("1 Error reading books");
		} else {
			builder.append("0 ");
			for (Book book : books) {
				builder.append(book.getId());
				builder.append("###");
				builder.append(book.getTitle());
				builder.append("###");
				if (book.getAuthors() != null && !book.getAuthors().isEmpty()) {
					for (String author : book.getAuthors()) {
						builder.append(author);
						builder.append("##");
					}
					builder.replace(builder.length() - 2, builder.length(), "###");
				}
				builder.append(book.getBookType().toString());
				builder.append("###");
				builder.append(book.getDescription());
				builder.append("&&&");
			}
		}
		return builder.toString();
	}

	public static String prepareBookParams(String... params) {
		StringBuilder builder = new StringBuilder();
		if (exist(params[0])) {
			builder.append(" id=");
			builder.append(params[0]);
		}
		if (exist(params[1])) {
			builder.append(" title=");
			builder.append(params[1].replaceAll("\\s+", "&&&"));
		}
		if (exist(params[2])) {
			builder.append(" type=");
			builder.append(params[2]);
		}
		if (exist(params[3])) {
			builder.append(" author=");
			builder.append(params[3].replaceAll(", ", ",").replaceAll("\\s+", "&&&"));
		}
		if (exist(params[4])) {
			builder.append(" description=");
			builder.append(params[4].replaceAll("\\s+", "&&&"));
		}
		return builder.toString();
	}

	private static boolean exist(String param) {
		return (param != null && !param.isBlank()) ? true : false;
	}

	public static Book parseBookFromParams(String[] params) {
		Book book = new Book();
		for (int i = 1; i < params.length; i++) {
			String[] splitedParam = params[i].split("=");
			String paramName = splitedParam[0];
			String paramValue = splitedParam[1];
			if ("id".equalsIgnoreCase(paramName)) {
				book.setId(Integer.parseInt(paramValue));
			} else if ("title".equalsIgnoreCase(paramName)) {
				book.setTitle(paramValue.replaceAll("&&&", " "));
			} else if (paramName.contains("type")) {
				book.setBookType(BookType.valueOf(paramValue.toUpperCase()));
			} else if ("author".equalsIgnoreCase(paramName)) {
				book.addAuthor(paramValue.replaceAll("&&&", " "));
			} else if ("description".equalsIgnoreCase(paramName)) {
				book.setDescription(paramValue.replaceAll("&&&", " "));
			}
		}
		return book;
	}
}
