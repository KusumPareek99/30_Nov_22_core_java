
public class Main {

	public static void main(String[] args) {
		Employee emp = new Employee(1, "Jack", 5000, Gender.FEMALE);
		emp.display();

		Weekday day = Weekday.WED;
		System.out.println("day= " + day.getDay());
		// System.out.println(day.getName());

		// valueOf => string to enum type
		Weekday day1 = Weekday.valueOf("MON");
		System.out.println(day1);
		printLine();

		// iterate the enum elements
		Weekday[] days = Weekday.values();
		for (Weekday d : days) {
			System.out.println("Ordinal: " + d.ordinal() + "  name:" + d.name() + "  day:" + d.getDay());
		}
		
		printLine();
		//from day => weekday
		Weekday day3 = Weekday.getWeekday(3);
		System.out.println(day3);

	}
	
    public static void printLine() {
    	System.out.println("_____________________________________________");
    }
    
    public static boolean isWeekend(Weekday day) {
    	switch(day) {
    	case SAT:
    	case SUN:
    		return true;
    	 default:
    		 return false;
    	}
    }
}
