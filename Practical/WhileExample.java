package corejava;

import java.util.Scanner;

public class WhileExample 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int n = scanner.nextInt();

        System.out.print("Even numbers from 2 to " + n + ": ");
        //start with 2
        int i = 2;
        //loop until i is greater than n
        while (i <= n) 
        {
            System.out.print(i + " ");
            //increment i by 2
            i += 2; 
        }
    }
}
