package basicprograms;

import java.util.Scanner;

public class Armstrong 
{
	public static void main(String args[])
	{
		int n, num, sum ;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		n = sc.nextInt();
		 //153
		sum=arm(n);
		if(n==sum)
		{
			System.out.println("the number " + n + " is armstrong number");
		}
		else
		{
			System.out.println("The number " + n + " isn't armstrong number");
		}	
	}
	public static int arm(int r)
	{
		int num, rem, sum=0;
		while(r>0) // 153>0
		{
			rem = r%10; // 153%10=3
			num=rem*rem*rem; // 3*3*3
			r=r/10; // 153/10 = 15
			sum= sum+num; // 0+27
		}
		return sum;
	}
}
