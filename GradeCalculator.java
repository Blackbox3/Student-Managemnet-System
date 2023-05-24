package StudentManagementSystem;

import java.util.List;

public class GradeCalculator
{

	public int calculateGrade(List<Integer>grades)
	{
		int total=0,average=0;
		for(int grade:grades)
		{
			total=total+grade;
			average=total/grades.size();
		}
		return average;
	}
	public void calulatePercentage(List<Integer> grades)
	{
		
		int average=calculateGrade(grades);
	
	if(average>=80)
	{
System.out.println("distinction");
	}
	else if (average>=70 || average<80)
	{
		System.out.println("First Division");
	}
	else if (average>=60 || average<70)
	{
		System.out.println("Second Division");
	}
	else
	{
		System.out.println("Fail");
	}
	

	}
}


