package by.epamLearning.module6.task1.controller.impl;

import java.util.List;

import by.epamLearning.module6.task1.bean.Book;
import by.epamLearning.module6.task1.controller.Command;
import by.epamLearning.module6.task1.exception.BookExceptionService;
import by.epamLearning.module6.task1.service.BookService;
import by.epamLearning.module6.task1.service.ServiceProvider;
import by.epamLearning.module6.task1.view.BookView;

public class ReadAllBooksCommand implements Command {

	@Override
	public String execute(String[] params) {
		ServiceProvider serviceProvider = ServiceProvider.getInstance();
		BookService bookService = serviceProvider.getBookService();
		try {
			List<Book> books = bookService.readBooks();
			return BookView.readBooksAnswer(books);
		} catch (BookExceptionService e) {
			e.printStackTrace();
		}
		return null;
	}
}
