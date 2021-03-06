package jp.test.run;

import static jp.co.run.NumberValid.*;

import org.junit.Test;

import junit.framework.TestCase;

public class NumberValidTest extends TestCase {


	@Test
	public void testIsIntegerNumber() {
		assertEquals(true, isIntegerNumber("123456"));
		assertEquals(false, isIntegerNumber("123456.123"));
		assertEquals(true, isIntegerNumber("+123456"));
		assertEquals(true, isIntegerNumber("-123456"));
		assertEquals(false, isIntegerNumber("+123456.123"));
		assertEquals(false, isIntegerNumber("-123456.123"));
		assertEquals(false, isIntegerNumber(".123"));
		assertEquals(false, isIntegerNumber("-.123"));
		
		assertEquals(false, isIntegerNumber(null));
		assertEquals(false, isIntegerNumber(""));
		assertEquals(false, isIntegerNumber("123a"));
	}

	@Test
	public void testIsFloatNumber() {
		assertEquals(true, isFloatNumber("123456"));
		assertEquals(true, isFloatNumber("123456.123"));
		assertEquals(true, isFloatNumber("+123456"));
		assertEquals(true, isFloatNumber("-123456"));
		assertEquals(true, isFloatNumber("+123456.123"));
		assertEquals(true, isFloatNumber("-123456.123"));
		assertEquals(true, isFloatNumber(".123"));
		assertEquals(true, isFloatNumber("-.123"));
		
		assertEquals(false, isFloatNumber(null));
		assertEquals(false, isFloatNumber(""));
		assertEquals(false, isFloatNumber("asd"));
	}

}
