package StudentManagementSystem;

import java.util.List;

public class sms {
	private List<Student> enrolledStudent;
	public void enrollStudent(Student student)
	{
		enrolledStudent.add(student);
		System.out.println("Student has been successfully enrolled"+student.getName());
	}
	public void removeStudent1(Student student)
	{
		enrolledStudent.remove(student);
	}
	public void displayStudent()
	{
		System.out.println("Enrolled student");
		for(Student student : enrolledStudent)
		{
			System.out.println("Name:"+student.getName());
			System.out.println("ID:"+student.getId());
			System.out.println("Age:"+student.getage());
		}
		
	}
}