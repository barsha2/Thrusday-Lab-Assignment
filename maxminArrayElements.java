package array;

import java.util.Scanner;

public class maxminArrayElements 
{
	public static void main(String args[])
	{
		int i, size, arr[] ;
		Scanner r = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		size = r.nextInt(); //5
		
		arr=new int[size];
		
		System.out.println("Enter elements in the array: ");
		
		for(i=0; i<size; i++)
		{
			arr[i]=r.nextInt(); //44 36 78 66 98
			
		}
		
		int min = arr[0];
		int max = arr[0];
		//finding max and min element in the array
		for(i=0; i<size; i++) // 45 36 78 66 98
		{
			if(arr[i]>max) //45>45 36>45 78>44 66>78 98>78
			{
				max=arr[i];  // 78 98
			}
			
		}
		System.out.println("The maximum array element is " + max);
		for(i=0; i<size; i++)
		{
			if(arr[i]<min) // 44>44 36>
			{
				min=arr[i]; // 36 
			}
		}
		System.out.println("The minimum array element is " + min);
        
	}
}
