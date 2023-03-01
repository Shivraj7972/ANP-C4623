package corejava;

public class TestStudentData 
{

	public static void main(String[] args) 
	{
		//Creating Object of class StudentData
		StudentData sd=new StudentData();
		
		//object is used to access the methods of a class
		sd.setId(01);
		sd.setName("Shiv");
		sd.setAge(21);
		System.out.println("Student Data");
		System.out.println("Student Id: "+sd.getId());
		System.out.println("Student Name: "+sd.getName());
		System.out.println("Student Age: "+sd.getAge());

	}

}
