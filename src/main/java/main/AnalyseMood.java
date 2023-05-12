package main;

public class AnalyseMood {

	String message;

	/*
	 * To analyse the mood.
	 */
	public String analyzeMood(String message) {

		if (message.contains("sad")) {

			return "SAD";

		} else {

			return "HAPPY";

		}
	}
}
