import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MissingNumberTest {

	@Test
	void missedNumberTest() {
		MissingNumber missingNumber = new MissingNumber();
		assertArrayEquals(new int[]{1,4},missingNumber.findMissingNo("3 5 6 7"));
	}

}
