package array;

import java.util.Scanner;

public class TransposeArray 
{
	public static void main(String args[])
	{
		int row, col, i, j, a[][], t[][];
		
		Scanner trans = new Scanner(System.in);
		
		System.out.println("Enter number of rows:" );
		row=trans.nextInt();
		
		System.out.println("Enter number of coloumns: ");
		col=trans.nextInt();
		
		a=new int[row][col];
		t=new int[col][row];
		
		System.out.println("enter array elements");
		
		for(i=0; i<row; i++)
		{
			for(j=0; j<col; j++)
			{
				a[i][j]=trans.nextInt();
			}
		}
		System.out.println("The matrix is: ");
		for(i=0; i<row; i++)
		{
			for(j=0; j<col; j++)
			{
				System.out.print(a[i][j]+ " ");
			}
			System.out.println();
		}
		
		//transpose the matrix
		for(i=0; i<row; i++)
		{
			for(j=0; j<col; j++)
			{
				t[j][i]=a[i][j];
			}
		}
		System.out.println("The transpose matrix is: ");
		for(i=0; i<row; i++)
		{
			for(j=0; j<col; j++)
			{
				System.out.print(t[i][j]+ " ");
			}
			System.out.println();
		}
	}
}
