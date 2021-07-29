package by.epamLearning.module6.task1.exception;

public class BookExceptionDAO extends Exception {

	private static final long serialVersionUID = 1L;

	public BookExceptionDAO() {
		super();
	}

	public BookExceptionDAO(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);

	}

	public BookExceptionDAO(String message, Throwable cause) {
		super(message, cause);
	}

	public BookExceptionDAO(String message) {
		super(message);
	}

	public BookExceptionDAO(Throwable cause) {
		super(cause);
	}

}
