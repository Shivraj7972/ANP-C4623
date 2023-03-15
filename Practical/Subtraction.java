package Oprator;

import java.util.Scanner;

public class Subtraction {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a First Number :");
		int num1=sc.nextInt();
		System.out.println("Enter a Second Number: ");
		int num2=sc.nextInt();
		int subtraction=num1-num2;
		System.out.println("subtraction: "+subtraction);
		sc.close();
	}

}
