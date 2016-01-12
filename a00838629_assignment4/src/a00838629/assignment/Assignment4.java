package a00838629.assignment;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.HashMap;

import a00838629.assignment.dao.StudentDAO;
import a00838629.assignment.data.Student;
import a00838629.assignment.exceptions.DataInputException;

public class Assignment4 {
	public static void main(String[] args) {

		Assignment4 assignment = new Assignment4();
		try {
			assignment.test();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	 public void test() throws Exception{

		Student[] students = null;
		try {

			students = StudentDAO.readData("student_data.txt");
			
			StudentDAO.writeData(students, "output.txt");
		   
		} catch (DataInputException die) {
			die.printStackTrace();
		} catch (FileNotFoundException e) {
			
			
			e.printStackTrace();
		
		}

		}

	}
