package studentManagement;

import java.util.Scanner;

public class Course {
	int Course_Id;
	String Course_Name;
	String Course_start_date;
	String Course_end_date;
	
	public Course() {
		super();
		
	}

	public Course(int course_Id, String course_Name,String course_start_date ,String course_end_date) 
	{
		super();
		this.Course_Id = course_Id;
		this.Course_Name = course_Name;
		this.Course_start_date = course_start_date;
		this.Course_end_date = course_end_date;
		
	}


	@Override
	public String toString() {
		return "Course [Course_Id=" + Course_Id + ", Course_Name=" + Course_Name + ", Course_start_date=" + Course_start_date + ",Course_end_date=" + Course_end_date + "]";
	}

	public Course AddCourse() {
		Scanner Sc = new Scanner(System.in);
			System.out.println("The Student are Registerd");
			System.out.println("Enter Course Id");
			int Course_Id = Sc.nextInt();
			System.out.println("Enter Cource Name");
			String Course_Name = Sc.next();
			System.out.println("Course_start_date");
			String Course_start_date = Sc.next();
			System.out.println("Course_end_date");
			String Course_end_date = Sc.next();
			
		return new Course(Course_Id, Course_Name, Course_start_date, Course_end_date);

	}


}
