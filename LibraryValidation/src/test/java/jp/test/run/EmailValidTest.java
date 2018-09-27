package jp.test.run;

import static jp.co.run.EmailValid.*;

import org.junit.Test;

import junit.framework.TestCase;

public class EmailValidTest extends TestCase {

	@Test
	public void testIsEmail() {
		assertTrue(isEmail("datnt@gmail.com"));
		assertTrue(isEmail("datnt@gmail.com.vn"));
		
		assertFalse(isEmail(""));
		assertFalse(isEmail(null));
		assertFalse(isEmail("datntgmail.com"));
		assertFalse(isEmail("datntgmai@"));
	}

}