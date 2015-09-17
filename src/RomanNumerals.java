
public class RomanNumerals {

	public String convert(int arabicNumber) {
		
		switch(arabicNumber){
		
		case 1:
		case 2:
			return multiplyNumber(arabicNumber, "I");
		case 5:
			return "V";
		case 6:
		case 7:
			return "V" + multiplyNumber(arabicNumber - 5, "I");
		case 20:
			return multiplyNumber(arabicNumber / 10, "X");
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
