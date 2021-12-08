package main;

import java.util.ArrayList;
import java.util.Scanner;

public class ReverseManagement {

	static ArrayList<Integer> listOfIndexOfDot = new ArrayList<Integer>();

	/**
	 * @param args the command line arguments
	 */
	public static StringBuilder reverseStringOutOfDot(String s) {
		String[] arrayOfString = s.split(" ");
		StringBuilder stringBuilder = new StringBuilder();
		for (int i = arrayOfString.length - 1; i >= 0; i--) {
			int indexOfDot = arrayOfString[i].indexOf(".");
			String temp = arrayOfString[i];
			if (indexOfDot != -1) {
				listOfIndexOfDot.add(i);
				temp = arrayOfString[i].replace(".", "");
			}
			stringBuilder.append(temp);
			stringBuilder.append(" ");
		}
		return stringBuilder;
	}

	public static StringBuilder reverse(StringBuilder s) {
		String[] arrayOfString = s.toString().split(" ");
		StringBuilder stringBuilder = new StringBuilder();
		arrayOfString[0] = arrayOfString[0].replace(arrayOfString[0].charAt(0),
				Character.toUpperCase(arrayOfString[0].charAt(0)));
		for (int i = 0; i < arrayOfString.length; i++) {
			String temp = arrayOfString[i];
			for (Integer index : listOfIndexOfDot) {
				if (index == i) {
					temp = temp + ".";
					arrayOfString[i + 1] = arrayOfString[i + 1].replace(arrayOfString[i + 1].charAt(0),
							Character.toUpperCase(arrayOfString[i + 1].charAt(0)));
				}
			}
			stringBuilder.append(temp);
			stringBuilder.append(" ");
		}
		return stringBuilder;
	}

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			StringBuilder stringBuilder = new StringBuilder();

			String s;
			System.out.println("Enter String: ");
			s = scanner.nextLine();
			while (s.replaceAll(" ", "").equals("")) {
				System.out.println("String null, enter String again: ");
				s = scanner.nextLine();
			}
			stringBuilder = reverse(reverseStringOutOfDot(s));
			System.out.println(stringBuilder);

		} catch (Exception e) {
			System.err.println("Error");
		}
	}
}