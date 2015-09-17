import static org.junit.Assert.*;

import org.junit.Test;


public class RomanNumeralsTest {

	@Test
	public void testConverts0ToABlankString() {
		RomanNumerals number = new RomanNumerals();
		String roman = number.convert(0);
		assertEquals(roman, " ");
	}

}
