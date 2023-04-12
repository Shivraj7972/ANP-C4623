package Exception;

public class MyThread extends Thread 
{
	public void run() 
	{
		for(int i=1; i<=5; i++)
		{
			System.out.println("Thread"+Thread.currentThread().getId()+":"+i);
			try 
			{
				Thread.sleep(1000);
			}catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}
}
class ThreadEx
{
	public static void main(String[] args) 
	{
		//create and start 3 threads
		MyThread t1 =new MyThread();
		MyThread t2 =new MyThread();
		MyThread t3 =new MyThread();
		t1.start();  //to start the thread excution 
		t2.start();
		t3.start();
		
		//wait for all threads to finish 
		try 
		{
			t1.join();
			t2.join();
			t3.join();
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		System.out.println("All Threads Finished ");
	}
}

