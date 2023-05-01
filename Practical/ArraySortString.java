package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySortString {

	public static void main(String[] args)
	{
		//create a Scanner object to read user input
		Scanner sc=new Scanner(System.in);
		
		//prompt the user to enter the number of strings
		System.out.println("Enter the size of array:");
		int a=sc.nextInt();
		
		//create an array to store the strings
		String []arr= new String[a];
		
		//prompt the user to enter the strings
		for(int i=0; i<a; i++)
		{
			System.out.println("Enter String : ");
			arr[i]=sc.next();		
		}
		
		//sort the strings in alphabetical order
		Arrays.sort(arr);
		
		//display the sorted strings
		System.out.println("Sorted Array:");
		for(String i:arr)
		{
			System.out.println(i+"  ");
		}
	}
}
