package studentMgmtSystem;

import static org.junit.Assert.assertNull;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import com.studentMgmtSystem.dao.StudentDao;
import com.studentMgmtSystem.model.Student;

public class StudentDaoTest 
{
	@Test
	public void saveStudent()
	{
		StudentDao dao = new StudentDao();
		Student student = new Student();
		student.setName("Shivraj");
		student.setEmail("abc@gmail.com");
		Assert.assertEquals("Shivraj", student.getName());
		Assert.assertEquals("abc@gmail.com", student.getEmail());
		dao.saveStudent(student);
		
		Student student1 = new Student();
		student1.setName("raj");
		student1.setEmail("xyz@gmail.com");
		Assert.assertEquals("raj", student1.getName());
		Assert.assertEquals("xyz@gmail.com", student1.getEmail());
		dao.saveStudent(student1);
		
		
	}
	
	@Test
	public void testUpdateStudent() {
	    StudentDao dao = new StudentDao();
	    Student student = new Student();
	    student.setName("John");
	    student.setEmail("john@example.com");
	    dao.saveStudent(student);

	    // Retrieve the student from the database
	    List<Student> students = dao.getAllStudents();
	    Student retrievedStudent = students.get(0);

	    // Update the student's name and email
	    retrievedStudent.setName("Jane");
	    retrievedStudent.setEmail("jane@example.com");
	    dao.updateStudent(retrievedStudent);

	    // Retrieve the updated student from the database
	    students = dao.getAllStudents();
	    Student updatedStudent = students.get(0);

	    Assert.assertEquals("Jane", updatedStudent.getName());
	    Assert.assertEquals("jane@example.com", updatedStudent.getEmail());
	}
	
	@Test
	public void testDeleteStudent() {
		StudentDao dao = new StudentDao();
	    Student student = new Student();
	    student.setName("John Doe");
        student.setEmail("abc@gmail.com");
        dao.saveStudent(student);
	    dao.deleteStudent(student);
	    
	    Student deletedStudent = dao.getStudentById(student.getId());
	    assertNull(deletedStudent);
	}


	

	
	
	

}
