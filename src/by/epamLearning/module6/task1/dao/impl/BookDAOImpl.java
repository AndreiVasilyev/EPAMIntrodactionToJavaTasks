package by.epamLearning.module6.task1.dao.impl;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import by.epamLearning.module6.task1.bean.Book;
import by.epamLearning.module6.task1.bean.BookType;
import by.epamLearning.module6.task1.dao.BookDAO;
import by.epamLearning.module6.task1.exception.BookExceptionDAO;
import by.epamLearning.module6.task1.service.BookComparatorById;
import by.epamLearning.module6.task1.view.BookView;

public class BookDAOImpl implements BookDAO {

	private static final int DEFAULT_PAGE_SIZE = 10;
	private int pageSize;
	private final String FILE_NAME = "/source/catalog.txt";
	private File sourceFile;
	private long lastBookId;

	public BookDAOImpl() {
		this(DEFAULT_PAGE_SIZE);
	}

	public BookDAOImpl(int pageSize) {
		this.pageSize = pageSize;
		String rootPath = this.getClass().getProtectionDomain().getCodeSource().getLocation().toString()
				.replaceAll("file:/", "");
		String relativePath = new File(new File(this.getClass().getPackageName().replaceAll("\\.", "\\/")).getParent())
				.getParent();
		sourceFile = new File(rootPath.concat(relativePath).concat(FILE_NAME));
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	@Override
	public List<Book> readBooks(Book bookParams, int pageNumber) throws BookExceptionDAO {
		List<Book> books = new ArrayList<Book>();
		checkFile(sourceFile);
		int booksCounter = 0;
		int startPageBookNumber = (pageNumber == 0) ? 1 : (pageNumber - 1) * pageSize + 1;
		int endPageBookNumber = (pageNumber == 0) ? Integer.MAX_VALUE : pageNumber * pageSize;
		try (BufferedReader fileReader = new BufferedReader(new FileReader(sourceFile))) {
			while (fileReader.ready()) {
				String stringFromCatalog = readBookRecord(fileReader);
				if (!stringMatchParams(bookParams, stringFromCatalog))
					continue;
				booksCounter++;
				if (booksCounter >= startPageBookNumber && booksCounter <= endPageBookNumber) {
					books.add(parseBookFromFileRecord(stringFromCatalog));
				}
			}

		} catch (IOException e) {
			throw new BookExceptionDAO("File 'catalog.txt' reading error", e);
		}
		return books;
	}

	@Override
	public Book readBookById(long id) throws BookExceptionDAO {
		Book params = new Book();
		params.setId(id);
		List<Book> searchResult = readBooks(params, 0);
		if (searchResult.isEmpty())
			return null;
		return searchResult.get(0);
	}

	private long findLastBookId() throws BookExceptionDAO {
		checkFile(sourceFile);
		String lastBook = null;
		try (BufferedReader fileReader = new BufferedReader(new FileReader(sourceFile))) {
			while (fileReader.ready()) {
				lastBook = readBookRecord(fileReader);
			}
		} catch (IOException e) {
			throw new BookExceptionDAO("File 'catalog.txt' reading error", e);
		}
		if (lastBook != null && !lastBook.isBlank()) {
			Book book = parseBookFromFileRecord(lastBook);
			return book.getId();
		}
		return 0;
	}

	@Override
	public void writeBooks(List<Book> books) throws BookExceptionDAO {
		if (books != null && !books.isEmpty()) {
			books.sort(new BookComparatorById());
			checkFile(sourceFile);
			this.lastBookId = findLastBookId();
			File tempFile = new File(sourceFile.getPath().replaceAll("catalog", "temp"));
			checkFile(tempFile);
			try (BufferedReader fileReader = new BufferedReader(new FileReader(sourceFile));
					FileWriter fileWriter = new FileWriter(tempFile)) {
				String stringFromCatalog = readBookRecord(fileReader);
				for (Book book : books) {
					if (book.getId() == 0) {
						book.setId(++lastBookId);
					}
					String stringToWrite = BookView.prepareStringToWrite(book);
					while (!stringFromCatalog.isBlank()) {
						long bookFromCatalogId = getIdFromStringBook(stringFromCatalog);
						if (book.getId() > bookFromCatalogId) {
							fileWriter.write(stringFromCatalog);
							stringFromCatalog = readBookRecord(fileReader);
						} else {
							if (book.getId() == bookFromCatalogId) {
								stringFromCatalog = readBookRecord(fileReader);
							}
							break;
						}
					}
					fileWriter.write(stringToWrite);
				}
				while (!stringFromCatalog.isBlank()) {
					fileWriter.write(stringFromCatalog);
					stringFromCatalog = readBookRecord(fileReader);
				}

			} catch (IOException e) {
				throw new BookExceptionDAO("File 'catalog.txt' writing error", e);
			}
			changeSourceFile(tempFile);
		}
	}

	@Override
	public void writeBook(Book book) throws BookExceptionDAO {
		List<Book> books = new ArrayList<Book>();
		books.add(book);
		writeBooks(books);
	}

	@Override
	public boolean removeBooks(List<Long> booksId) throws BookExceptionDAO {
		boolean result = false;
		if (booksId != null && !booksId.isEmpty()) {			
			booksId.sort(null);
			checkFile(sourceFile);
			File tempFile = new File(sourceFile.getPath().replaceAll("catalog", "temp"));
			checkFile(tempFile);
			try (BufferedReader fileReader = new BufferedReader(new FileReader(sourceFile));
					FileWriter fileWriter = new FileWriter(tempFile)) {
				String stringFromCatalog = readBookRecord(fileReader);
				for (Long bookId : booksId) {
					while (!stringFromCatalog.isBlank()) {
						long bookFromCatalogId = getIdFromStringBook(stringFromCatalog);						
						if (bookId > bookFromCatalogId) {							
							fileWriter.write(stringFromCatalog);
							stringFromCatalog = readBookRecord(fileReader);
						} else {
							if (bookId == bookFromCatalogId) {								
								stringFromCatalog = readBookRecord(fileReader);
								result = true;
							}							
							break;							
						}
					}
				}
				while (!stringFromCatalog.isBlank()) {
					fileWriter.write(stringFromCatalog);
					stringFromCatalog = readBookRecord(fileReader);
				}

			} catch (IOException e) {
				throw new BookExceptionDAO("File 'catalog.txt' deleting records error", e);
			}
			changeSourceFile(tempFile);
		}
		return result;
	}

	@Override
	public boolean removeBook(Long bookId) throws BookExceptionDAO {
		List<Long> booksId = new ArrayList<Long>();
		booksId.add(bookId);
		return removeBooks(booksId);
	}

	private void checkFile(File fileSource) throws BookExceptionDAO {
		if (!fileSource.exists()) {
			try {
				fileSource.createNewFile();
			} catch (IOException e) {
				throw new BookExceptionDAO("File 'catalog.txt' creating error", e);
			}
		}
	}

	private void changeSourceFile(File tempFile) throws BookExceptionDAO {
		if (sourceFile.delete()) {
			tempFile.renameTo(sourceFile);
		} else {
			throw new BookExceptionDAO("Error delete temp file");
		}
	}

	private String readBookRecord(BufferedReader fileReader) throws IOException {
		StringBuilder builder = new StringBuilder();
		while (fileReader.ready()) {
			String readLine = fileReader.readLine();
			if (!readLine.isBlank()) {
				builder.append(readLine.trim());
				builder.append("\n");
			} else if (!builder.isEmpty())
				break;
		}
		builder.append("\n");
		return builder.toString();
	}

	private long getIdFromStringBook(String book) throws BookExceptionDAO {
		String[] properties = book.trim().split("\n");
		String[] splitedId = properties[0].trim().split("=");
		if (splitedId.length == 2) {
			return Long.valueOf(splitedId[1]);
		} else {
			throw new BookExceptionDAO("Wrong id record in catalog");
		}
	}

	private boolean stringMatchParams(Book bookParams, String stringFromCatalog) throws BookExceptionDAO {
		if (bookParams == null)
			return true;
		else {
			Book currentBook = parseBookFromFileRecord(stringFromCatalog);
			if (bookParams.getId() != 0 && bookParams.getId() != currentBook.getId())
				return false;
			if (bookParams.getTitle() != null && !bookParams.getTitle().equalsIgnoreCase(currentBook.getTitle()))
				return false;
			if (bookParams.getBookType() != null && !bookParams.getBookType().equals(currentBook.getBookType()))
				return false;
			if (bookParams.getAuthors() != null && !bookParams.getAuthors().isEmpty()) {
				StringBuilder authors = new StringBuilder();
				for (String author : bookParams.getAuthors()) {
					authors.append(author.toLowerCase());
					authors.append(", ");
				}
				for (String author : currentBook.getAuthors()) {
					if (!authors.toString().contains(author.toLowerCase()))
						return false;
				}
			}
		}
		return true;
	}

	private Book parseBookFromFileRecord(String bookString) throws BookExceptionDAO {
		Book book = new Book();
		String[] properties = bookString.trim().split("\n");
		if (properties.length >= 5) {
			for (String propertyString : properties) {
				String[] splitedProperty = propertyString.trim().split("=");
				if (splitedProperty.length == 2) {
					String propertyName = splitedProperty[0].trim();
					String propertyValue = splitedProperty[1].trim();
					if ("id".equals(propertyName)) {
						book.setId(Long.valueOf(propertyValue));
					} else if ("title".equals(propertyName)) {
						book.setTitle(propertyValue);
					} else if ("authors".equals(propertyName)) {
						String[] authors = propertyValue.split(",");
						if (authors.length != 0)
							for (String author : authors) {
								if (!author.isBlank())
									book.addAuthor(author);
							}
					} else if ("book type".equals(propertyName)) {
						book.setBookType(BookType.valueOf(propertyValue.toUpperCase()));
					} else if ("description".equals(propertyName)) {
						book.setDescription(propertyValue);
					}
				}
			}
		} else {
			throw new BookExceptionDAO("Error parsing Book record");
		}
		return book;
	}
}
