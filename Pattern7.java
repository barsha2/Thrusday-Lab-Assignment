package basicprograms;

public class Pattern7 
{
	public static void main(String args[])
	{
		int i,j,k;
		for ( i=1; i<=9; i=i+2)// i=1 1<9 3<9 
	     {
	         for( j=9; j>=i; j--) // j=9 9>1 9>3
	         {
	             System.out.print(" "); // 
	         }
	         for ( k=1; k<=i; k++)// k=1 1=1
	         {
	         System.out.print("* ");// 1 
	         }
	     System.out.println();
	     
	     }
	}
}
