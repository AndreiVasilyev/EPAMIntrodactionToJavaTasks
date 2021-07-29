package by.epamLearning.module6.task1.controller.impl;

import by.epamLearning.module6.task1.bean.Book;
import by.epamLearning.module6.task1.controller.Command;
import by.epamLearning.module6.task1.exception.BookExceptionService;
import by.epamLearning.module6.task1.service.BookService;
import by.epamLearning.module6.task1.service.ServiceProvider;
import by.epamLearning.module6.task1.view.BookView;

public class AddBookCommand implements Command {

	@Override
	public String execute(String[] params) {
		ServiceProvider serviceProvider = ServiceProvider.getInstance();
		BookService bookService = serviceProvider.getBookService();
		Book book = BookView.parseBookFromParams(params);
		try {
			bookService.writeBook(book);
		} catch (BookExceptionService e) {			
			e.printStackTrace();
		}
		return "0";
	}

}
