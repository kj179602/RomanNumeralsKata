
public class RomanNumerals {

	public String convert(int arabicNumber) {
		
		switch(arabicNumber){
		
		case 1:
		case 2:
			return multiplyNumber(arabicNumber, "I");
		case 5:
			return "V";
		default:
			return " ";
		}
		
	}
	public String multiplyNumber(int arabicNumber, String romanNumber){
		String newRomanNumber = "";
		for(int i = 0; i < arabicNumber; i++){
			newRomanNumber = romanNumber + newRomanNumber;
		}
		return newRomanNumber;
	}
}
