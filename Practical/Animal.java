package corejava;

class Animal //parent class
{
	//method
	public void display() 
	{
		System.out.println("Inside Parent Class");
	}
	
}

//child Class
class Dog extends Animal
{
	public void sound() 
	{
		System.out.println("Barks.....");
	}

	public void run() {
		System.out.println("Run....");
	}
}
class Main
{
	public static void main(String[] args) 
	{
		Dog d=new Dog();  //creating object of a child class
		d.display();
		d.sound();
	    d.run();
	}
	
}