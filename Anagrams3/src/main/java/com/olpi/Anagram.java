package main.java.com.olpi;

import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter \"exit\" to close the program. \nWrite a text:");

		while (scan.hasNext()) {
			String initialText = scan.next();
			if (initialText.equalsIgnoreCase("exit")) {
				break;
			}
			String finishText = "";
			if (Reverse.hasNonLetters(initialText)) {
				finishText = Reverse.reverseOnlyLetters(initialText);
			} else {
				finishText = Reverse.reverseText(initialText);
			}
			System.out.print(finishText + " ");
		}
		scan.close();
	}
}
