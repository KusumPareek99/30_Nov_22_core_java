
public class Date {
	// data member/instance variable
	private int dd;
	private int mm;
	private int yy;

	// default constructor
	public Date() {
		System.out.println("Date default constructor!");
		dd = 1;
		mm = 1;
		yy = 2022;
	}
	
	//parameterized constructor
	public Date(int d, int m, int y) {
		System.out.println("paramterized constuctor called...");
		dd = d;
		mm = m;
		yy = y;
	}

	public void display() {
		System.out.println(dd + "/" + mm + "/" + yy);
	}

	public int getDd() {
		return dd;
	}

	public void setDd(int d) {
		dd = d;
	}

	public void setYy(int y) {
		yy = y;
	}

}
