package corejava;

public class TestEncapsulation 
{

	public static void main(String[] args) 
	{
		//Creating Object of class EncapsulationExample
		EncapsulationExample ee=new EncapsulationExample();
		
		//object is used to access the methods of a class
		ee.setId(1);
		ee.setName("Shiv");
		System.out.println("Id:"+ee.getId()+"\n"+"Name:"+ee.getName());
	}

}
