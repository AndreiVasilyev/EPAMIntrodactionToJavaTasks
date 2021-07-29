package by.epamLearning.module6.task1.service;

import by.epamLearning.module6.task1.service.impl.BookServiceImpl;
import by.epamLearning.module6.task1.service.impl.ConsoleServiceImpl;
import by.epamLearning.module6.task1.service.impl.EmailServiceImpl;
import by.epamLearning.module6.task1.service.impl.UserServiceImpl;

public class ServiceProvider {

	private static ServiceProvider instance = new ServiceProvider();

	private BookService bookService = new BookServiceImpl();
	private UserService userService = new UserServiceImpl();
	private ConsoleService consoleService = new ConsoleServiceImpl();
	private EmailService emailService = new EmailServiceImpl();

	private ServiceProvider() {
	}

	public static ServiceProvider getInstance() {
		return instance;
	}

	public BookService getBookService() {
		return bookService;
	}

	public void setBookService(BookService bookService) {
		this.bookService = bookService;
	}

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public ConsoleService getConsoleService() {
		return consoleService;
	}

	public void setConsoleService(ConsoleService consoleService) {
		this.consoleService = consoleService;
	}

	public EmailService getEmailService() {
		return emailService;
	}

	public void setEmailService(EmailService emailService) {
		this.emailService = emailService;
	}
}
