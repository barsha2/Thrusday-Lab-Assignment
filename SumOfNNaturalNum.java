package basicprograms;

import java.util.Scanner;

public class SumOfNNaturalNum 
{
	public static void main(String args[])
	{
		int n, sum=0, i=1;
		System.out.println("Enter number: ");
		Scanner sc = new Scanner(System.in);
		n= sc.nextInt();
		while(i<=n)
		{
			sum=sum+i;
			i++;
			
		}
		System.out.println("Sum of First" +n+ "Natural Numbers is = " + sum);  
	}
	
	
}
