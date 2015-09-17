
public class RomanNumerals {

	public String convert(int number) {
		
		if(number == 0){
			return " ";
		}
		else if(number == 1){
			return "I";
		}
		else{
			return "V";
		}
	}

}
