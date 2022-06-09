package basicprograms;

import java.util.Scanner;

public class Lastdigit 
{
	public static void main(String args[])
	{
		int n,lastdigit=0, firstdigit=0;
		System.out.println("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		lastdigit = n%10;
		System.out.println("The last digit of a number is "+lastdigit);
		while(n!=0)
		{
			firstdigit=n%10;
			n = n/10;
		}
		System.out.println("The first digit of a number is "+firstdigit);
	}
	
}
