package by.epamLearning.module6.task1.service;

import java.util.List;

import by.epamLearning.module6.task1.bean.Book;
import by.epamLearning.module6.task1.bean.BookType;
import by.epamLearning.module6.task1.exception.BookExceptionService;

public interface BookService {

	public List<Book> readBooks() throws BookExceptionService;

	public List<Book> readBooks(int pageNumber) throws BookExceptionService;

	public List<Book> readBooks(Book bookParams, int pageNumber) throws BookExceptionService;

	public Book readBookById(long id) throws BookExceptionService;

	public List<Book> readBooksByTitle(String title) throws BookExceptionService;

	public List<Book> readBooksByTitle(String title, int pageNumber) throws BookExceptionService;

	public List<Book> readBooksByAuthor(String author) throws BookExceptionService;

	public List<Book> readBooksByAuthor(String author, int pageNumber) throws BookExceptionService;

	public List<Book> readBooksByBookType(BookType type) throws BookExceptionService;

	public List<Book> readBooksByBookType(BookType type, int pageNumber) throws BookExceptionService;

	public void writeBooks(List<Book> books) throws BookExceptionService;

	public void writeBook(Book book) throws BookExceptionService;

	public boolean removeBooks(List<Long> booksId) throws BookExceptionService;

	public boolean removeBook(Long bookId) throws BookExceptionService;
}
