package by.epamLearning.module6.task1.dao;

import by.epamLearning.module6.task1.dao.impl.BookDAOImpl;
import by.epamLearning.module6.task1.dao.impl.ConsoleDAOImpl;
import by.epamLearning.module6.task1.dao.impl.EmailDAOImpl;
import by.epamLearning.module6.task1.dao.impl.UserDAOImpl;

public class DAOProvider {

	private static final DAOProvider instance = new DAOProvider();

	private UserDAO userDAO = new UserDAOImpl();
	private BookDAO bookDAO = new BookDAOImpl();
	private ConsoleDAO consoleDAO = new ConsoleDAOImpl();
	private EmailDAO emailDAO = new EmailDAOImpl();

	private DAOProvider() {
	}

	public static DAOProvider getInstance() {
		return instance;
	}

	public BookDAO getBookDAO() {
		return bookDAO;
	}

	public void setBookDAO(BookDAO bookDAO) {
		this.bookDAO = bookDAO;
	}

	public UserDAO getUserDAO() {
		return userDAO;
	}

	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}

	public ConsoleDAO getConsoleDAO() {
		return consoleDAO;
	}

	public void setConsoleDAO(ConsoleDAO consoleDAO) {
		this.consoleDAO = consoleDAO;
	}

	public EmailDAO getEmailDAO() {
		return emailDAO;
	}

	public void setEmailDAO(EmailDAO emailDAO) {
		this.emailDAO = emailDAO;
	}
}
