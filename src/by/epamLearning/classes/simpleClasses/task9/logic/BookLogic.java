package by.epamLearning.classes.simpleClasses.task9.logic;

import java.util.ArrayList;
import java.util.List;

import by.epamLearning.classes.simpleClasses.task9.entity.Book;

public class BookLogic {

	public List<Book> findByAuthor(String author, List<Book> books) {
		List<Book> foundBooks = new ArrayList<>();
		if (author != null && !author.isBlank()) {
			for (Book book : books) {
				if (book.getAuthors() != null && !book.getAuthors().isEmpty()) {
					for (String authorName : book.getAuthors()) {
						if (author.equals(authorName)) {
							foundBooks.add(book);
							break;
						}
					}
				}
			}
		}
		return foundBooks;
	}

	public List<Book> findByPublishingHouse(String publishingHouse, List<Book> books) {
		List<Book> foundBooks = new ArrayList<>();
		if (publishingHouse != null && !publishingHouse.isBlank()) {
			for (Book book : books) {
				if (book.getPublishingHouse() != null && !book.getPublishingHouse().isEmpty()) {
					if (publishingHouse.equals(book.getPublishingHouse())) {
						foundBooks.add(book);
					}
				}
			}
		}
		return foundBooks;
	}

	public List<Book> findAfterPublishedYear(int year, List<Book> books) {
		List<Book> foundBooks = new ArrayList<>();
		if (year != 0) {
			for (Book book : books) {
				if (book.getYearOfPublishing() != 0) {
					if (year < book.getYearOfPublishing()) {
						foundBooks.add(book);
					}
				}
			}
		}
		return foundBooks;
	}

}
