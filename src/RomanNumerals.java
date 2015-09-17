
public class RomanNumerals {

	public String convert(int number) {
		
		if(number == 0){
			return " ";
		}
		else if(number == 1 || number == 2){
			
			return multiplyNumber(number, "I");
		}
		else{
			return "V";
		}
	}
	public String multiplyNumber(int number, String romanNumber){
		String newNumber = "";
		for(int i = 0; i< number; i++){
			newNumber = romanNumber + newNumber;
		}
		return newNumber;
	}
}
