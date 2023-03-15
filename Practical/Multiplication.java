package Oprator;

import java.util.Scanner;

public class Multiplication {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a First Number :");
		int num1=sc.nextInt();
		System.out.println("Enter a Second Number: ");
		int num2=sc.nextInt();
		int mul=num1*num2;
		System.out.println("Multiplation of "+num1+ " and " +num2+ " is: " +mul);
		sc.close();
	}

}
