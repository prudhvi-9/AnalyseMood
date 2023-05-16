package main;

public class InvalidMoodException extends Exception {

	private static final long serialVersionUID = 1L;
	static ExceptionType type;

	public enum ExceptionType {
		NullMessage, EmptyMessage
	}

	/*
	 * Constructor.
	 */
	public InvalidMoodException(ExceptionType type, String message) {
		super(message);
		InvalidMoodException.type = type;
	}

	public static ExceptionType getType() {
		return type;
	}
}
