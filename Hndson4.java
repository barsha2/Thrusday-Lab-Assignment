package Oopsinheritance;

interface LibraryUser
{
	void registerAccount();
	void requestBook();
}
class KidUsers implements LibraryUser
{
	private int age;
	private String bookType;
	public KidUsers(int age, String bookType)
	{
		this.age=age;
		this.bookType=bookType;
	}
	
	@Override
	public void registerAccount() 
	{
		if(age<12)
		{
			System.out.println("you've successfully registerd under a Kids Account");
		}
		else
		{
			System.out.println("Sorry, Age must be less than 12 to register as a kid");
		}
		
	}
	@Override
	public void requestBook() 
	{
		if(bookType=="kids")
		{
			System.out.println("Book issued successfully, please return within 10 days");
		}
		else
		{
			System.out.println("Oops, you are allowed to take only kids books");
		}
		
	}
	
}
class AdultUser implements LibraryUser
{
	private int age;
	private String bookType;
	public AdultUser(int age, String bookType)
	{
		this.age=age;
		this.bookType=bookType;
	}
	
	@Override
	public void registerAccount() 
	{
		if(age>12)
		{
			System.out.println("You've successfully registerd under an Adult Account");
		}
		else
		{
			System.out.println("Sorry, Age must have greater than 12 to register as an adult");
		}
		
	}
	@Override
	public void requestBook() 
	{
		if(bookType=="Fiction")
		{
			System.out.println("Book issued successfully, please return within 7 days");
		}
		else
		{
			System.out.println("Oops, you're allowed to take only adult Fiction books");
		}
		
	}
	
}

public class Hndson4 
{
	public static void main(String args[])
	{
		KidUsers k1= new KidUsers(10, "kids");
		k1.registerAccount();
		k1.requestBook();
		AdultUser a1 = new AdultUser(23, "Fiction");
		a1.registerAccount();
		a1.requestBook();
	}
}
