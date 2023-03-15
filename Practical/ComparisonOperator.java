package Oprator;

import java.util.Scanner;

public class ComparisonOperator 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a First Number :");
		int a=sc.nextInt();
		System.out.println("Enter a Second Number: ");
		int b=sc.nextInt();
		//Greater than
		System.out.println("a > b : " + (a > b)); 
		//Less than
		System.out.println("a < b : " + (a < b)); 
		//Greater than Equals too
	    System.out.println("a >= b : " + (a >= b)); 
	    //less than Equals too
	    System.out.println("a <= b : " + (a <= b)); 
	    //Equals too
		System.out.println("a == b : " + (a == b)); 
	    //Not Equals too
	    System.out.println("a != b : " + (a != b)); 

	}

}
