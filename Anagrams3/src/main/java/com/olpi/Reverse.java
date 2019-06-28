package main.java.com.olpi;

public class Reverse {

	public static boolean hasNonLetters(String initialText) {
		if (initialText == null) {
			return false;
		}
		for (int i = 0; i < initialText.length(); i++) {
			char ch = initialText.charAt(i);
			if (!Character.isLetter(ch)) {
				return true;
			}
		}
		return false;
	}

	public static String reverseOnlyLetters(String initialText) {
		if (initialText == null) {
			return "The text does not exist!";
		}
		String reverseText = reverseStringByWord(initialText);
		String resultText = insertNonLetterToReverseText(initialText, reverseText);

		return resultText;
	}

	public static String reverseText(String initialText) {
		if (initialText == null) {
			return "The text does not exist!";
		}
		String resultText = "";
		for (int i = initialText.length() - 1; i >= 0; i--) {
			resultText += initialText.charAt(i);
		}
		return resultText;
	}

	private static String reverseStringByWord(String initialText) {
		String reverseText = "";
		for (int i = initialText.length() - 1; i >= 0; i--) {
			char ch = initialText.charAt(i);
			if (Character.isLetter(ch)) {
				reverseText += ch;
			}
		}
		return reverseText;
	}

	private static String insertNonLetterToReverseText(String initialText, String reverseText) {
		for (int i = 0; i < initialText.length(); i++) {
			String str = "";
			char ch = initialText.charAt(i);
			if (!Character.isLetter(ch)) {
				str = reverseText.substring(0, i);
				str += ch;
				str += reverseText.substring(i);
				reverseText = str;
			}
		}
		return reverseText;
	}
}
