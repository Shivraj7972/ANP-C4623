package corejava;

interface MyInterface 
{
	public void dosomething();
}
class MyClass implements MyInterface
{
	public void dosomething()
	{
		System.out.println("Doing Something!");
	}
}
class MyMain
{
	public static void main(String[] args)
	{
		MyClass mc=new MyClass();
		mc.dosomething();
	}
	
}
