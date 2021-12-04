package dao.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import dao.CourseDAO;
import entity.Course;
import service.Validation;

public class CourseDAOImpl implements CourseDAO{

	Validation val = new Validation();
	
	@Override
	public List<Course> createCourse(List<Course> courses) {
		while(true) {
			try (Scanner scanner = new Scanner(System.in)){
				System.out.println("----- Create Course -----");
				String inputId = "Enter id course:";
				int id = val.checkDulicateCourseId(courses, inputId);
				String inputName = "Enter name course:";
				String name = val.checkDulicateCourseName(courses, inputName);
				if(courses.add(new Course(id, name)) == true) {
					System.out.println("Add successfully");
					return courses;
				}
			} catch (Exception e) {
				
			}
		}
	}

}
