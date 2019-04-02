
public class Employee {
	private int id;
	private  String firstName;
	private String lastName;
	private int salary;
	public Employee(int id, String firstName, String lastName, int salary) {
		//super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getName()
	{
		return (firstName + lastName);
	}
	public int  getAnnualSalary()
	{
		return (salary*12);
	}
	public int raiseSalary(int percent)
	{
		return (salary* percent);
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", Name=" + firstName  + lastName + ", salary=" + salary
				+ "]";
	}
	
	
	
}
