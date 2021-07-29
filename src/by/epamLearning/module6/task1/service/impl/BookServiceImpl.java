package by.epamLearning.module6.task1.service.impl;

import java.util.ArrayList;
import java.util.List;

import by.epamLearning.module6.task1.bean.Book;
import by.epamLearning.module6.task1.bean.BookType;
import by.epamLearning.module6.task1.dao.BookDAO;
import by.epamLearning.module6.task1.dao.DAOProvider;
import by.epamLearning.module6.task1.exception.BookExceptionDAO;
import by.epamLearning.module6.task1.exception.BookExceptionService;
import by.epamLearning.module6.task1.service.BookService;

public class BookServiceImpl implements BookService {

	private DAOProvider daoProvider = DAOProvider.getInstance();

	@Override
	public List<Book> readBooks() throws BookExceptionService {
		BookDAO bookDAO = daoProvider.getBookDAO();
		try {
			return bookDAO.readBooks(null, 0);
		} catch (BookExceptionDAO e) {
			throw new BookExceptionService("Read books error", e);
		}
	}

	@Override
	public List<Book> readBooks(int pageNumber) throws BookExceptionService {
		BookDAO bookDAO = daoProvider.getBookDAO();
		try {
			return bookDAO.readBooks(null, pageNumber);
		} catch (BookExceptionDAO e) {
			throw new BookExceptionService("Read books error", e);
		}
	}

	@Override
	public List<Book> readBooks(Book bookParams, int pageNumber) throws BookExceptionService {
		BookDAO bookDAO = daoProvider.getBookDAO();
		try {
			return bookDAO.readBooks(bookParams, pageNumber);
		} catch (BookExceptionDAO e) {
			throw new BookExceptionService("Read books error", e);
		}
	}

	@Override
	public Book readBookById(long id) throws BookExceptionService {
		BookDAO bookDAO = daoProvider.getBookDAO();
		Book params = new Book();
		params.setId(id);
		try {
			List<Book> searchResult = bookDAO.readBooks(params, 0);
			return searchResult.isEmpty() ? null : searchResult.get(0);
		} catch (BookExceptionDAO e) {
			throw new BookExceptionService("Read books error", e);
		}
	}

	@Override
	public List<Book> readBooksByTitle(String title) throws BookExceptionService {
		return readBooksByTitle(title, 0);
	}

	@Override
	public List<Book> readBooksByTitle(String title, int pageNumber) throws BookExceptionService {
		BookDAO bookDAO = daoProvider.getBookDAO();
		Book params = new Book();
		params.setTitle(title);
		try {
			return bookDAO.readBooks(params, pageNumber);
		} catch (BookExceptionDAO e) {
			throw new BookExceptionService("Read books error", e);
		}
	}

	@Override
	public List<Book> readBooksByAuthor(String author) throws BookExceptionService {
		return readBooksByAuthor(author, 0);
	}

	@Override
	public List<Book> readBooksByAuthor(String author, int pageNumber) throws BookExceptionService {
		BookDAO bookDAO = daoProvider.getBookDAO();
		Book params = new Book();
		List<String> authors = new ArrayList<String>();
		authors.add(author);
		params.setAuthors(authors);
		try {
			return bookDAO.readBooks(params, pageNumber);
		} catch (BookExceptionDAO e) {
			throw new BookExceptionService("Read books error", e);
		}
	}

	@Override
	public List<Book> readBooksByBookType(BookType type) throws BookExceptionService {
		return readBooksByBookType(type, 0);
	}

	@Override
	public List<Book> readBooksByBookType(BookType type, int pageNumber) throws BookExceptionService {
		BookDAO bookDAO = daoProvider.getBookDAO();
		Book params = new Book();
		params.setBookType(type);
		try {
			return bookDAO.readBooks(params, pageNumber);
		} catch (BookExceptionDAO e) {
			throw new BookExceptionService("Read books error", e);
		}
	}

	@Override
	public void writeBooks(List<Book> books) throws BookExceptionService {
		BookDAO bookDAO = daoProvider.getBookDAO();
		try {
			bookDAO.writeBooks(books);
		} catch (BookExceptionDAO e) {
			throw new BookExceptionService("Write books error", e);
		}
	}

	@Override
	public void writeBook(Book book) throws BookExceptionService {
		BookDAO bookDAO = daoProvider.getBookDAO();
		try {
			bookDAO.writeBook(book);
		} catch (BookExceptionDAO e) {
			throw new BookExceptionService("Write book error", e);
		}
	}

	@Override
	public boolean removeBooks(List<Long> booksId) throws BookExceptionService {
		BookDAO bookDAO = daoProvider.getBookDAO();
		try {
			return bookDAO.removeBooks(booksId);
		} catch (BookExceptionDAO e) {
			throw new BookExceptionService("Remove books error", e);
		}
	}

	@Override
	public boolean removeBook(Long bookId) throws BookExceptionService {
		BookDAO bookDAO = daoProvider.getBookDAO();
		try {
			return bookDAO.removeBook(bookId);
		} catch (BookExceptionDAO e) {
			throw new BookExceptionService("Remove book error", e);
		}
	}
}
