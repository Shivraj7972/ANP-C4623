package Exception;

public class ThreadPriorityExample
{

    public static void main(String[] args) 
    {
        // Create three threads
        Thread thread1 = new MyThread("Thread 1");
        Thread thread2 = new MyThread("Thread 2");
        Thread thread3 = new MyThread("Thread 3");

        // Set different priorities for each thread
        thread1.setPriority(Thread.MAX_PRIORITY); // Highest priority:10
        thread2.setPriority(Thread.NORM_PRIORITY); // Normal priority (default):5
        thread3.setPriority(Thread.MIN_PRIORITY); // Lowest priority:1

        // Start the threads
        thread1.start();
        thread2.start();
        thread3.start();
    }
    static class MyThread extends Thread
    {
    	public MyThread(String name)
        {
            super(name); // Allocates a new thread object
        }
    	 @Override
         public void run()
         {
    		 for (int i = 1; i <= 5; i++)
             {
                 System.out.println(getName() + ": " + i);
                 try 
                 {
                     Thread.sleep(1000); // Sleep for 1 second
                 } 
                 catch (InterruptedException e) 
                 {
                     e.printStackTrace();
                 }
             }    

         }


    }

}
