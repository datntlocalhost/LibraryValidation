package jp.co.run;

public class NumberValid {
	
	/**
	 * Check if a string is number format, can not be empty or null.
	 * 
	 * @param number
	 *        The string to check.
	 * @return true if a string is number format, else return false.
	 */
	public static boolean isNumber(String number) {
		
		//The regex just allow a string contain numeric character.
		String regex = "^[0-9]*$";
		
		if (StringValid.isBlank(number)) {
			return false;
		}
		
		return number.matches(regex);
	}
	
	/**
	 * Check if a string is integer number.
	 * 
	 * @param number
	 *        The string to check.
	 * @return true if the string is integer number, else return false.
	 */
	public static boolean isIntegerNumber(String number) {
		try {
			
			Integer.parseInt(number);
			return true;
			
		} catch (Exception e) {}
		return false;
	}
	
	/**
	 * Check if a string is float number format.
	 * 
	 * @param number
	 *        The string to check.
	 * @return true if the string is float number format, else return false.
	 */
	public static boolean isFloatNumber(String number) {
		try {
			
			Float.parseFloat(number);
			return true;
			
		} catch (NumberFormatException e) {}
		
		return false;
	}
}
