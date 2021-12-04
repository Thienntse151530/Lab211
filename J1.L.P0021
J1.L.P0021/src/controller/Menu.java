package controller;

import java.util.Scanner;

import service.Validation;

public class Menu {
	Validation validation = new Validation();
	public void menuStudentManagement() {
		while (true) {
			try (Scanner scanner = new Scanner(System.in)) {
				System.out.println("----- Create Student -----");
				System.out.println("1. Create");
				System.out.println("2. Find and Sort");
				System.out.println("3. Update/Delete");
				System.out.println("4. Report");
				System.out.println("5. Exit");
				String text  = "Enter option:";
				int option = validation.checkInputInt(text);
				switch (option) {
				case 1:
					
					break;

				case 2:

					break;
				case 3:

					break;
				case 4:

					break;
				case 5:

					return;
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}
}
