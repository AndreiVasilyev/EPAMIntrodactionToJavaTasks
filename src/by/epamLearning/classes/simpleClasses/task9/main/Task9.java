package by.epamLearning.classes.simpleClasses.task9.main;

import java.util.Arrays;

import by.epamLearning.classes.simpleClasses.task9.entity.Binding;
import by.epamLearning.classes.simpleClasses.task9.entity.Book;
import by.epamLearning.classes.simpleClasses.task9.entity.Library;
import by.epamLearning.classes.simpleClasses.task9.logic.BookLogic;
import by.epamLearning.classes.simpleClasses.task9.view.BookView;

public class Task9 {

	public static void main(String[] args) {
		Library library = new Library();
		BookLogic bookLogic = new BookLogic();
		BookView bookView = new BookView();
		addDemoBooks(library);
		bookView.print("All books:", library.getBooks());
		bookView.print("Books by Dostoevsky: ", bookLogic.findByAuthor("Fyodor Dostoevsky", library.getBooks()));
		bookView.print("Books published after 2010 year: ", bookLogic.findAfterPublishedYear(2010, library.getBooks()));
		bookView.print("Books published in Penguin Classics: ",
				bookLogic.findByPublishingHouse("Penguin Classics", library.getBooks()));
	}

	private static void addDemoBooks(Library library) {
		Book book = new Book();
		book.setId(1);
		book.setTitle("Pride and Prejudice");
		book.setAuthors(Arrays.asList("Jane Austen"));
		book.setYearOfPublishing(2012);
		book.setPublishingHouse("Penguin Classics");
		book.setPagesQuantity(416);
		book.setPrice(20.50);
		book.setBindingType(Binding.SOFT_COVER);
		library.addBook(book);

		book = new Book();
		book.setId(2);
		book.setTitle("To Kill a Mockingbird");
		book.setAuthors(Arrays.asList("Harper Lee"));
		book.setYearOfPublishing(2015);
		book.setPublishingHouse("Arrow");
		book.setPagesQuantity(320);
		book.setPrice(18.00);
		book.setBindingType(Binding.SOFT_COVER);
		library.addBook(book);

		book = new Book();
		book.setId(3);
		book.setTitle("The Great Gatsby");
		book.setAuthors(Arrays.asList("F. Scott Fitzgerald"));
		book.setYearOfPublishing(2000);
		book.setPublishingHouse("Penguin Classics");
		book.setPagesQuantity(240);
		book.setPrice(22.00);
		book.setBindingType(Binding.HARD_COVER);
		library.addBook(book);

		book = new Book();
		book.setId(4);
		book.setTitle("One Hundred Years of Solitude");
		book.setAuthors(Arrays.asList("Gabriel García Márquez"));
		book.setYearOfPublishing(2014);
		book.setPublishingHouse("Penguin");
		book.setPagesQuantity(432);
		book.setPrice(25.00);
		book.setBindingType(Binding.HARD_COVER);
		library.addBook(book);

		book = new Book();
		book.setId(5);
		book.setTitle("In Cold Blood");
		book.setAuthors(Arrays.asList("Truman Capote"));
		book.setYearOfPublishing(2000);
		book.setPublishingHouse("Penguin Classics");
		book.setPagesQuantity(320);
		book.setPrice(12.00);
		book.setBindingType(Binding.SOFT_COVER);
		library.addBook(book);

		book = new Book();
		book.setId(6);
		book.setTitle("Wide Sargasso Sea");
		book.setAuthors(Arrays.asList("Jean Rhys"));
		book.setYearOfPublishing(2016);
		book.setPublishingHouse("Penguin Classics");
		book.setPagesQuantity(192);
		book.setPrice(14.00);
		book.setBindingType(Binding.SOFT_COVER);
		library.addBook(book);

		book = new Book();
		book.setId(7);
		book.setTitle("Brave New World");
		book.setAuthors(Arrays.asList("Aldous Huxley"));
		book.setYearOfPublishing(2014);
		book.setPublishingHouse("Vintage Classics");
		book.setPagesQuantity(288);
		book.setPrice(15.00);
		book.setBindingType(Binding.SOFT_COVER);
		library.addBook(book);

		book = new Book();
		book.setId(8);
		book.setTitle("I Capture The Castle");
		book.setAuthors(Arrays.asList("Dodie Smith"));
		book.setYearOfPublishing(2016);
		book.setPublishingHouse("Penguin");
		book.setPagesQuantity(544);
		book.setPrice(32.00);
		book.setBindingType(Binding.HARD_COVER);
		library.addBook(book);

		book = new Book();
		book.setId(9);
		book.setTitle("Jane Eyre");
		book.setAuthors(Arrays.asList("Charlotte Bronte"));
		book.setYearOfPublishing(2008);
		book.setPublishingHouse("Penguin Classics");
		book.setPagesQuantity(624);
		book.setPrice(33.00);
		book.setBindingType(Binding.HARD_COVER);
		library.addBook(book);

		book = new Book();
		book.setId(10);
		book.setTitle("Crime and Punishment");
		book.setAuthors(Arrays.asList("Fyodor Dostoevsky"));
		book.setYearOfPublishing(2003);
		book.setPublishingHouse("Penguin Classics");
		book.setPagesQuantity(720);
		book.setPrice(40.00);
		book.setBindingType(Binding.HARD_COVER);
		library.addBook(book);
	}

}
