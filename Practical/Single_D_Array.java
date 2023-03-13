package Arrays;

import java.util.Scanner;

class Single_D_Array
{
   public static void main(String[] args) 
   {
	   Scanner input = new Scanner(System.in);
	   int[] numbers = new int[5]; // declaring an integer array with size 5
	      
	   // taking input from user and assigning it to array elements
	   System.out.println("Enter 5 numbers:");
	   for (int i = 0; i < numbers.length; i++) 
	   {
		   numbers[i] = input.nextInt();
	   }
	      
	   // printing the values of array elements
	   System.out.println("Array elements are:");
	   for (int i = 0; i < numbers.length; i++) 
	   {
	       System.out.println("Element at index " + i + ": " + numbers[i]);
	   }
     
   }
}