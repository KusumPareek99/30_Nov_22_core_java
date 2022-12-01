package pkg1;

public class Employee {
	public int id;
	protected String name;
	double salary;
	private double age;
	private static int count;

	public Employee() {
		// TODO Auto-generated constructor stub
		++count;
	}

	public Employee(int id, String name, double salary, double age) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.age = age;
		++count;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double getAge() {
		return age;
	}

	public void setAge(double age) {
		this.age = age;
	}
	
	public static int noOfEmployees() {
		return count;
	}

}
