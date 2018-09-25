package jp.co.run;

public class EmailValid {

	/**
	 * Check a email input is valid email format.
	 * Change the regex to: ^[^\s\W@]+@[^\s\W@]+\.[^\s@]+$ to use in javascript
	 * or orther language.
	 * 
	 * @param email
	 *        The email to check. Can not be null
	 * @return true if email is valid email format, else return false.
	 */
	public static boolean isEmail(String email) {
		String regex = "^[^\\s\\W@]+@[^\\s\\W@]+\\.[^\\s@]+$";
		
		return !StringValid.isNullOrEmpty(email) && email.matches(regex);
	}
}
