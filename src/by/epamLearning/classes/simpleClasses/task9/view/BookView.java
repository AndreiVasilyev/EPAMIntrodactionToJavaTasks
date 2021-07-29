package by.epamLearning.classes.simpleClasses.task9.view;

import java.util.List;

import by.epamLearning.classes.simpleClasses.task9.entity.Book;

public class BookView {

	public void print(String message, List<Book> books) {
		System.out.println("\n" + message+"\n");
		for (Book book : books) {
			print(book);
		}
	}

	public void print(Book book) {
		System.out.printf("%d. %s by ", book.getId(), book.getTitle());
		if (book.getAuthors() != null && !book.getAuthors().isEmpty()) {
			for (String author : book.getAuthors()) {
				System.out.printf("%s, ", author);
			}
			System.out.print("\n");
		}
		System.out.printf("%d, %s, %d pages, %s binding,\n", book.getYearOfPublishing(), book.getPublishingHouse(),
				book.getPagesQuantity(), book.getBindingType());
		System.out.printf("%.2f BYR\n\n", book.getPrice());
	}
}
