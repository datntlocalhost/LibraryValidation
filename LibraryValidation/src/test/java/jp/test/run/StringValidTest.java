package jp.test.run;

import static jp.co.run.StringValid.*;

import org.junit.Test;

import junit.framework.TestCase;

public class StringValidTest extends TestCase {

	@Test
	public void testIsEmpty() {
		assertFalse(isEmpty(null));
		assertFalse(isEmpty("a"));
		assertTrue(isEmpty(""));
	}

	@Test
	public void testIsNotEmpty() {
		assertFalse(isNotEmpty(null));
		assertFalse(isNotEmpty(""));
		assertTrue(isNotEmpty("a"));
		assertTrue(isNotEmpty("    "));
	}

	@Test
	public void testIsBlank() {
		assertFalse(isBlank(null));
		assertFalse(isBlank("a"));
		assertFalse(isBlank("   a   "));
		assertTrue(isBlank(""));
		assertTrue(isBlank("    "));
	}

	@Test
	public void testIsNotBlank() {
		assertFalse(isNotBlank(null));
		assertFalse(isNotBlank(""));
		assertFalse(isNotBlank("    "));
		assertTrue(isNotBlank("a"));
		assertTrue(isNotBlank("   a   "));
	}

	@Test
	public void testIsMaxLength() {
		assertFalse(isMaxLength(null, 2));
		assertFalse(isMaxLength("", 2));
		assertFalse(isMaxLength("", 0));
		assertFalse(isMaxLength("a", 2));
		assertFalse(isMaxLength("a", -1));
		
		assertTrue(isMaxLength("a", 1));
	}

	@Test
	public void testIsKatakana() {
		assertTrue(isKatakana('ナ'));
		assertTrue(isKatakana('\u30A0'));
		assertTrue(isKatakana('\u30FF'));
		assertFalse(isKatakana('a'));
		assertFalse(isKatakana('\u309F'));
	}

	@Test
	public void testIsHiragana() {
		assertTrue(isHiragana('\u309F'));
		assertFalse(isHiragana('#'));
		assertFalse(isHiragana('ナ'));
	}

	@Test
	public void testIsKanji() {
		assertTrue(isKanji('常'));
		assertTrue(isKanji('字'));
		assertTrue(isKanji('\u3400'));
		assertFalse(isKanji('b'));
		assertFalse(isKanji('\u309F'));
	}

	@Test
	public void testIsCharacterTwoByteString() {
		assertFalse(isCharacterTwoByte(null));
		assertFalse(isCharacterTwoByte(""));
		assertFalse(isCharacterTwoByte("zxc"));
		assertFalse(isCharacterTwoByte("!@#$"));
		
		assertTrue(isCharacterTwoByte("asd常asd"));
		assertTrue(isCharacterTwoByte("常常常常常"));
	}

}
