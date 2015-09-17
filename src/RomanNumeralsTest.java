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
	public void testConverts5ToV(){
		
		roman = arabicNumber.convert(5);
		assertEquals(roman, "V");
	}
	
	@Test
	public void testConverts2ToII(){
		
		roman = arabicNumber.convert(3);
		assertEquals(roman, "III");
	}
	@Test
	public void testConverts6ToVI(){
		
		roman = arabicNumber.convert(6);
		assertEquals(roman, "VI");
	}
	
	@Test
	public void testConverts7ToVII(){
		
		roman = arabicNumber.convert(7);
		assertEquals(roman, "VII");
	}
	
	@Test
	public void testConverts20ToXX(){
		
		roman = arabicNumber.convert(20);
		assertEquals(roman, "XX");
	}
}
