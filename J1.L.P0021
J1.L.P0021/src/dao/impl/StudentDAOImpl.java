package dao.impl;

import java.util.List;
import java.util.Scanner;

import dao.StudentDAO;
import entity.Student;

public class StudentDAOImpl implements StudentDAO{

	@Override
	public List<Student> createStudent() {
		try (Scanner scanner = new Scanner(System.in)){
			System.out.println("----- Create Student -----");
			System.out.print("Enter id student:");
			System.out.print("Enter name student:");
			System.out.print("Enter semester:");
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}

}
