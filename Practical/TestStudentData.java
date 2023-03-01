package corejava;

public class TestStudentData 
{

	public static void main(String[] args) 
	{
		//Creating Object of class StudentData
		StudentData sd=new StudentData();
		
		//object is used to access the methods of a class
		sd.setId(1);
		sd.setName("Shiv");
		sd.setAge(21);
		System.out.println("Id:"+sd.getId()+"\n"+"Name:"+sd.getName()+"\n"+"Age:"+sd.getAge());

	}

}
