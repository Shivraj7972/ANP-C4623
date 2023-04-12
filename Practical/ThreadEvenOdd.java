package Exception;

import Exception.ThreadPriorityExample.MyThread;

public class ThreadEvenOdd 
{
    public static void main(String[] args) 
    {
        // Create two threads
    	EvenThread evenThread = new EvenThread();
        OddThread oddThread = new OddThread();
        
        
        // Start both threads
        oddThread.start(); 
        evenThread.start();
    }
}

class EvenThread extends Thread 
{
    public void run() 
    {
        for (int i = 2; i <= 10; i += 2) 
        {
            System.out.println("Even Number : "+i);
            try 
            {
                Thread.sleep(1000); // Sleep for 1 seconds
            } 
            catch (InterruptedException e) 
            {
                e.printStackTrace();
            }
        }
    }
}

class OddThread extends Thread 
{
    public void run() 
    {
        for (int i = 1; i <= 9; i += 2) 
        {
            System.out.println("Odd Number : "+i);
            try 
            {
                Thread.sleep(1000); // Sleep for 1 seconds
            } catch (InterruptedException e) 
            {
                e.printStackTrace();
            }
        }
    }
}
