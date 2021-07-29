package by.epamLearning.oop.task4.exception;

public class TreasureExceptionService extends Exception {

	private static final long serialVersionUID = 1L;

	public TreasureExceptionService() {
		super();
	}

	public TreasureExceptionService(String message, Throwable cause) {
		super(message, cause);
	}

	public TreasureExceptionService(String message) {
		super(message);
	}

	public TreasureExceptionService(Throwable cause) {
		super(cause);
	}
}
