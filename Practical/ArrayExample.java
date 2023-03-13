package Arrays;

import java.util.Scanner;

public class ArrayExample 
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		int total;
		double per;
		int[] marks=new int[5];
		System.out.println("Enter 5 Subject marks");
		 for (int i = 0; i < marks.length; i++)
		 {
			 marks[i] = sc.nextInt();
		 }
		 total = 0;
	     for(int i=0; i<marks.length; i++) 
	     {
	         total = total + marks[i];
	     }
	     System.out.println("Total of 5 Subjects: "+total);
	     per=total/marks.length;
	     System.out.println("Percentage: "+per);
	     
	}
}
