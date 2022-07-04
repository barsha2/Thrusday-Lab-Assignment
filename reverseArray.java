package array;

import java.util.Scanner;

public class reverseArray 
{
	public static void main(String args[])
	{
		int i;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of the array: ");
		int size = sc.nextInt();
		int a[]= new int[size];
		System.out.println("Enter " +size+ " elements in the array");
		for(i=0; i<size; i++)
		{
			a[i]= sc.nextInt();
			
		}
		//reversing array
		System.out.println("The arary in reverse order is: ");
		for(i=size-1; i>=0; i--)
		{
			System.out.println(a[i]);
		}
	}
}
