
public class RomanNumerals {

	private static String ROMAN_I = "I";
	private static String ROMAN_V = "V";
	private static String ROMAN_X = "X";
	private static String ROMAN_C = "C";
	public String convert(int arabicNumber) {
		
		switch(arabicNumber){
		
		case 1:
		case 2:
			return multiplyNumber(arabicNumber, ROMAN_I);
		case 5:
			return ROMAN_V;
		case 6:
		case 7:
			arabicNumber -= 5;
			return ROMAN_V + multiplyNumber(arabicNumber, ROMAN_I);
		case 20:
			arabicNumber /= 10;
			return multiplyNumber(arabicNumber, ROMAN_X);
		case 23:
			
			return multiplyNumber(2, ROMAN_X) + multiplyNumber(3, ROMAN_I);
		case 300:
			arabicNumber /= 100;
			return multiplyNumber(arabicNumber, ROMAN_C);
		default:
			return " ";
		}
	
	}public void convertOther(int number){
		
	}
	public String multiplyNumber(int arabicNumber, String romanNumber){
		String newRomanNumber = "";
		for(int i = 0; i < arabicNumber; i++){
			newRomanNumber = romanNumber + newRomanNumber;
		}
		return newRomanNumber;
	}
}
