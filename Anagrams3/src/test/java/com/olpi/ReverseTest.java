package test.java.com.olpi;

import static org.junit.Assert.*;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

import main.java.com.olpi.Reverse;

import org.junit.Test;

public class ReverseTest {

	@Test
    public void testHasNonLettersTrue() {
		String actual = "edrf56yh";
		boolean expected = true;
		assertEquals(expected, Reverse.hasNonLetters(actual));
	}

	@Test
	public void testHasNonLettersFalse() {
		String actual = "rgthyhr";
		boolean expected = false;
		assertEquals(expected, Reverse.hasNonLetters(actual));
	}

	@Test
	public void testHasNonLettersNull() {
		String actual = null;
		boolean expected = false;
		assertEquals(expected, Reverse.hasNonLetters(actual));
	}

	@Test
	public void testReverseOnlyLettersYes() {
		String actual = "yhuj#2uf";
		String expected = "fuju#2hy";
		assertEquals(expected, Reverse.reverseOnlyLetters(actual));
	}

	@Test
	public void testReverseOnlyLettersNo() {
		String actual = "abcdef";
		String expected = "fedcba";
		assertEquals(expected, Reverse.reverseText(actual));
	}

	@Test
	public void testReverseOnlyLettersNull() {
		String actual = null;
		String expected = "The text does not exist!";
		assertEquals(expected, Reverse.reverseOnlyLetters(actual));
	}

	@Test
	public void testReverseText() {
		String actual = "rftyhujik";
		String expected = "kijuhytfr";
		assertEquals(expected, Reverse.reverseText(actual));
	}

	@Test
	public void testReverseTextNull() {
		String actual = null;
		String expected = "The text does not exist!";
		assertEquals(expected, Reverse.reverseOnlyLetters(actual));
	}

	public static void main(String[] args) throws Exception {
		JUnitCore runner = new JUnitCore();
		Result result = runner.run(ReverseTest.class);
		System.out.println("run tests: " + result.getRunCount());
		System.out.println("failed tests: " + result.getFailureCount());
		System.out.println("ignored tests: " + result.getIgnoreCount());
		System.out.println("success: " + result.wasSuccessful());
	}
}
