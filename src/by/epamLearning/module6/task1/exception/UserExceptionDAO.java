package by.epamLearning.module6.task1.exception;

public class UserExceptionDAO extends Exception {

	private static final long serialVersionUID = 1L;

	public UserExceptionDAO() {
		super();
	}

	public UserExceptionDAO(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public UserExceptionDAO(String message, Throwable cause) {
		super(message, cause);
	}

	public UserExceptionDAO(String message) {
		super(message);
	}

	public UserExceptionDAO(Throwable cause) {
		super(cause);
	}

}
