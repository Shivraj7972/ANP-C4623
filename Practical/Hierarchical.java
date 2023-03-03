package corejava;

class Hierarchical //parent class
{
	//method
	public void display() 
	{
		System.out.println("Inside Parent Class");
	}
	
}

//child Class
class Doggy extends Hierarchical
{
	public void bark() 
	{
		System.out.println("Barks.....");
	}
}
class Cats extends Hierarchical
{
	public void meow()
	{
		System.out.println("Meow.....");
	}
}
class Mainhierar
{
	public static void main(String[] args) 
	{
		Doggy d=new Doggy();  //creating object of a child class
		d.display();
		d.bark();
		Cats c=new Cats();
		c.display();
		c.meow();
	}
	
}