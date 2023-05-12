package testCases;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;
import main.AnalyseMood;

public class AnalyseMoodTestCase {

	/*
	 * A new object user is created.
	 */

	AnalyseMood user = new AnalyseMood();

	/*
	 * Junit Test for happy mood.
	 */
	@Test
	public void happyMood() {

		String mood = user.analyzeMood("I am in  mood");

		assertEquals("HAPPY", mood);
	}

	/*
	 * Junit Test for sad mood.
	 */
	@Test
	public void sadMood() {

		String mood = user.analyzeMood("I am in sad mood");

		assertEquals("SAD", mood);
	}

}
