package testCases;

import org.junit.Test;
import main.InvalidMoodAnalyser;
import main.InvalidMoodException;
import org.junit.jupiter.api.Assertions;

public class InvalidMoodExceptionTest {
	/*
	 * Junit Test For Given Sad Message Should Return Sad Message.
	 */
	@Test
	public void givenSadMessageShouldReturnSadMessage() throws InvalidMoodException {
		InvalidMoodAnalyser moodAnalyzer = new InvalidMoodAnalyser("I am in sad mood");
		String mood = moodAnalyzer.analyzeMood();
		Assertions.assertEquals("SAD", mood);
	}

	/*
	 * Junit Test For Given Happy Message Should Return Happy Message.
	 */
	@Test
	public void givenHappyMassageShouldReturnHappyMessage() throws InvalidMoodException {
		InvalidMoodAnalyser moodAnalyzer = new InvalidMoodAnalyser("I am in happy mood");
		String mood = moodAnalyzer.analyzeMood();
		Assertions.assertEquals("HAPPY", mood);
	}

	/*
	 * Junit Test For Given Any Message Should Return Happy Message.
	 */
	@Test
	public void givenAnyMassageShouldReturnHappyMessage() throws InvalidMoodException {
		InvalidMoodAnalyser moodAnalyzer = new InvalidMoodAnalyser("I am in any mood");
		String mood = moodAnalyzer.analyzeMood();
		Assertions.assertEquals("HAPPY", mood);
	}

	/*
	 * Junit Test For Given Null Message Should  Throw CustomException.
	 */
	@Test
	public void givenNullMassageShouldReturnHappyMessage() throws InvalidMoodException {
		InvalidMoodAnalyser moodAnalyzer = new InvalidMoodAnalyser(null);

		try {
			moodAnalyzer.analyzeMood();
		} catch (InvalidMoodException e) {
			Assertions.assertEquals(InvalidMoodException.ExceptionType.NullMessage, e.getType());
			System.out.println(e);

		}
	}

	/*
	 * Junit Test For Given Empty Message Should  Throw CustomException.
	 */
	@Test
	public void givenEmptyMessageShouldReturnThrowCustomException() throws InvalidMoodException {
		InvalidMoodAnalyser moodAnalyzer = new InvalidMoodAnalyser(" ");

		try {
			moodAnalyzer.analyzeMood();
		} catch (InvalidMoodException e) {
			Assertions.assertEquals(InvalidMoodException.ExceptionType.EmptyMessage, e.getType());
			System.out.println(e);

		}
	}
}
