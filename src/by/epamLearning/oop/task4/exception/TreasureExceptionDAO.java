package by.epamLearning.oop.task4.exception;


public class TreasureExceptionDAO extends Exception {

	private static final long serialVersionUID = 1L;

	public TreasureExceptionDAO() {
		super();
	}

	public TreasureExceptionDAO(String message, Throwable cause) {
		super(message, cause);
	}

	public TreasureExceptionDAO(String message) {
		super(message);
	}

	public TreasureExceptionDAO(Throwable cause) {
		super(cause);
	}

}
