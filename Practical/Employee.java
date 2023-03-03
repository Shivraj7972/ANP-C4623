package corejava;

class Employee 
{
	private String name;
	private int id;
	private double salary;
	public Employee(String name, int id, double salary) {
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public int getId() {
		return id;
	}
	public double getSalary() {
		return salary;
	}
	public void displayDetails() 
	{
		System.out.println("Name: "+name);
		System.out.println("ID: "+id);
		System.out.println("Salary: "+salary);
		
	}
}
class Manager extends Employee
{
	private String mail;

	public Manager(String name, int id, double salary, String mail) {
		super(name, id, salary);
		this.mail = mail;
	}

	public String getMail() {
		return mail;
	}

	@Override
	public void displayDetails()
	{
		super.displayDetails();
		System.out.println("Mail:"+mail);
	}
	
}
class Clerk extends Employee
{
	private Long phoneNo;

	public Clerk(String name, int id, double salary, Long phoneNo) {
		super(name, id, salary);
		this.phoneNo = phoneNo;
	}

	public Long getPhoneNo() {
		return phoneNo;
	}
	
	@Override
	public void displayDetails()
	{
		super.displayDetails();
		System.out.println("Phone Number: " +phoneNo);
	}
	
}
class mainEmployee
{
	public static void main(String[] args) 
	{
		Manager m=new Manager("Shivraj", 101, 10000.0, "shiv@gmail.com");
		m.displayDetails();
		Clerk c=new Clerk("shiv", 102, 15000.0, 7972210110L);
		m.displayDetails();
	}
}