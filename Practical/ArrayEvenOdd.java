package Arrays;

import java.util.Scanner;

public class ArrayEvenOdd 
{

	public static void main(String[] args) 
	{
		//create a Scanner to read user input
		Scanner sc=new Scanner(System.in);
		
		//enter the number of integers
		System.out.println("Enter the Size of Array: ");
		int numIntegers=sc.nextInt();
		
		//create an array to store the integers
		int []integers=new int[numIntegers];
		
		//enter the integers
		System.out.println("Enter a Number: ");
		for(int i=0; i<numIntegers; i++)
		{
			integers[i]=sc.nextInt();
		}
		
		//sum of all even numbers and the product of all odd numbers
		int sumEven=0;
		int productOdd=1;
		for(int i:integers) 
		{
			//even number
			if(i%2==0) 
			{
				sumEven = sumEven + i;
			}
			//odd number
			else
			{
				productOdd = productOdd * i;
			}
		}
		//display the results
		System.out.println("The sum of all even numbers is: " + sumEven);
	    System.out.println("The product of all odd numbers is: " + productOdd);
	}

}



/* OUTPUT:
 
 * Enter the Size of Array: 
	6
	Enter a Number: 
	25
	32
	15
	36
	47
	89
	The sum of all even numbers is: 68
	The product of all odd numbers is: 1568625
*/
