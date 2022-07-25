package StudentManagementSystem;

import java.util.Scanner;

public class StudentService 
{
	
	static student s[]= new student[10];
	static Scanner sc = new Scanner(System.in);
	static int index=0;
	
	public static void addStudent()
	{
		int StdId;
		String Name, address;
		System.out.println("Enter student details");
		
		System.out.println("Enter student id");
		StdId=sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("Enter student name: ");
		Name=sc.nextLine();
		
		System.out.println("Enter Student Address");
		address=sc.nextLine();
		
		s[index]=new student(StdId, Name, address);
		index++;
		
		System.out.println("Student details has successfully added");
		
	}
	public static void getStudentById(int stdId)throws StudentNotFoundException
	{
		boolean f=false;
		for(int i=0; i<index; i++)
		{
			if(stdId==s[i].getStdId())
			{
				System.out.println("Student id: " + s[i].getStdId());
				System.out.println("Student Name: " + s[i].getName());
				System.out.println("Student address:" + s[i].getAddress());
				f=true;
				break;
			}
			
		}
		if(f==false)
		{
			throw new StudentNotFoundException("Student Not found with id" +stdId);
		}
	}
	
	public static void getAllStudent() 
	{
		for(int i=0; i<index; i++)
		{
			System.out.println("Student id: " +s[i].getStdId());
			System.out.println("Student Name: " + s[i].getName());
			System.out.println("Student address:" + s[i].getAddress());
		}
		
	}
	public static void deleteByID(int stdId) throws StudentNotFoundException
	{
		boolean f=false;
		for(int i =0; i<index; i++)
		{
			if(stdId==s[i].getStdId())
			{
				s[i]=null;
				f=true;
				break;
			}
		}
		
		if(f==false)
		{
			throw new StudentNotFoundException("Student Not found with id" +stdId);
		}
	}
	public static void updateDetils(int stdId)
	{
		boolean f = false;
		for(int i=0; i<index; i++)
		{
			if(stdId==s[i].getStdId())
			{
				
			}
		}
	}
}
