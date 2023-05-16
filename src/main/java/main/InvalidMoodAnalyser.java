package main;

public class InvalidMoodAnalyser {
	private String message;
	/*
	 * Constructor
	 */
	public InvalidMoodAnalyser() {
//		this.message = message;
	}
	/*
	 * To analyse mood. 
	 */
	public   InvalidMoodAnalyser(String message)  {
		this.message = message;
	}
	
	public String analyzeMood() throws InvalidMoodException {
		try {
			if (message == null ) {
				throw new InvalidMoodException(InvalidMoodException.ExceptionType.EmptyMessage,"Message is empty");
			}
			if (message.contains("sad")) {
				return "SAD";
			}
			return "HAPPY";
		} catch (InvalidMoodException e) {
			throw new InvalidMoodException(InvalidMoodException.ExceptionType.NullMessage, "Enter message is null");
		}
	}

}
