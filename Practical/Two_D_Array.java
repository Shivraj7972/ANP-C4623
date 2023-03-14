package Arrays;

import java.util.Scanner;

public class Two_D_Array {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		//get the dimensions of the array from the user
		System.out.println("enter the number of rows");
		int r=sc.nextInt();
		System.out.println("enter the number of columns");
		int c=sc.nextInt();
		
		//create a array with the user specified dimensions
		int[][] arr=new int[r][c];
		
		//get the values for the array from the user
		System.out.println("Enter the values for the array: ");
		for(int i=0; i<r; i++)  //i acts as a row
		{
			for(int j=0; j<c; j++)	//j acts as a columns
			{
				System.out.printf("Enter the values for element(%d,%d):",i,j);  //%d is format
				arr[i][j]=sc.nextInt();
			}
		}
		//print output of the array
		System.out.println("The Array is: ");
		for(int i=0; i<r; i++)  
		{
			for(int j=0; j<c; j++)
			{
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		
		}
		
	}
}
