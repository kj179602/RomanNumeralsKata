import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class RomanNumeralsTest {

	private RomanNumerals arabicNumber;
	
	@Before
	public void setUp() throws Exception {
		arabicNumber = new RomanNumerals();
	}
	@Test
	public void testConverts0ToABlankString() {
		
		String roman = arabicNumber.convert(0);
		assertEquals(roman, " ");
	}

}
