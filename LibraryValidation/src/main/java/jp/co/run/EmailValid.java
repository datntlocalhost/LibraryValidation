package jp.co.run;

public class EmailValid {

	/**
	 * Check a email input is valid email format.
	 * 
	 * @param email
	 *        The email to check.
	 * @return true if email is valid email format, else return false.
	 */
	public static boolean isEmail(String email) {
		String regex = "^[^\\s\\W@]+@[^\\s\\W@]+\\.[^\\s@]+$";
		return email.matches(regex);
	}
}
