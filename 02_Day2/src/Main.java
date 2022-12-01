
public class Main {

	public static void main(String[] args) {
		//studentDemo();
		overloadingDemo();
	}
	
	public static void overloadingDemo() {
		Math math = new Math();
		long l1 = 1;
		long l2 = 2;
		math.add(1L, 2L);  //int -> long -> float -> double
		//math.add(1, 2,3);
		//math.add(1,2,3,4);
		//math.add(1.2, 2.3);
	}
	
	public static void studentDemo() {
		Student stud1 = new Student(1, "Jack", 20);
		Student stud2 = new Student(2, "Jackson", 23);
		Student stud3 = new Student(3, "Jackie", 29);

		
		System.out.println(Student.getCollegeName());
	}

}
