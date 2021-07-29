package by.epamLearning.module6.task1.exception;

public class BookExceptionService extends Exception {

	private static final long serialVersionUID = 1L;

	public BookExceptionService() {
		super();
	}

	public BookExceptionService(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public BookExceptionService(String message, Throwable cause) {
		super(message, cause);
	}

	public BookExceptionService(String message) {
		super(message);
	}

	public BookExceptionService(Throwable cause) {
		super(cause);
	}
}
