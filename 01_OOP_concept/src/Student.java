
public class Student {
	private int rollno;
	private String name;
	private int age;

	public Student() {
		/*rollno = -1;
		name =" ";
		age = 18;*/
		this(-1," ",18); //this constructor must be first statment
	}
	
	public Student(int rollno, String name, int age) {
		this.rollno = rollno;
		this.name = name;
		this.age = age;  //variable shadowing
	}
	
	public void display() {
		System.out.println("\ndisplay="+this);
		System.out.println("student details: ");
		System.out.println("\tRoll no: "+this.rollno);
		System.out.println("\tName: "+name);
		System.out.println("\tAge: "+age);
		System.out.println();
	}
	
	public int getRollno() {
		return rollno;	
	}
	
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
}
