package array;

import java.util.Scanner;

public class evenoddElements 
{
	public static void main(String args[])
	{
		int i,j=0, k=0;
		int arr[]= new int[6];
		int a[]= new int[6];
		int b[]= new int[6];
		Scanner r = new Scanner (System.in);
		
		
		
		System.out.println("enter elements in the array: ");
		for(i =0; i<arr.length; i++)
		{
			arr[i]= r.nextInt();
		}
		for(i =0; i<arr.length; i++)
		{
			System.out.println(arr[i]);
		}
		for(i=0; i<arr.length; i++)
		{
			if(arr[i]%2==0)
			{
				a[j] = arr[i];
				j++;
			}
			else
			{
				b[k]=arr[i];
				k++;
			}
		}
		for(i=0; i<a.length;i++)
		{
			System.out.println("a: "+a[i]);
		}
		for(i=0; i<a.length;i++)
		{
			System.out.println("b: " +b[i]);
		}
		
	}
}
