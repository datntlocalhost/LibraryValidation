package jp.test.run;

import junit.framework.TestResult;
import junit.framework.TestSuite;

public class MainTest {
	
	public static void main(String[] args) {

		TestSuite testSuite = new TestSuite(DateValidTest.class, DateUtilsTest.class, EmailValidTest.class, 
				NumberValidTest.class, FileValidTest.class, StringUtilsTest.class, StringValidTest.class);
		TestResult testResult = new TestResult();
		
		testSuite.run(testResult);
		
		System.out.println(testResult.wasSuccessful());
	}

}
