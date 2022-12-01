
public class Student {

	private int rollno; // instance variable
	private String name;
	private int age;
	private static String collegeName; // class variable
	
	static {
		System.out.println("static block 1 called!!!!!!!!");
		
		collegeName = "Dy Patil";
	}
	
	static {
		System.out.println("static block 2 called!!!!!!!!");
	}

	public Student() {
		System.out.println("default constructor called!!");
	}

	public Student(int rollno, String name, int age) {
		System.out.println("parameterized constructor called");
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public static String getCollegeName() {
		return collegeName;
	}

	public static void setCollegeName(String collegeName) {
		Student.collegeName = collegeName;
	}

}
