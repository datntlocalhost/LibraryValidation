package jp.test.run;

import java.util.Date;

import static jp.co.run.DateValid.*;

import org.junit.Test;

import junit.framework.TestCase;

public class DateValidTest extends TestCase{
	
	Date date1;
	Date date2;
	Date date3; 
	
	@Override
	protected void setUp() throws Exception {
		long time = System.currentTimeMillis();
		date1 = new Date(time);
		date2 = new Date(time);
		date3 = new Date(time + 1000);
	}
	
	@Override
	protected void tearDown() throws Exception {
	}
	
	@Test
	public void testIsDate() {
		assertFalse(isDate(null, null));
		assertFalse(isDate("", ""));
		assertFalse(isDate("07/2018", "dd/MM"));
		assertTrue(isDate("2018-08-07", "yyyy-MM-dd"));
	}

	@Test
	public void testIsFormatDate() {
		assertFalse(isFormatDate("2018/30/30", "yyyy/MM/dd"));
		assertTrue(isFormatDate("07/07/2018", "dd/MM/yyyy"));
	}

	@Test
	public void testIsDateFromToDateDate() {		
		assertTrue(isDateFromTo(null, null));
		assertFalse(isDateFromTo(date1, date2));
		assertFalse(isDateFromTo(date3, date2));
		assertTrue(isDateFromTo(date1, date3));
	}

	@Test
	public void testIsDateFromToStringStringString() {
		assertTrue(isDateFromTo("", null, null));
		assertTrue(isDateFromTo("", "", ""));
		assertTrue(isDateFromTo("01/01/2018", "02/02/2018", "dd/MM/yyyy"));
		assertFalse(isDateFromTo("02/02/2018", "02/02/2018", "dd/MM/yyyy"));
		assertFalse(isDateFromTo("02/02/2018", "02/01/2018", "dd/MM/yyyy"));
	}

}
