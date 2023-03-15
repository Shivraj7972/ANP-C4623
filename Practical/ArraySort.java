package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySort {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int a=sc.nextInt();
		int []arr= new int[a];
		System.out.println("Enter the elements: ");
		for(int i=0; i<a; i++)
		{
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);  //it sorts the array in assending array 
		System.out.println("Sorted Array:");
		for(int i:arr)  //for each loop it iterate i value
		{
			System.out.println(i+"  ");
		}
		
	}

}
