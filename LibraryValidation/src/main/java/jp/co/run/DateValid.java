package jp.co.run;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateValid {

	public static boolean isDate(String date, String pattern) {
		DateFormat dateFormat = null;
			
		try {
			dateFormat = new SimpleDateFormat(pattern);
			dateFormat.format(date);
			return true;
		} catch (Exception e) {}
		
		return false;
	}
	
	/**
	 * Check if date to is larger than date from.
	 * 
	 * @param dateTo
	 *        Date object to check.
	 * @param dateFrom
	 *        Date object to check.
	 * @return true if dateTo < dateFrom, else return false.
	 */
	public static boolean isDateFromTo(Date dateTo, Date dateFrom) {
		int result = DateUtils.compareDate(dateTo, dateFrom);
		
		if (result == -1) {
			return true;
		}
		return false;
	}
	
	/**
	 * Check if date to is larger than date from.
	 * 
	 * @param dateTo
	 *        Date string to check.
	 * @param dateFrom
	 *        Date string to check.
	 * @param pattern
	 *        The pattern for simple date format.
	 * @return true if dateTo < dateFrom, else return false.
	 */
	public static boolean isDateFromTo(String dateTo, String dateFrom, String pattern) {
		if (!isDate(dateTo, pattern) || !isDate(dateFrom, pattern)) {
			return false;
		}
		
		int result = DateUtils.compareDate(dateTo, dateFrom, pattern);
		
		if (result == -1) {
			return true;
		}
		return false;
	}
}
