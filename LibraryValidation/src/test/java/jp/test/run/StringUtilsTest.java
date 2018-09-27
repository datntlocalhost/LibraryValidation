package jp.test.run;

import static jp.co.run.StringUtils.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import junit.framework.TestCase;

public class StringUtilsTest extends TestCase {

	List<String> list;
	
	@Override
	protected void setUp() throws Exception {
		list = new ArrayList<String>();
		list.add("foo");
	}
	
	@Test
	public void testNullToZero() {
		assertEquals("", nullToZero(null));
		assertEquals("[foo]", nullToZero(list));
	}

}
