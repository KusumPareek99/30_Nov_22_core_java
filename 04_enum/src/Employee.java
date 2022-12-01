
public class Employee {

	private int id;
	private String name;
	private double salary;
	private Gender gender;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int id, String name, double salary, Gender gender) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.gender = gender;
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

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public void display() {
		System.out.println("id=" + id + ", name=" + name + ", salary=" + salary + ", gender=" + gender);
	}

}
