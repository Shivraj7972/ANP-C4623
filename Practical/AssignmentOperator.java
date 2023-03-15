package Oprator;

import java.util.Scanner;

public class AssignmentOperator {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a First Number :");
		int num1=sc.nextInt();
		System.out.println("Enter a Second Number: ");
		int num2=sc.nextInt();
		
		String name="shiv";
		System.out.println(name);
		num1 += num2;
        System.out.println("Add = " + num1);
        num1 -= num2;
        System.out.println("sub = " + num1);
        num1 *= num2;
        System.out.println("mul = " + num1);
        num1 /= num2;
        System.out.println("div = " + num1);
        num1 %= num2;
        System.out.println("Mod = " + num1);
        
	}

}
