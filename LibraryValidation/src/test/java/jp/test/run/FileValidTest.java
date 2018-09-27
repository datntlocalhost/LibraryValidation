package jp.test.run;

import static jp.co.run.FileValid.*;

import org.junit.Test;

import junit.framework.TestCase;

public class FileValidTest extends TestCase {

	@Test
	public void testIsFile() {
		assertEquals(true, isFile("C:\\Users\\datnt\\OneDrive\\Documents", "test.txt"));
		
		assertEquals(false, isFile("", null));
		assertEquals(false, isFile("empty", null));
		assertEquals(false, isFile("C:\\Users\\datnt\\OneDrive\\Documents", "empty"));
		assertEquals(false, isFile("C:\\Users\\datnt\\OneDrive\\Documents", null));
	}

}