package service;

import java.util.List;
import java.util.Scanner;

import entity.Course;

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
	
	public int checkDulicateCourseId(List<Course> courses, String text) {
		int count =0;
		while(true) {
			int result = checkInputInt(text);
			for (Course course : courses) {
				if(result != course.getcId()) {
					return result;
				}
				count += 1;
			}
			if(count > 0) {
				System.err.println("Id is exist!!!");
			}
		}
	}
	
	public String checkInputName(String text) {
		String result;
		while(true) {
			try (Scanner scanner = new Scanner(System.in)){
				System.out.println(text);
				result = scanner.nextLine();
				if(result.matches("[A-Z][a-z]*")== true) {
					if(result.length() < 11) {
						return result;
					}else {
						System.err.println("Name must be shorter than 11 character!!!");
					}
				}else {
					System.err.println("Name must be character A-Z & a-z!!!");
				}
			} catch (Exception e) {
				System.err.println("Error!!!");
			}
		}
	}
	
	public String checkDulicateCourseName(List<Course> courses, String text) {
		int count =0;
		while(true) {
			String result = checkInputName(text);
			for (Course course : courses) {
				if(!result.equalsIgnoreCase(course.getcName())) {
					return result;
				}
				count += 1;
			}
			if(count > 0) {
				System.err.println("Name is exist!!!");
			}
		}
	}
}
