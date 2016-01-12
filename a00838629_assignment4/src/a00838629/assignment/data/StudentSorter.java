package a00838629.assignment.data;

import java.util.Comparator;

/* these are our fancy sorting methods we are going to call.  */


public class StudentSorter {	
	public static class SortByFirstName implements Comparator<Student>{
		public int compare(Student s1, Student s2){	
			return s1.getLastName().compareTo(s2.getLastName());
		}
			
	public static class SortByLastName implements Comparator<Student>{
		public int compare(Student s1, Student s2){							
			return s1.getLastName().compareTo(s2.getLastName());
		}
	public static class SortByID implements Comparator<Student>{
		public int compare(Student s1, Student s2){							
			return s1.getStudentID().compareTo(s2.getStudentID());
			}
	}
		
	}
	}
		
}


