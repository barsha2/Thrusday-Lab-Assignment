package Oops;

//Employee class
class Employeess
{
	public long employeeId;     
	public String employeeName;  
	public String employeeAdd;
	public long employeePh;           
	public double basicSalary;
	static double specialallowence = 250.80;
	static double hra = 1000.50;
	
	// constructor for initialize variable
	
	public Employeess(long employeeId, String employeeName, String employeeAdd, long employeePh, double basicSalary)
	{
		super();
		this.employeeId = employeeId;
		this.employeeName= employeeName;
		this.employeeAdd= employeeAdd;
		this.employeePh=employeePh;
		this.basicSalary=basicSalary;
	}
	public void CalculateSalary()  // method for calculate salary
	{
		double salary;
		salary = basicSalary+(basicSalary*specialallowence/100) + (basicSalary*hra/100);
		System.out.println("The salary is: " + salary);
	}
	public void CalculateTransportAllowance()  // method for calculate transport allowence
	{
		double tp;
		tp = 0.1*basicSalary;
		System.out.println("The transport allowence is: "+tp);
	}
} // end of employee class
class Manager extends Employeess // child class Manager
{
	public Manager(long employeeId, String employeeName, String employeeAdd, long employeePh, double basicSalary)
	{
	
	    super(employeeId, employeeName, employeeAdd, employeePh, basicSalary);
	}	
	public void CalculateTransportAllowance() // method overriding for calculate transport allowance for manager
	{
		double tp;
		tp = 0.15*basicSalary;
		System.out.println("The transport allowence is: "+tp);
	}
} // end of manager class
class Trainee extends Employeess// child class trainee
{
	public Trainee(long employeeId, String employeeName, String employeeAdd, long employeePh, double basicSalary)
	{
	
		super(employeeId, employeeName, employeeAdd, employeePh, basicSalary);
	}	
	
} // end of trainee class

public class SalaryCalculation 
{
	public static void main(String args[]) //main method
	{
		Manager manager = new Manager(126534, "Peter", "Chennai India", 237844, 65000);
		Trainee trainee = new Trainee(29846, "Jack", "Mumbai India", 442085, 45000);
		manager.CalculateSalary();
		manager.CalculateSalary();
		manager.CalculateTransportAllowance();
		trainee.CalculateTransportAllowance();
	}
}
