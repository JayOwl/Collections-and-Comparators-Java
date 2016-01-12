package a00838629.assignment.dao;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import com.sun.javafx.collections.MappingChange.Map;

import a00838629.assignment.data.Student;
import a00838629.assignment.data.StudentMarks;
import a00838629.assignment.exceptions.DataInputException;
import a00838629.assignment.ui.UIDisplay;

public class StudentDAO {
	
	
		public StudentDAO() { }
		
		
		/**
		Reads input file and objects for student objects to return to array
		it will input strings into the file to return student objects to be 
		a student array list.
		*/
		
		
		public static ArrayList<Student> readFile(String inputPath) throws Exception {
			
			File file = new File(inputPath);
			ArrayList<Student> studentArray = new ArrayList<Student>();
			Scanner scanner = new Scanner(file);
			while (scanner.hasNext()) {
				String[] info = scanner.next().split("\\|");
				if (info.length != 6) {
					scanner.close();
					throw new DataInputException("You didn`t fill these in right");
				}
				else {
					try {
						studentArray.add(new Student());
					}
					catch (Exception e){
						scanner.close();
						throw new DataInputException("Check your spelling buddy");
					}
				}
			}
			scanner.close();
			return studentArray;
		}
		
		/**
		 * Writes student info to the output file and throws the exception
		 */
		public static void writeFile(String outputPath, ArrayList<Student> students) throws Exception {
			
			File file = new File(outputPath);
			PrintWriter output = new PrintWriter(file);

			for (Student student : students) {
				output.println(student.getFullName());
				output.println(student.getStudentID());
				output.println("Quizzes: " + student.getTheMarks().getQuizzes());
				output.println("Assignments: " + student.getTheMarks().getAssignments());
				output.println("Exams: " + student.getTheMarks().getExams() + "\n");
				
			}
			output.close();
		}

		public static Student[] readData(String string) {
			return null;
			// TODO Auto-generated method stub
			
		}



		public static void writeData(Object readData, String string) {
			// TODO Auto-generated method stub
			
		}

	}
