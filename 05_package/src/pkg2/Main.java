package pkg2;


import static pkg1.Employee.noOfEmployees;
import pkg1.Employee;
import pkg1.Student;

import static java.lang.System.out;

public class Main {
	public static void main(String[] args) {
		Employee emp1  = new Employee();
		Employee emp2  = new Employee(2,"Jack",3000,20);
		out.println("No of employees: "+noOfEmployees());		
		Student stud1 = new Student();
		
		pkg3.Employee emp3 = new pkg3.Employee();
	}

}
