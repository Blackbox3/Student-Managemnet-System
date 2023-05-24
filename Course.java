package StudentManagementSystem;
import java.util.List;

public class Course {



	
		private String courseName;
		private int maxStudents;
		private List<Student> enrollStudent;
		
	    public Course(String courseName,int maxStudents,List<Student> enrollStudent)
	    {
	    	this.courseName=courseName;
	    	this.maxStudents=maxStudents;
	    	this.enrollStudent=enrollStudent;
	    }
		String getCourseName()
		{
			return courseName;
		}
		int getmaxStudents()
		{
			return maxStudents;
			
		}
		

	}
