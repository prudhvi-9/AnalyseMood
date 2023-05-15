package main;

import main.NullException;

public class MoodAnalyzerUsingException {
	/**
	 * Message Field.
	 */
	private String message;

	/*
	 * Default Constructor.
	 */
	public MoodAnalyzerUsingException() {
//			this.message = message;
	}

	/*
	 * Constructor with parameter.
	 */
	public MoodAnalyzerUsingException(String message) {
		this.message = message;
	}

	/*
	 * To analyse the mood.
	 */
	public String analyseMood() throws NullException {
		try {
			if (message.length() == 0) {
				throw new NullException(" Enter proper message");
			}
			if (message.contains("sad")) {
				return "SAD";
			}
			return "HAPPY";
		} catch (NullPointerException e) {
			throw new NullException("please enter proper message");
		}
	}
}
