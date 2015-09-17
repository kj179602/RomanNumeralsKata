import static org.junit.Assert.*;

import org.junit.Test;


public class RomanNumeralsTest {

	@Test
	public void testConverts0ToABlankString() {
		String roman = number.convert(0);
		assertEquals(roman, " ");
	}

}
