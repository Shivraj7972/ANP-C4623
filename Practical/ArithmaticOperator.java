package Oprator;

import java.util.Scanner;

public class ArithmaticOperator {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a First Number :");
		int num1=sc.nextInt();
		System.out.println("Enter a Second Number: ");
		int num2=sc.nextInt();
		int sum=num1+num2;
		System.out.println("Sum: "+sum);
		sc.close();
	}

}
