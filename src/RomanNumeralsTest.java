import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class RomanNumeralsTest {

	private RomanNumerals arabicNumber;
	private String roman;
	@Before
	public void setUp() throws Exception {
		arabicNumber = new RomanNumerals();
	}
	
	@Test
	public void testConverts0ToABlankString() {
		
		roman = arabicNumber.convert(0);
		assertEquals(roman, " ");
	}

	@Test
	public void testConverts1ToI(){
		
		roman = arabicNumber.convert(1);
		assertEquals(roman, "I");
	}
	
	@Test
	public void testConvrts5ToV(){
		
		roman = arabicNumber.convert(5);
		assertEquals(roman, "V");
	}
}
