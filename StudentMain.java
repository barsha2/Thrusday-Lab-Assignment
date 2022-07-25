package StudentManagementSystem;

import java.util.Scanner;

public class StudentMain 
{
	public static void main(String args[])
	{
		int choice;
		Scanner s = new Scanner(System.in);
		do
		{
			System.out.println("welcome to student management system");
			System.out.println("Press 1. for Add student\n press 2. for get student by id\n press 3. for gett all student details\n press 4. for delete student\n press 5. for update details\n 6. quit");
			
			System.out.println("Enter your choice");
			
			choice=s.nextInt();
			
			switch(choice)
			{
			case 1:
				StudentService.addStudent();
				break;
				
			case 2:
				System.out.println("Enter id");
				int StdId=s.nextInt();
				try
				{
					StudentService.getStudentById(StdId);
				}
				catch(StudentNotFoundException sn)
				{
					System.out.println(sn.getMessage());
				}
				break;
				
			case 3:
				StudentService.getAllStudent();
			case 4:
				System.out.println("Enter id");
				int stdId=s.nextInt();
				try
				{
					StudentService.deleteByID(stdId);
				}
				catch(StudentNotFoundException sf)
				{
					System.out.println(sf.getMessage());
				}
				break;
			case 5:
				
			case 6:
				break;
			}
		}
		while(choice!=6);
	}
}
