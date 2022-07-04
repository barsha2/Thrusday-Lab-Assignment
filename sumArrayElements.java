package array;

import java.util.Scanner;

public class sumArrayElements 
{
	public static void main(String args[])
	{
		int size, arr[], i, sum=0;
		System.out.println("Enter the size of the array: ");
		Scanner r = new Scanner(System.in);
		size = r.nextInt();
		 arr=new int[size];
		System.out.println("Enter array elements: ");
		for(i=0; i<size;i++)
		{
			arr[i]= r.nextInt();
		}
		for(i=0; i<size; i++)
		{
			sum= arr[i]+sum;
		}
		System.out.println("The sum of array elemnts is: "+ sum);
	}
}
