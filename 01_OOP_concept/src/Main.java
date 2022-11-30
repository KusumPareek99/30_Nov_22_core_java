
public class Main {
	
	public static void main(String[] args) {
		Student jack = new Student();
		jack.display();
		System.out.println("jack="+jack);
		
		Student john  = new Student(2,"John", 23);
		john.display();
		System.out.println("john="+john);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main2(String[] args) {
	  System.out.println("main method!!!!!!!");
	  Date d1 = new Date();
	  //d.init(1, 1, 2022);
	  d1.display();
	  
	  Date d2 = new Date(10,10,2022);
	  //d2.init(10,10,2022);
	  d2.display();
		
	}
	
	public static void example1() {
		/*Date today; //today is reference
		today = new Date();  //object is created by new
		today.init(30,11,2022);
		 System.out.println("day= "+today.dd); 
		System.out.println("day= "+today.getDd());
		
		Date tomorrow =  new Date(); // Date object is created and tomorrow is referencing to this object
		tomorrow.init(1, 12, 2022);
		//tomorrow.yy= 2023;
		tomorrow.setYy(2023);
		tomorrow.display();*/
	}

}
