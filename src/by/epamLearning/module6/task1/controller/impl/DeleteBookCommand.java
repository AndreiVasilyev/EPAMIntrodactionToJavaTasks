package by.epamLearning.module6.task1.controller.impl;

import by.epamLearning.module6.task1.controller.Command;
import by.epamLearning.module6.task1.exception.BookExceptionService;
import by.epamLearning.module6.task1.service.BookService;
import by.epamLearning.module6.task1.service.ServiceProvider;

public class DeleteBookCommand implements Command {

	@Override
	public String execute(String[] params) {
		ServiceProvider provider = ServiceProvider.getInstance();
		BookService bookService = provider.getBookService();
		long id = Long.parseLong(params[1]);		
		boolean result=false;
		try {
			result = bookService.removeBook(id);
		} catch (BookExceptionService e) {
			e.printStackTrace();
		}
		return result==true ? "0" : "1";
	}

}
