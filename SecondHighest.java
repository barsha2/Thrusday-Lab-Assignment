package array;

import java.util.Scanner;

public class SecondHighest 
{
	public static void main(String args[])
	{
		int size, i,j, temp, a[];
		
		Scanner s= new Scanner(System.in);
		
		System.out.println("Enter the size of the array: ");
		size=s.nextInt();
		
		a=new int[size];
		System.out.println("Enter " +size+ " elements in the array: ");
		for(i=0; i<size; i++)
		{
			a[i]=s.nextInt();
		}
		System.out.println("The array is: ");
		for(i=0; i<size; i++)
		{
			System.out.println(a[i]+ " ");
		}
		//sorting the array in ascending order
		for(i=0; i<size; i++)
		{
			for(j=i+1; j<size; j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("The second highest element of the array is "+ a[size-2]);
	}
}
