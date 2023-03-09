package corejava;

import java.util.Scanner;

public class PrimeOrNot 
{

  public static void main(String[] args)
  {
	  //Ask the user to enter a number
	  Scanner sc = new Scanner(System.in);
      System.out.print("Enter a number: ");
      int n = sc.nextInt();
      sc.close();

      boolean isPrime = true;
      //Start checking divisors from 2
      int i = 2;
      do {
    	  //If n is divisible by i, it is not prime
    	  if (n % i == 0) 
    	  {
    		  isPrime = false;
    		  //Exit the loop early
    		  break;
    	  }
    	  i++;
      } while (i < n);
      //Print the result based on whether isPrime is true or false
      if (isPrime) 
      {
    	  System.out.println("Prime");
      } 
      else 
      {
    	  System.out.println("Not prime");
      }
  }
}
