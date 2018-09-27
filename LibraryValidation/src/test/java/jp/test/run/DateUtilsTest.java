package jp.test.run;

import java.util.Date;

import static jp.co.run.DateUtils.*;
import org.junit.Test;

import junit.framework.TestCase;

public class DateUtilsTest extends TestCase{

	@Test
	public void testConvertDateToString() {
		assertEquals("2018-09-27", convertDateToString(new Date(), "yyyy-MM-dd"));
		assertEquals("", convertDateToString(null, ""));
		assertEquals("", convertDateToString(new Date(), null));
	}

	@Test
	public void testConvertStringToDate() {
		assertEquals(null, convertStringToDate(null, ""));
	}

	@Test
	public void testGetCurrentDate() {
		assertEquals("", getCurrentDate("", "Asia/Tokyo"));
		assertEquals("", getCurrentDate("dd/MM/yyyy", null));
		assertEquals("", getCurrentDate("dd/MM/yyyy", "123123123"));
		assertEquals("2018-09-27", getCurrentDate("yyyy-MM-dd", "Asia/Tokyo"));
	}

	@Test
	public void testGetLastDayOfMonth() {
		assertEquals("", getLastDayOfMonth(0, 0, ""));
		assertEquals("", getLastDayOfMonth(2018	, -5 , "dd/MM/yyyy"));
		assertEquals("", getLastDayOfMonth(2018, 10, "aasdgayd"));
		assertEquals("", getLastDayOfMonth(2018, 15, "aasdgayd"));
		assertEquals("29-02-2016", getLastDayOfMonth(2016, 2, "dd-MM-yyyy"));
		
	}
}
