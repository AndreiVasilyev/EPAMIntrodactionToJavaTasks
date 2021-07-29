package by.epamLearning.module6.task1.exception;

public class EmailExceptionService extends Exception {

	private static final long serialVersionUID = 1L;

	public EmailExceptionService() {
		super();
	}

	public EmailExceptionService(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public EmailExceptionService(String message, Throwable cause) {
		super(message, cause);
	}

	public EmailExceptionService(String message) {
		super(message);
	}

	public EmailExceptionService(Throwable cause) {
		super(cause);
	}
}
