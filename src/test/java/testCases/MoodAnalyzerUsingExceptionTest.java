package testCases;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import main.MoodAnalyzerUsingException;
import main.NullException;

public class MoodAnalyzerUsingExceptionTest {
	/*
	 * Junit Test for Given Null Mood Should Return Happy.
	 */
	@Test
	public void GivenNullMoodShouldReturnHappy() throws NullException {
		/*
		 * A new object moodAnalyzer is created.
		 */
		MoodAnalyzerUsingException moodAnalyzer = new MoodAnalyzerUsingException("");
		String mood = moodAnalyzer.analyseMood();
		assertEquals("HAPPY", mood);
	}
}
