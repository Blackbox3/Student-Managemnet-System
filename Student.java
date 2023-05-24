package StudentManagementSystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Student {

	private String studentName;
	private int studentId;
	private int studentAge;
	private  List<Integer> grades;
	
	Student (String studentName,int studentId,int studentAge)
	{
		this.studentName=studentName;
		this.studentId=studentId;
		this.studentAge=studentAge;
	}
	String getName()
	{
		return studentName;
	}
	int getId()
	{
		return studentId;
	}
	int getage()
	{
		return studentAge;
	}

	
}
