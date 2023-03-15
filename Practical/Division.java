package Oprator;

import java.util.Scanner;

public class Division {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a First Number :");
		int num1=sc.nextInt();
		System.out.println("Enter a Second Number: ");
		int num2=sc.nextInt();
		int div=num1/num2;
		System.out.println("Division of "+num1+ " and " +num2+ " is: " +div);
		sc.close();
	}

}