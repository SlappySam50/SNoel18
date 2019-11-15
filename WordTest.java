package application;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * This Class is also for J-Unit Testing
 * @author Samuel
 *
 */
class WordTest {

	@Test
	void wordTest() {
		Words jTest =  new Words();
		int result = jTest.addTimes(12, 15);
		assertEquals(27, result);
	}

}
