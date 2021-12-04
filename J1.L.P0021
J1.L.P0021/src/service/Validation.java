package service;

import java.util.Scanner;

public class Validation {
	public int checkInputInt(String text) {
		int result;
		while(true) {
			try(Scanner scanner = new Scanner(System.in)) {
				System.out.println(text);
				result = Integer.parseInt(scanner.nextLine());
				if(result > 0) {
					return result;
				}
				else {
					System.err.println("Please enter a natural number!!!");
				}
			} catch (Exception e) {
				System.err.println("Please enter an integer number!!!");
			}
		}
	}
}
