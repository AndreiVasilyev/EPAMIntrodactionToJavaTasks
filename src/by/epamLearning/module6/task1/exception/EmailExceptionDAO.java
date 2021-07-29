package by.epamLearning.module6.task1.exception;

public class EmailExceptionDAO extends Exception {

	private static final long serialVersionUID = 1L;

	public EmailExceptionDAO() {
		super();
	}

	public EmailExceptionDAO(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public EmailExceptionDAO(String message, Throwable cause) {
		super(message, cause);
	}

	public EmailExceptionDAO(String message) {
		super(message);
	}

	public EmailExceptionDAO(Throwable cause) {
		super(cause);
	}

}
