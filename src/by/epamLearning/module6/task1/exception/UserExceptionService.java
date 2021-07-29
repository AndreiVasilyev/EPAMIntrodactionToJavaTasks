package by.epamLearning.module6.task1.exception;

public class UserExceptionService extends Exception {

	private static final long serialVersionUID = 1L;

	public UserExceptionService() {
		super();
	}

	public UserExceptionService(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public UserExceptionService(String message, Throwable cause) {
		super(message, cause);
	}

	public UserExceptionService(String message) {
		super(message);
	}

	public UserExceptionService(Throwable cause) {
		super(cause);
	}

}
