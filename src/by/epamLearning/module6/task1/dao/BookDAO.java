package by.epamLearning.module6.task1.dao;

import java.util.List;

import by.epamLearning.module6.task1.bean.Book;
import by.epamLearning.module6.task1.exception.BookExceptionDAO;

public interface BookDAO {

	public List<Book> readBooks(Book bookParams, int pageNumber) throws BookExceptionDAO;

	public Book readBookById(long id) throws BookExceptionDAO;

	public void writeBooks(List<Book> books) throws BookExceptionDAO;

	public void writeBook(Book book) throws BookExceptionDAO;

	public boolean removeBooks(List<Long> booksId) throws BookExceptionDAO;

	public boolean removeBook(Long bookId) throws BookExceptionDAO;

}
